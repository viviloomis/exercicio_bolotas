public class BolaDeFutebol extends Bola {
    public BolaDeFutebol(String nomeDaMarca) {
        super(nomeDaMarca);
    }

    @Override
    public void lancar() {
        System.out.println("Bola da marca " + getNomeDaMarca() + " lançada!");
    }

    @Override
    public void quicar() {
        System.out.println("Bola da marca " + getNomeDaMarca() + " quicando!");
    }
}