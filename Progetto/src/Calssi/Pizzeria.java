package Calssi;

public class Pizzeria extends Ristornate {


    public Pizzeria(String nome, String indirizzo, String descrizione, String fascia_di_prezzo) {
        super(nome, indirizzo, descrizione, fascia_di_prezzo);
    }

    enum cucina{Mediteranea, Locale, Gourmet, FastFood, SlowFood, Asiatica, Pesce, Zuppe, Steakhouse, Vegana, Gastronomica, SudAmericana, Pizza, StreetFood, Enogastronomica};
}
