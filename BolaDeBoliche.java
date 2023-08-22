public class BolaDeBoliche extends Bola {
    public BolaDeBoliche(String nomeDaMarca) {
        super(nomeDaMarca);
    }

    @Override
    public void lancar() {
        System.out.println("Bola de boliche da marca " + getNomeDaMarca() + " lançada!");
    }

    @Override
    public void quicar() {
        System.out.println("Bola de boliche não quica!");
    }
}
