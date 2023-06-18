import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        EscreverArquivo registro = new EscreverArquivo();
        Cadastro candidato1 = new Cadastro();
        Cadastro candidato2 = new Cadastro();
        Cadastro candidato3 = new Cadastro();

        candidato1.setNome("João Silva");
        candidato1.setCpf("123.456.789-00");
        candidato1.setDataNascimento(LocalDate.parse("01/05/1995", formatter));
        candidato1.setSexo(SexoEnum.MASCULINO);
        candidato1.setLogradouro("Rua das 9");
        candidato1.setNumero("123");
        candidato1.setBairro("Centro");
        candidato1.setComplemento("Entre a Rua 8 e 10");
        candidato1.setCidade("São Paulo");
        candidato1.setEstado("SP");
        candidato1.setEmail("joao@example.com");
        //candidato1.setTelefone(1234567890L); anulando campo de propósito
        candidato1.setCelular(9876543210L);
        candidato1.setCelularWhats(true);
        candidato1.setProfissao("Programador");
        candidato1.setEmpresa("ABC Company");
        candidato1.setSalario(5000.0);
        candidato1.setEmpregoAtual(true);
        candidato1.setPretencaoMinima(4000.0);
        candidato1.setPretencaoMaxima(7000.0);
        candidato1.setHabilidades("Java, Python, SQL");

        registro.registrarCandidato(candidato1);

        candidato2.setNome("Maria Souza");
        candidato2.setCpf("987.654.321-00");
        candidato2.setDataNascimento(LocalDate.parse("20/05/1995", formatter));
        candidato2.setSexo(SexoEnum.FEMININO);
        candidato2.setLogradouro("Avenida das Palmeiras");
        candidato2.setNumero("456");
        candidato2.setBairro("Jardim Bela Vista");
        candidato2.setComplemento("Próximo ao Shopping");
        candidato2.setCidade("Rio de Janeiro");
        candidato2.setEstado("RJ");
        candidato2.setEmail("maria@example.com");
        candidato2.setTelefone(1111111111L);
        candidato2.setCelular(2222222222L);
        candidato2.setCelularWhats(true);
        candidato2.setProfissao("Engenheira");
        candidato2.setEmpresa("XYZ Engenharia");
        candidato2.setSalario(8000.0);
        candidato2.setEmpregoAtual(true);
        candidato2.setPretencaoMinima(7000.0);
        candidato2.setPretencaoMaxima(10000.0);
        candidato2.setHabilidades("AutoCAD, Python, Gestão de Projetos");

        registro.registrarCandidato(candidato2);

        candidato3.setNome("Carlos Oliveira");
        candidato3.setCpf("555.555.555-55");
        candidato3.setDataNascimento(LocalDate.parse("20/05/1995", formatter));
        candidato3.setSexo(SexoEnum.MASCULINO);
        candidato3.setLogradouro("Rua dos Pinheiros");
        candidato3.setNumero("789");
        candidato3.setBairro("Centro");
        candidato3.setComplemento("Sala 202");
        candidato3.setCidade("Belo Horizonte");
        candidato3.setEstado("MG");
        candidato3.setEmail("carlos@example.com");
        candidato3.setTelefone(3333333333L);
        candidato3.setCelular(4444444444L);
        candidato3.setCelularWhats(false);
        candidato3.setProfissao("Advogado");
        candidato3.setEmpresa("Advocacia Silva");
        candidato3.setSalario(6000.0);
        candidato3.setEmpregoAtual(false);
        candidato3.setPretencaoMinima(5000.0);
        candidato3.setPretencaoMaxima(8000.0);
        candidato3.setHabilidades("Direito Civil, Negociação, Redação Jurídica");

        registro.registrarCandidato(candidato3);
    }
}