package Calssi;

public class Recensioni {
    private int valutazione;
    private String servizio;
    private String qualitaprezzo;
    private String recensione;
    private String titolo_recensione;
    private String indirizzo;
    private String pulizia;
    private String nome_struttura;
    private String tipologia;

    public Recensioni(String nome_struttura, String indirizzo, String tipologia, String titolo_recensione, String recensione, int valutazione){
    	this.nome_struttura = nome_struttura;
    	this.indirizzo = indirizzo;
    	this.tipologia = tipologia;
    	this.titolo_recensione = titolo_recensione;
    	this.recensione = recensione;
    	this.valutazione = valutazione;
    }

	public int getValutazione() {
		return valutazione;
	}

	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}

	public String getServizio() {
		return servizio;
	}

	public void setServizio(String servizio) {
		this.servizio = servizio;
	}

	public String getQualitaprezzo() {
		return qualitaprezzo;
	}

	public void setQualitaprezzo(String qualitaprezzo) {
		this.qualitaprezzo = qualitaprezzo;
	}

	public String getRecensione() {
		return recensione;
	}

	public void setRecensione(String recensione) {
		this.recensione = recensione;
	}

	public String getTitolo_recensione() {
		return titolo_recensione;
	}

	public void setTitolo_recensione(String titolo_recensione) {
		this.titolo_recensione = titolo_recensione;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getPulizia() {
		return pulizia;
	}

	public void setPulizia(String pulizia) {
		this.pulizia = pulizia;
	}

	public String getNome_struttura() {
		return nome_struttura;
	}

	public void setNome_struttura(String nome_struttura) {
		this.nome_struttura = nome_struttura;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
    
}
