package Adojamme;

public class Proprietario {
	
	public Proprietario() {
		this("", "","","","");
	}
	public Proprietario(String nome, String cognome, String email, String password, String id_proprietario) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.id_proprietario = id_proprietario;
	}
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private String id_proprietario;
	private String nome_struttura;
	private String indirizzo;
	private String tipologia_struttura;
	private String titolo_recensione;
	private String recensione;
	private int valutazione;
	
	public Proprietario(String nome_struttura, String indirizzo, String tipologia_struttura, String titolo_recensione, String recensione, int valutazione) {
		this.nome_struttura = nome_struttura;
		this.indirizzo = indirizzo;
		this.tipologia_struttura = tipologia_struttura;
		this.titolo_recensione = titolo_recensione;
		this.recensione = recensione;
		this.valutazione = valutazione;
	}
	
	/**
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * 
	 * @param nome da impostare
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * 
	 * @return cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * 
	 * @param cognome da impostare
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email da impostare
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param password da impostare
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return id_proprietario
	 */
	public String getId_proprietario() {
		return id_proprietario;
	}
	/**
	 * 
	 * @param id_proprietario da impostare
	 */
	public void setId_proprietario(String id_proprietario) {
		this.id_proprietario = id_proprietario;
	}
	public String getNome_struttura() {
		return nome_struttura;
	}
	public void setNome_struttura(String nome_struttura) {
		this.nome_struttura = nome_struttura;
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
	public String getTitolo_recensione() {
		return titolo_recensione;
	}
	public void setTitolo_recensione(String titolo_recensione) {
		this.titolo_recensione = titolo_recensione;
	}
	public String getRecensione() {
		return recensione;
	}
	public void setRecensione(String recensione) {
		this.recensione = recensione;
	}
	public int getValutazione() {
		return valutazione;
	}
	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}
	

}
