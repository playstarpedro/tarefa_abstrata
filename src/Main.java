public class Main {
    public static void main(String args[]) {

        // Criando uma pessoa fisica
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf(12345);
        pessoaFisica.setNome("Pedro");

        // Criando uma pessoa juridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj(54321);
        pessoaJuridica.setNome("EBAC");

        verificaTipoDePessoa(pessoaFisica);
        verificaTipoDePessoa(pessoaJuridica);
    }

    private static void verificaTipoDePessoa(Pessoa pessoa) {
        if (pessoa instanceof PessoaJuridica) {
            System.out.println("A pessoa: " + pessoa.getNome() + " é uma PESSOA JURIDICA");
        } else if (pessoa instanceof PessoaFisica) {
            System.out.println("A pessoa: " + pessoa.getNome() + " é uma PESSOA FISICA");

        }
    }
}