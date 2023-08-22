abstract class Bola implements Lancavel {
    private String nomeDaMarca;

    public Bola(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }

    public String getNomeDaMarca() {
        return this.nomeDaMarca;
    }

    abstract void quicar();
}
