public class Lista {

    private No inicio;

    private No ultimo;
    private int tamanho;

    public void inserir(Contato info){
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public Contato buscar(int codigo){
        No no = inicio;
        while (no != null){
            if (no.info.codigo == codigo){
                return no.info;
            }
            no = no.proximo;
        }
        return null;
    }
    public Contato buscar(String nome){
        No no = inicio;
        while (no != null){
            if (no.info.nome == nome){
                return no.info;
            }
            no = no.proximo;
        }
        return null;
    }
    public Contato remover(String nome){
        No no = inicio;
        No noAtual = inicio;
        if (no.info.nome.equalsIgnoreCase(nome)){
            setInicio(no.getProximo());
            no.setInfo(null);
        } else {
            while (!no.info.nome.equalsIgnoreCase(nome)){
                noAtual = no;
                no = no.getProximo();
                no.setAnterior(noAtual);
            }
            noAtual.setProximo(no.getProximo());
            no.setInfo(null);
        }
        return null;
    }
    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String toString(){
        String out = "";
        No no = inicio;
        while (no != null){
            out += no.info + " ";
            no = no.proximo;
        }
        return out;
    }


}
