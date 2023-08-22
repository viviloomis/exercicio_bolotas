public class TesteBolas {
    public static void main(String[] args) {
        Pedra pedregulho = new Pedra();
        pedregulho.lancar();
       
        BolaDeBoliche fernanda = new BolaDeBoliche ("Storm");
        fernanda.lancar();
        fernanda.quicar();

        BolaDeFutebol juliane = new BolaDeFutebol("Nike");
        juliane.lancar();
        juliane.quicar();
    }
}