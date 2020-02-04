package Calssi;

public class Trattoria  extends Ristornate{


    public Trattoria(String nome, String indirizzo, String descrizione, String fascia_di_prezzo) {
        super(nome, indirizzo, descrizione, fascia_di_prezzo);
    }
    enum cucina{Mediteranea, Locale, Gourmet, FastFood, SlowFood, Asiatica, Pesce, Zuppe, Steakhouse, Vegana, Gastronomica, SudAmericana, Pizza, StreetFood, Enogastronomica};
}
