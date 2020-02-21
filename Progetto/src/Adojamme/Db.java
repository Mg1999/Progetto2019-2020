package Adojamme;

import java.sql.*;

import Util.GeneratoreID;

public class Db {
	private final String URL= "jdbc:postgresql://localhost:5432/adojamme";
	private final String USER = "postgres";
	private final String PASSWORD = "Francoasburgo45";
	private String valore1;
	private String valore2;
	String sql = "";
	String id_proprietario = "";
	static String email;
	private String email_prova;
	Proprietario id_propr = new Proprietario();
	
	public String getEmail_prova() {
		return email_prova;
	}

	public void setEmail_prova(String email_prova) {
		this.email_prova = email_prova;
	}
	
	public String getId_proprietario() {
		return id_proprietario;
	}

	public void setId_proprietario(String id_proprietario) {
		this.id_proprietario = id_proprietario;
	}

	public String getValore1() {
		return valore1;
	}

	public void setValore1(String valore1) {
		this.valore1 = valore1;
	}

	public String getValore2() {
		return valore2;
	}

	public void setValore2(String valore2) {
		this.valore2 = valore2;
	}

	
	/**
	 * Connection to the PostgresSql database
	 * 
	 * @return a Connection object
	 * 
	 */
	public Db( ){
		valore1 = " ";
		valore2 = " ";
	}
	
	public Connection connect() {
		
		try {
			Class.forName("org.postgresql.Driver");
		}
		catch(ClassNotFoundException e) {
			System.err.println("Classe non trovata");
		}
		
			Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Connected to the PostgreSQL server successfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public Statement statment() throws SQLException {
		Statement st = null;
		st = connect().createStatement();
		return st;
	}
	public ResultSet result(String sql) throws SQLException {
		ResultSet rs = null;
		rs = statment().executeQuery(sql);
		return rs;
	}
	public PreparedStatement preparedStatement(String sql) throws SQLException {
		PreparedStatement stmnt = null;
		stmnt = connect().prepareStatement(sql);
		stmnt.executeUpdate();
		return stmnt;
	}
	
	/**
	 * Inserisce dati nella base di dati.
	 * @param utente da impostare
	 */
	public void registrazioneQuery(String nome, String cognome, String email, String password, boolean question) {
			
		try {
			assegna(question, nome, cognome,email, password);
			preparedStatement(sql);	
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
		public void loginQuery( String emailC, String passwordC) {
			sql = "SELECT  email,password FROM utente WHERE email = '"+ 
      				emailC + "' AND password = '" + passwordC + "';";
			try {
				ResultSet rs = result(sql);
				while (rs.next()) {
					this.valore1 = rs.getString(1);
					this.valore2 = rs.getString(2);
					email = this.valore1;
      		}
      	} catch (SQLException e) {
      		
      		e.printStackTrace();
      	}
			
			}
		public String assegna(boolean question, String nome, String cognome, String email, String password) {
			if (question) {
				String codice = GeneratoreID.generatoreCodiceProprietario();
				try {
	                ResultSet rs = result("SELECT id_proprietario FROM utente");
	                while(rs.next()) {
	                    if(codice.equals(rs.getString("id_proprietario"))) {
	                    	codice =  GeneratoreID.generatoreCodiceProprietario();
	                        rs.beforeFirst();

	                    }
	                  
	                }
	                sql = "INSERT INTO utente (nome, cognome, email, password, id_proprietario )" + 
	          				"VALUES ('"+ nome +"','"+cognome+"','"+email+"','"+password+"','"+codice+"'); ";
	            }catch(Exception e2){
	                e2.printStackTrace();
	            }
				
				}
			else {
				String codice = GeneratoreID.generatoreCodiceRecensore();
				try {
	                ResultSet rs = result("SELECT id_recensore FROM utente");
	                while(rs.next()) {
	                    if( codice.equals(rs.getString("id_recensore"))) {
	                         codice =  GeneratoreID.generatoreCodiceRecensore();
	                        rs.beforeFirst();
	                    }
	                }
	                sql = "INSERT INTO utente (nome, cognome, email, password, id_recensore )" + 
	          				"VALUES ('"+ nome +"','"+cognome+"','"+email+"','"+password+"','"+codice+"'); ";
	            }catch(Exception e2){
	                e2.printStackTrace();
	            }
				
			}
			return sql;
		}
		public String logConroll(String emaill) {
			String id_recensore = "";
			email = emaill;
			try {
				Statement st = connect().createStatement();
				ResultSet result = st.executeQuery("SELECT id_recensore FROM utente WHERE email = '"+ emaill+"';");
				while(result.next()) {
				    id_recensore = result.getString(1);
				    
				}
				
				st.close();
				result.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return id_recensore;
		}
		
		public void postaStrutturaQuery(String nome, String indirizzo, String tipologia_struttura, String descrizione) {
				try {
					String codice = GeneratoreID.generatoreCodiceStruttura();
					Statement st = connect().createStatement();
					ResultSet result = st.executeQuery("SELECT id_struttura FROM struttura");
					while(result.next()) {
					    if(codice.equals(result.getString("id_struttura"))) {
					    	codice =  GeneratoreID.generatoreCodiceStruttura();
					        result.beforeFirst();

					    }
					  
					}
				
					try {
						String id =this.postControll();
 					PreparedStatement stmnt = connect().prepareStatement("INSERT INTO struttura (id_proprietario, nome, indirizzo, tipologia_strutturata, descrizione, id_struttura)\r\n" + 
							"VALUES ('"+ id+"','"+ nome+"','"+indirizzo+"','"+tipologia_struttura+"','"+descrizione+"','"+codice+"')");	
					stmnt.executeUpdate();
					stmnt.close();
					} catch (SQLException e) {
					System.out.println(e.getMessage());
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		
		public String postControll() {
			String id_proprietario = "";
			try {
				ResultSet rs = result("SELECT id_proprietario FROM utente WHERE email = '"+ email+"';");
				while (rs.next()) {
					id_proprietario = rs.getString(1);

				}
			}catch(SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return id_proprietario;
			
		}
		
	
}