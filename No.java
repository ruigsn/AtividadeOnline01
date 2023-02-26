public class No {

    protected Contato info;
    protected No proximo;
    protected No anterior;

    public Contato getInfo() {
        return info;
    }

    public void setInfo(Contato info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }


}
