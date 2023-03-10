public class EditorVideo extends Funcionario{
    public double getBonificacao(){
        System.out.println("sou um editor de video");
        return super.getBonificacao() +100;
    }
}
