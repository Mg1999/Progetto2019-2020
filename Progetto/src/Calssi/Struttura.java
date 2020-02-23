package Calssi;

public class Struttura {
	private String id_proprietario, nome, indirizzo, tipologia_struttura, descrizione, id_struttura;

	public Struttura(String nome, String indirizzo, String id_struttura, String id_proprietario) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.id_struttura = id_struttura;
		this.id_proprietario = id_proprietario;
	}

	public Struttura(String id_proprietario, String nome, String indirizzo, String tipologia_struttura,
			String descrizione, String id_struttura) {
		super();
		this.id_proprietario = id_proprietario;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.tipologia_struttura = tipologia_struttura;
		this.descrizione = descrizione;
		this.id_struttura = id_struttura;
	}

	public String getId_proprietario() {
		return id_proprietario;
	}

	public void setId_proprietario(String id_proprietario) {
		this.id_proprietario = id_proprietario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTipologia_struttura() {
		return tipologia_struttura;
	}

	public void setTipologia_struttura(String tipologia_struttura) {
		this.tipologia_struttura = tipologia_struttura;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getId_struttura() {
		return id_struttura;
	}

	public void setId_struttura(String id_struttura) {
		this.id_struttura = id_struttura;
	}
	
	public String toString() {
		return "La struttura è " + this.nome + " , " + this.indirizzo + " , " + this.id_struttura + " , " + this.id_proprietario;
	}

}
