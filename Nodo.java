public class Nodo {
    private String texto;
    private Nodo sim;
    private Nodo nao;

    public Nodo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public Nodo getSim() {
        return sim;
    }

    public Nodo getNao() {
        return nao;
    }

    public void setSim(Nodo sim) {
        this.sim = sim;
    }

    public void setNao(Nodo nao) {
        this.nao = nao;
    }

    public boolean isRespostaFinal() {
        return (this.sim == null && this.nao == null);
    }
}
