import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;

public class EscreverArquivo {

    public void registrarCandidato(Cadastro cadastro){
        try{
            //Instanciando objetos
            StringBuilder conteudo = new StringBuilder();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String conteudoFinal;

            //Formando linha
            conteudo.append(cadastro.getNome() + ";");
            conteudo.append(cadastro.getCpf() + ";");
            conteudo.append(formatter.format(cadastro.getDataNascimento())+ ";");
            conteudo.append(cadastro.getSexo() + ";");
            conteudo.append(cadastro.getLogradouro() + ";");
            conteudo.append(cadastro.getNumero() + ";");
            conteudo.append(cadastro.getBairro() + ";");
            conteudo.append(cadastro.getComplemento() + ";");
            conteudo.append(cadastro.getCidade() + ";");
            conteudo.append(cadastro.getEstado() + ";");
            conteudo.append(cadastro.getEmail() + ";");
            conteudo.append(cadastro.getTelefone() + ";");
            conteudo.append(cadastro.getCelular() + ";");
            conteudo.append(cadastro.isCelularWhats() == true ? "SIM;" : "NÃO;");
            conteudo.append(cadastro.getProfissao() + ";");
            conteudo.append(cadastro.getEmpresa() + ";");
            conteudo.append(cadastro.getSalario() + ";");
            conteudo.append(cadastro.isEmpregoAtual() == true ? "SIM;" : "NÃO;");
            conteudo.append(cadastro.getPretencaoMinima() + ";");
            conteudo.append(cadastro.getPretencaoMaxima() + ";");
            conteudo.append(cadastro.getHabilidades());
            conteudo.append(System.lineSeparator());

            conteudoFinal = conteudo.toString().replace("null", " "); //Substituindo dados nulos por espaços vazios

            Path diretorio = Paths.get(System.getProperty("user.dir") + "\\arquivos");//criando caminho do diretorio
            Path arquivo = Paths.get(diretorio+"\\candidatos.csv");//criando caminho do arquivo

            if(!Files.exists(diretorio)) //criando o diretorio se não existir
                Files.createDirectory(diretorio);

            if(!Files.exists(arquivo)){ //criando o arquivo com cabeçalho se não existir
                Files.createFile(arquivo);
                String cabecalho = "NOME;CPF;DATA_NASCIMENTO;SEXO;LOGRADOURO;NUMERO;BAIRRO;COMPLEMENTO;" +
                        "CIDADE;ESTADO;EMAIL;TELEFONE;CELULAR;CELULAR_WHATS;PROFISSAO;EMPRESA;SALARIO;" +
                        "EMPREGO_ATUAL;PRETENCAO_MINIMA;PRETENCAO_MAXIMA;HABILIDADES"+System.lineSeparator();
                Files.write(arquivo, cabecalho.getBytes(StandardCharsets.UTF_8),  StandardOpenOption.APPEND);
            }

            //Escrevendo a linha(candidato) no arquivo
            Files.write(arquivo, conteudoFinal.getBytes(StandardCharsets.UTF_8),  StandardOpenOption.APPEND);

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
