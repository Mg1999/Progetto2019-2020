package Calssi;

public class Luogo_Storico extends Attrazione{

    public Luogo_Storico(String nome, String indirizzo, String descrizione, String fascia_di_prezzo) {
        super(nome, indirizzo, descrizione, fascia_di_prezzo);
    }

    enum Tipologia{Chiesa , Cattedrale , Stadio , Piazza , Torre , Castello};
}
