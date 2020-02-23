package Adojamme;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JList;

import Util.GeneratoreID;
import Calssi.Recensioni;
import Calssi.Struttura;

public class Db {
	private static final String[][][][] String = null;
	private final String URL = "jdbc:postgresql://localhost:5432/adojamme";
	private final String USER = "postgres";
	private final String PASSWORD = "Francoasburgo45";
	private String valore1;
	private String valore2;
	String sql = "";
	String id_proprietario = "";
	static String email;
	static String tipologia_strutture;
	private String email_prova;
	static String id_struttura;
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
	public Db() {
		valore1 = " ";
		valore2 = " ";
	}

	public Connection connect() {

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Classe non trovata");
		}

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
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
		stmnt = connect().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE);
		stmnt.executeUpdate();
		return stmnt;
	}

	/**
	 * Inserisce dati nella base di dati.
	 * 
	 * @param utente da impostare
	 */
	public void registrazioneQuery(String nome, String cognome, String email, String password, boolean question) {

		try {
			assegna(question, nome, cognome, email, password);
			PreparedStatement stmnt = connect().prepareStatement(sql);
			stmnt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void loginQuery(String emailC, String passwordC) {
		sql = "SELECT  email,password FROM utente WHERE email = '" + emailC + "' AND password = '" + passwordC + "';";
		//sql = Query.setQuery1(emailC, passwordC);
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
				while (rs.next()) {
					if (codice.equals(rs.getString("id_proprietario"))) {
						codice = GeneratoreID.generatoreCodiceProprietario();
						rs.beforeFirst();

					}

				}
				sql = "INSERT INTO utente (nome, cognome, email, password, recensioniEffetuate, id_proprietario )"
						+ "VALUES ('" + nome + "','" + cognome + "','" + email + "','" + password + "','0','" + codice
						+ "'); ";
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} else {
			String codice = GeneratoreID.generatoreCodiceRecensore();
			try {
				ResultSet rs = result("SELECT id_recensore FROM utente");
				while (rs.next()) {
					if (codice.equals(rs.getString("id_recensore"))) {
						codice = GeneratoreID.generatoreCodiceRecensore();
						rs.beforeFirst();
					}
				}
				sql = "INSERT INTO utente (nome, cognome, email, password, id_recensore )" + "VALUES ('" + nome + "','"
						+ cognome + "','" + email + "','" + password + "','" + codice + "'); ";
			} catch (Exception e2) {
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
			ResultSet result = st.executeQuery("SELECT id_recensore FROM utente WHERE email = '" + emaill + "';");
			while (result.next()) {
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

	/**
	 * Inserisce nel database i dati relativi alla struttura
	 * 
	 * @param nome
	 * @param indirizzo
	 * @param tipologia_struttura
	 * @param descrizione
	 */
	public void postaStrutturaQuery(String nome, String indirizzo, String tipologia_struttura, String descrizione, String tipologia) {
		tipologia_strutture = tipologia_struttura;
		try {
			String codice = GeneratoreID.generatoreCodiceStruttura();
			Statement st = connect().createStatement();
			ResultSet result = st.executeQuery("SELECT id_struttura FROM struttura");
			while (result.next()) {
				if (codice.equals(result.getString("id_struttura"))) {
					codice = GeneratoreID.generatoreCodiceStruttura();
					result.beforeFirst();

				}

			}

			try {
				String id = this.postControll();
				PreparedStatement stmnt = connect().prepareStatement(
						"INSERT INTO struttura (id_proprietario, nome, indirizzo, tipologia_strutturata, descrizione, id_struttura, tipologia)\r\n"
								+ "VALUES ('" + id + "','" + nome + "','" + indirizzo + "','" + tipologia_struttura
								+ "','" + descrizione + "','" + codice + "','" + tipologia + "')");
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

	/**
	 * Effettua un controllo sul databse per recuperare l'id del proprietario che
	 * sta effettuando il post della sua struttura
	 * 
	 * @return
	 */
	public String postControll() {
		String id_proprietario = "";
		try {
			ResultSet rs = result("SELECT id_proprietario FROM utente WHERE email = '" + email + "';");
			while (rs.next()) {
				id_proprietario = rs.getString(1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id_proprietario;

	}

	public int cercarecenioni(String id_recensore, String id_struttura) {
		int recensione_effetuata = 0;
		try {
			ResultSet rs = result(
					"SELECT COUNT (id_recensore) FROM recensioni WHERE id_struttura = '" + id_struttura + "';");
			while (rs.next()) {

				recensione_effetuata = rs.getInt(1);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return recensione_effetuata;
	}

	/**
	 * Inserisce nel database i dati relativi alla recensione
	 * 
	 * @param titolo
	 * @param testo
	 * @param tipologia
	 * @param servizio
	 * @param qualita
	 * @param selezionare
	 */
	public void postaRecensioneQuery(String titolo, String testo, String tipologia, String servizio, String qualita,
			String selezionare) {
		try {
			String codice = GeneratoreID.generatoreCodiceRecensione();
			Statement st = connect().createStatement();
			ResultSet result = result("SELECT id_recensione FROM recensioni");
			while (result.next()) {
				if (codice.equals(result.getString("id_recensione"))) {
					codice = GeneratoreID.generatoreCodiceRecensione();
					result.beforeFirst();

				}
			}

			try {
				String id = this.postControllRecensione();
				PreparedStatement stmnt = connect()
						.prepareStatement("INSERT INTO recensioni (id_recensore, tipologia, titolo_recensione, "
								+ "recensione, servizio, pulizia, qualità_prezzo, id_recensione, id_struttura)\r\n"
								+ "VALUES ('" + id + "','" + tipologia + "','" + titolo + "','" + testo + "','"
								+ servizio + "','" + selezionare + "','" + qualita + "','" + codice + "','"
								+ id_struttura + "')");
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

	/**
	 * Effettua un controllo sul databse per recuperare l'id del recensore che sta
	 * effettuando il post della sua recensione
	 * 
	 * @return
	 */
	public String postControllRecensione() {
		String id_recensore = "";
		try {
			ResultSet rs = result("SELECT id_recensore FROM utente WHERE email = '" + email + "';");
			while (rs.next()) {
				id_recensore = rs.getString(1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id_recensore;

	}

	/**
	 * mostra la tabella con tutti le strutture che si possono recensire in base
	 * alla tipologia selezionata
	 * 
	 * @return l' ArrayList Struttura
	 */
	public ArrayList<Struttura> view() {
		ArrayList<Struttura> lista_struttura = new ArrayList<>();
		String nome = null;
		String indirizzo = null;
		String id_struttura = null;
		String id_proprietario = null;
		Struttura struttura;
		try {

			lista_struttura.clear();
			ResultSet rs = result(
					"SELECT nome, indirizzo, id_struttura, id_proprietario FROM struttura WHERE tipologia_strutturata = '"
							+ tipologia_strutture + "';");
			System.out.println(tipologia_strutture);
			while (rs.next()) {
				nome = rs.getString("nome");
				indirizzo = rs.getString("indirizzo");
				id_struttura = rs.getString("id_struttura");
				id_proprietario = rs.getString("id_proprietario");
				lista_struttura.add(struttura = new Struttura(nome, indirizzo, id_struttura, id_proprietario));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_struttura;
	}

	public int incrementaNumeroRecensioni() {
		int numeroRecensioni = 0;
		try {
			ResultSet rs = result("SELECT nome, indirizzo, id_struttura, id_proprietario FROM struttura;");
			while (rs.next()) {
				numeroRecensioni = rs.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (numeroRecensioni == 0) {
			return numeroRecensioni;
		} else {
			return numeroRecensioni++;
		}
	}

	public ArrayList<Proprietario> proprietarioProfilo() {
		ArrayList<Proprietario> listaProprietario = new ArrayList<>();
		String nome_struttura = null;
		String indirizzo = null;
		String tipologiaStruttura = null;
		String titoloRecensione = null;
		String recensioni = null;
		int valutazione = 0;
		Proprietario proprietario;
		try {

			listaProprietario.clear();
			ResultSet rs = result(
					"SELECT ((recensioni.servizio + recensioni.pulizia + recensioni.qualità_prezzo)/3) as media,\r\n"
							+ "struttura.indirizzo, \r\n" + "struttura.tipologia_strutturata, \r\n"
							+ "struttura.nome,\r\n" + "struttura.id_struttura,\r\n"
							+ "recensioni.titolo_recensione, \r\n" + "recensioni.recensione,\r\n"
							+ "recensioni.id_struttura\r\n" + "FROM struttura\r\n" + "INNER JOIN recensioni\r\n"
							+ "ON struttura.id_struttura = recensioni.id_struttura\r\n" + "WHERE id_proprietario = '"
							+ (postControll()) + "'\r\n" + "GROUP BY\r\n" + "struttura.indirizzo, \r\n"
							+ "struttura.tipologia_strutturata, \r\n" + "struttura.nome,\r\n"
							+ "struttura.id_struttura,\r\n" + "recensioni.servizio,\r\n" + "recensioni.pulizia,\r\n"
							+ "recensioni.qualità_prezzo,\r\n" + "recensioni.titolo_recensione, \r\n"
							+ "recensioni.recensione,\r\n" + "recensioni.id_struttura;");
			while (rs.next()) {
				nome_struttura = rs.getString(4);
				indirizzo = rs.getString(2);
				tipologiaStruttura = rs.getString(3);
				titoloRecensione = rs.getString(6);
				recensioni = rs.getString(7);
				valutazione = rs.getInt(1);
				listaProprietario.add(proprietario = new Proprietario(nome_struttura, indirizzo, tipologiaStruttura,
						titoloRecensione, recensioni, valutazione));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaProprietario;
	}

	public ArrayList<Recensioni> recensoreprofiloTutte() {
		ArrayList<Recensioni> lista_recensione = new ArrayList<>();
		String nome_struttura = null;
		String indirizzo = null;
		String tipologia_struttura = null;
		String titolo_recensione = null;
		String recensione = null;
		int valutazione_media = 0;
		Recensioni recensore;
		try {
			lista_recensione.clear();
			ResultSet rs = result("SELECT ((servizio + pulizia + qualità_prezzo)/3) as media,\r\n"
					+ "recensioni.titolo_recensione, \r\n" + "recensioni.recensione, \r\n"
					+ "recensioni.id_struttura, \r\n" + "struttura.indirizzo, \r\n"
					+ "struttura.tipologia_strutturata, \r\n" + "struttura.nome,\r\n" + "struttura.id_struttura  \r\n"
					+ "FROM recensioni\r\n"
					+ "INNER JOIN struttura ON recensioni.id_struttura = struttura.id_struttura\r\n"
					+ "WHERE id_recensore = '" + (postControllRecensione()) + "' GROUP BY \r\n"
					+ "recensioni.titolo_recensione, \r\n" + "recensioni.recensione,\r\n"
					+ "recensioni.id_struttura, \r\n" + "struttura.indirizzo, \r\n"
					+ "struttura.tipologia_strutturata, \r\n" + "struttura.nome,\r\n" + "struttura.id_struttura,\r\n"
					+ "recensioni.servizio,\r\n" + "recensioni.pulizia,\r\n" + "recensioni.qualità_prezzo;");
			System.out.println(tipologia_strutture);
			while (rs.next()) {
				nome_struttura = rs.getString(7);
				indirizzo = rs.getString(5);
				tipologia_struttura = rs.getString(6);
				titolo_recensione = rs.getString(2);
				recensione = rs.getString(3);
				valutazione_media = rs.getInt(1);
				lista_recensione.add(recensore = new Recensioni(nome_struttura, indirizzo, tipologia_struttura,
						titolo_recensione, recensione, valutazione_media));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_recensione;
	}

	public ArrayList<Recensioni> recensoreprofiloTutte2() {
		ArrayList<Recensioni> lista_recensione = new ArrayList<>();
		String nome_struttura = null;
		String indirizzo = null;
		String tipologia_struttura = null;
		String titolo_recensione = null;
		String recensione = null;
		int valutazione_media = 0;
		Recensioni recensore;
		try {
			lista_recensione.clear();
			ResultSet rs = result("SELECT ((servizio + pulizia + qualità_prezzo)/3) as media,\r\n"
					+ "recensioni.titolo_recensione, \r\n" + "recensioni.recensione, \r\n"
					+ "recensioni.id_struttura, \r\n" + "struttura.indirizzo, \r\n"
					+ "struttura.tipologia_strutturata, \r\n" + "struttura.nome,\r\n" + "struttura.id_struttura  \r\n"
					+ "FROM recensioni\r\n"
					+ "INNER JOIN struttura ON recensioni.id_struttura = struttura.id_struttura\r\n" + " GROUP BY \r\n"
					+ "recensioni.titolo_recensione, \r\n" + "recensioni.recensione,\r\n"
					+ "recensioni.id_struttura, \r\n" + "struttura.indirizzo, \r\n"
					+ "struttura.tipologia_strutturata, \r\n" + "struttura.nome,\r\n" + "struttura.id_struttura,\r\n"
					+ "recensioni.servizio,\r\n" + "recensioni.pulizia,\r\n" + "recensioni.qualità_prezzo;");
			System.out.println(tipologia_strutture);
			while (rs.next()) {
				nome_struttura = rs.getString(7);
				indirizzo = rs.getString(5);
				tipologia_struttura = rs.getString(6);
				titolo_recensione = rs.getString(2);
				recensione = rs.getString(3);
				valutazione_media = rs.getInt(1);
				lista_recensione.add(recensore = new Recensioni(nome_struttura, indirizzo, tipologia_struttura,
						titolo_recensione, recensione, valutazione_media));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_recensione;
	}

	public int cercaEmail() {
		int email_esisstenti = 0;
		try {
			ResultSet rs = result("SELECT COUNT (email)\r\n" + "FROM utente\r\n" + "WHERE email = '" + email + "';");
			while (rs.next()) {

				email_esisstenti = rs.getInt(1);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return email_esisstenti;
	}
	public ArrayList<Recensioni> FiltroAlloggio() {
		ArrayList<Recensioni> listaAlloggio = new ArrayList<>();
		String nome_struttura = null;
		String indirizzo = null;
		String tipologia_struttura = null;
		String titolo_recensione = null;
		String recensione = null;
		int valutazione_media = 0;
		Recensioni recensore;
		try {
			listaAlloggio.clear();
			ResultSet rs = result("SELECT ((servizio + pulizia + qualità_prezzo)/3) as media,\r\n" + 
					"					struttura.indirizzo, \r\n" + 
					"					struttura.tipologia_strutturata, \r\n" + 
					"					struttura.tipologia_raffinata,\r\n" + 
					"					struttura.nome,\r\n" + 
					"					struttura.id_struttura,\r\n" + 
					"					recensioni.titolo_recensione,\r\n" + 
					"					recensioni.recensione,\r\n" + 
					"					recensioni.id_struttura\r\n" + 
					"					FROM struttura\r\n" + 
					"					INNER JOIN recensioni ON struttura.id_struttura = recensioni.id_struttura\r\n" + 
					"					WHERE tipologia_raffinata = 'Allogio' \r\n" + 
					"					GROUP BY \r\n" + 
					"					recensioni.titolo_recensione, \r\n" + 
					"					recensioni.recensione,\r\n" + 
					"					recensioni.id_struttura, \r\n" + 
					"					struttura.indirizzo,\r\n" + 
					"					struttura.tipologia_strutturata, \r\n" + 
					"					struttura.nome,\r\n" + 
					"					struttura.id_struttura,\r\n" + 
					"					recensioni.servizio,\r\n" + 
					"					recensioni.pulizia, \r\n" + 
					"					recensioni.qualità_prezzo;");
			while (rs.next()) {
				nome_struttura = rs.getString(5);
				indirizzo = rs.getString(2);
				tipologia_struttura = rs.getString(3);
				titolo_recensione = rs.getString(7);
				recensione = rs.getString(8);
				valutazione_media = rs.getInt(1);
				listaAlloggio.add(recensore = new Recensioni(nome_struttura, indirizzo, tipologia_struttura,
						titolo_recensione, recensione, valutazione_media));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaAlloggio;
	}
	
	public ArrayList<Recensioni> FiltroAttrazione() {
		ArrayList<Recensioni> listaAttrazione = new ArrayList<>();
		String nome_struttura = null;
		String indirizzo = null;
		String tipologia_struttura = null;
		String titolo_recensione = null;
		String recensione = null;
		int valutazione_media = 0;
		Recensioni recensore;
		try {
			listaAttrazione.clear();
			ResultSet rs = result("SELECT ((servizio + pulizia + qualità_prezzo)/3) as media,\r\n" + 
					"					struttura.indirizzo, \r\n" + 
					"					struttura.tipologia_strutturata, \r\n" + 
					"					struttura.tipologia_raffinata,\r\n" + 
					"					struttura.nome,\r\n" + 
					"					struttura.id_struttura,\r\n" + 
					"					recensioni.titolo_recensione,\r\n" + 
					"					recensioni.recensione,\r\n" + 
					"					recensioni.id_struttura\r\n" + 
					"					FROM struttura\r\n" + 
					"					INNER JOIN recensioni ON struttura.id_struttura = recensioni.id_struttura\r\n" + 
					"					WHERE tipologia_raffinata = 'Attrazione' \r\n" + 
					"					GROUP BY \r\n" + 
					"					recensioni.titolo_recensione, \r\n" + 
					"					recensioni.recensione,\r\n" + 
					"					recensioni.id_struttura, \r\n" + 
					"					struttura.indirizzo,\r\n" + 
					"					struttura.tipologia_strutturata, \r\n" + 
					"					struttura.nome,\r\n" + 
					"					struttura.id_struttura,\r\n" + 
					"					recensioni.servizio,\r\n" + 
					"					recensioni.pulizia, \r\n" + 
					"					recensioni.qualità_prezzo;");
			while (rs.next()) {
				nome_struttura = rs.getString(5);
				indirizzo = rs.getString(2);
				tipologia_struttura = rs.getString(3);
				titolo_recensione = rs.getString(7);
				recensione = rs.getString(8);
				valutazione_media = rs.getInt(1);
				listaAttrazione.add(recensore = new Recensioni(nome_struttura, indirizzo, tipologia_struttura,
						titolo_recensione, recensione, valutazione_media));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaAttrazione;
	}
	public ArrayList<Recensioni> FiltroRistorante() {
		ArrayList<Recensioni> listaRistorante = new ArrayList<>();
		String nome_struttura = null;
		String indirizzo = null;
		String tipologia_struttura = null;
		String titolo_recensione = null;
		String recensione = null;
		int valutazione_media = 0;
		Recensioni recensore;
		try {
			listaRistorante.clear();
			ResultSet rs = result("SELECT ((servizio + pulizia + qualità_prezzo)/3) as media,\r\n" + 
					"					struttura.indirizzo, \r\n" + 
					"					struttura.tipologia_strutturata, \r\n" + 
					"					struttura.tipologia_raffinata,\r\n" + 
					"					struttura.nome,\r\n" + 
					"					struttura.id_struttura,\r\n" + 
					"					recensioni.titolo_recensione,\r\n" + 
					"					recensioni.recensione,\r\n" + 
					"					recensioni.id_struttura\r\n" + 
					"					FROM struttura\r\n" + 
					"					INNER JOIN recensioni ON struttura.id_struttura = recensioni.id_struttura\r\n" + 
					"					WHERE tipologia_raffinata = 'Ristorante' \r\n" + 
					"					GROUP BY \r\n" + 
					"					recensioni.titolo_recensione, \r\n" + 
					"					recensioni.recensione,\r\n" + 
					"					recensioni.id_struttura, \r\n" + 
					"					struttura.indirizzo,\r\n" + 
					"					struttura.tipologia_strutturata, \r\n" + 
					"					struttura.nome,\r\n" + 
					"					struttura.id_struttura,\r\n" + 
					"					recensioni.servizio,\r\n" + 
					"					recensioni.pulizia, \r\n" + 
					"					recensioni.qualità_prezzo;");
			while (rs.next()) {
				nome_struttura = rs.getString(5);
				indirizzo = rs.getString(2);
				tipologia_struttura = rs.getString(3);
				titolo_recensione = rs.getString(7);
				recensione = rs.getString(8);
				valutazione_media = rs.getInt(1);
				listaRistorante.add(recensore = new Recensioni(nome_struttura, indirizzo, tipologia_struttura,
						titolo_recensione, recensione, valutazione_media));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaRistorante;
	}
	
}