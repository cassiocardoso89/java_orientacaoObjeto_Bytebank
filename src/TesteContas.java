public class TesteContas {

    public static void main(String[] args) {
        Conta conta = new Conta(1337,23334);
        conta.Deposita(200.0);
        System.out.println(conta.getSaldo());

        conta.setAgencia(570);
        System.out.println(conta.getAgencia());
        System.out.println("O total de contas criadas é: " + Conta.getTotal());
    }

}