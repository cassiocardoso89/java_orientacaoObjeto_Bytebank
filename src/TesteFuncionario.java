public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario cassio = new Funcionario();
        cassio.setNome("cassio cardoso");
        cassio.setCpf("123.456.789.00");
        cassio.setSalario(2600.00);

        System.out.println(cassio.getNome());
        cassio.setSalario(cassio.getBonificacao());
    }
}
