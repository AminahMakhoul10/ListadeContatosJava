public class Contato {
    public String nome;
    public String telefonePessoal;
    public boolean contatoEmergencia;

    public Contato(String nome, String telefonePessoal, boolean contatoEmergencia) {
        this.nome = nome;
        this.telefonePessoal = telefonePessoal;
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefonePessoal() {
        return telefonePessoal;
    }

    public boolean isContatoEmergencia() {
        return contatoEmergencia;
    }
}