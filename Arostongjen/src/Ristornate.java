public class Ristornate {
//attributi
    private String nome;
    private String indirizzo;
    private String descrizione;
    private String fascia_di_prezzo;
//costruttore
    public Ristornate(String nome, String indirizzo, String descrizione, String fascia_di_prezzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
        this.fascia_di_prezzo = fascia_di_prezzo;
    }
//metodi getter e setter
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getFascia_di_prezzo() {
        return this.fascia_di_prezzo;
    }

    public void setFascia_di_prezzo(String fascia_di_prezzo) {
        this.fascia_di_prezzo = fascia_di_prezzo;
    }
}
