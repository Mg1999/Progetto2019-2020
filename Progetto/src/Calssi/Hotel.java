package Calssi;

public class Hotel extends Alloggio{


    public Hotel(String nome, String indirizzo, String descrizione, String fascia_di_prezzo) {
        super(nome, indirizzo, descrizione, fascia_di_prezzo);
    }

    enum servizi {Bagno_singolo , Prenotazione , Bagno_in_Camera , N_camere , Colazione_in_camera , Km_dal_centro};
}
