public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Fulano");
        g1.setSalario(5000.00);

        Funcionario f1 = new Funcionario();
        f1.setNome("Ciclano");
        f1.setSalario(2000);

        EditorVideo ev1 = new EditorVideo();
        ev1.setNome("Beltrano");
        ev1.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(ev1);

        System.out.println(controle.getSoma());
    }
}
