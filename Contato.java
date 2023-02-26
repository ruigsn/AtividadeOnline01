public class Contato {

    protected int codigo;
    protected String nome;
    protected String telefone;
    protected String email;
    protected String dataNascimento;
    protected String celular;

    Contato(int codigo, String nome, String telefone, String email, String dataNascimento, String celular) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
    }

    public String toString() {
        return "(" + nome + ", " + telefone + ", " + email + ", " + dataNascimento + ", " + celular + ")";
    }

}
