public class Museo extends Attrazione{


    public Museo(String nome, String indirizzo, String descrizione, String fascia_di_prezzo) {
        super(nome, indirizzo, descrizione, fascia_di_prezzo);
    }
    enum tipologia{Guerra, Arte, Scienze, Scienze_naturali, Oceanografico, Strocio, Archeologico, Futuristico};
}
