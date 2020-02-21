package Adojamme;

public class Recensore {
		 
	    private String nome;
	    private String cognome;
	    private String email;
	    private String password;
	    private int recensioniEffetuate;
	    private String id_recensore;
	    
	    public Recensore() {
	    	this("", "","","",0,"");
	    }
	    
	    public Recensore(String email, String password ) {
	        this.email = email;
	        this.password = password;
	    }
	    
	    public Recensore(String nome, String cognome,String email, String password, int recensioniEffetuate, String id_recensore ) {
	        this.nome = nome;
	        this.cognome = cognome;
	        this.email = email;
	        this.password = password;
	        this.recensioniEffetuate = recensioniEffetuate;
	        this.id_recensore = id_recensore;
	 
	    }
	    /**
	     * 
	     * @return id_recensore
	     */
	    public String getId_recensore() {
			return id_recensore;
		}
	    /**
	     * 
	     * @param id_recensore da impostre
	     */
		public void setId_recensore(String id_recensore) {
			this.id_recensore = id_recensore;
		}

	 
	    /**
	     * @return il nome
	     */
	    public String getNome() {
	        return nome;
	    }
	 
	    /**
	     * @param nome il nome da impostare
	     */
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	 
	    /**
	     * @return il cognome
	     */
	    public String getCognome() {
	        return cognome;
	    }
	 
	    /**
	     * @param cognome 
	     * @param cognome il cognome da impostare
	     */
	    public void setCognomee( String cognome) {
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
	     * @param email l'email da impostare
	     */
	    public void setEmail (String email) {
	    	this.email = email;
	    }
	    
	    /**
	     * 
	     * @return password
	     */
	    public String getPassword() {
	    	return password;
	    }
	    
	    public void setPassword(String password) {
	    	this.password = password;
	    }
	    
	    /**
	     * 
	     * @return recensioniEffetuate
	     */
	    public int getRecensioniEffetuate() {
	    	return recensioniEffetuate;
	    }
	    
	    /**
	     * 
	     * @param recensioniEffetuate le recensioniEffettuate da impostare
	     */
	    public void setRecensioniEffetuate(int recensioniEffetuate) {
	    	this.recensioniEffetuate = recensioniEffetuate;
	    }
//	    public void incremento() {
//			//int id_proprietario;
//			Db database1 = new Db();
//			database1.ricerca();
//			//id_proprietario = this.getId_recensore();
//		}
}
