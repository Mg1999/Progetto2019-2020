package Calssi;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private int recensioni_effetuate;

    public Utente(){
    };

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRecensioniEffetuate() {
        return this.recensioni_effetuate;
    }

    public void setRecensioniEffetuate(int recensioniEffetuate) {
        this.recensioni_effetuate = recensioni_effetuate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
