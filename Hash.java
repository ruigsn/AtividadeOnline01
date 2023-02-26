public class Hash {

    protected int operador;
    protected Lista[] vetor;

    public Hash(int operador) {
        this.operador = operador;
        this.vetor = new Lista[operador];
        for (int i=0; i<operador; i++){
            vetor[i] = new Lista();
        }
    }

    public void inserir (Contato contato){
        int chave = contato.codigo % operador;
        vetor[chave].inserir(contato);
    }

    public Contato buscar(int codigo){
        return vetor[codigo % operador].buscar(codigo);
    }

    public Contato buscar(String nome) {
        return vetor[nome.hashCode() % operador].buscar(nome.hashCode());
    }

    public void removerContato(String nome){
        vetor[nome.hashCode() % operador].remover(nome);
    }

    public String toString() {
        String out = "";
        for(int i = 0; i < operador; i++) {
            if (vetor[i] != null){
                out += "" + i + ": ";
                out += vetor[i % operador] + "\n";
            }
        }
        return out;
    }

}
