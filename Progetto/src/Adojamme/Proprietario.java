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
	
//	public void incremento() {
//		//int id_proprietario;
//		Db database1 = new Db();
//		database1.ricerca();
//		//id_proprietario = (this.getId_proprietario());
//		
//	}

}
