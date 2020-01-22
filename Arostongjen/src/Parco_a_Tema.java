public class Parco_a_Tema extends Attrazione{


    public Parco_a_Tema(String nome, String indirizzo, String descrizione, String fascia_di_prezzo) {
        super(nome, indirizzo, descrizione, fascia_di_prezzo);
    }

    enum Tipologia {ZOO , ACQUARIO , SAFARI , LUNAPARK , RISERVA_NATURALE }

}
