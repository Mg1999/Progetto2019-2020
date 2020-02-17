package Adojamme;

import java.sql.*;

public class Db_demo {
	static String nomeUtente;
	static String cognome;
	static String email;
	static String password;
	static String recensioniEffetuate;
	static String idRecensore;
	static String idGestore;
	
	public static void main(String[] args) {
		String[] verifica = new String[7];
		String valore = "mariorossi@gmail.com";
		String valoreDue = "mariorossi11";
		dati(verifica, valore,valoreDue);
	}
	
    public static void dati(String[] salva, String num ,String due) {
    			String[] verifica = new String[7];
    			verifica = salva;
    	  try {
         		Class.forName("org.postgresql.Driver");
             	} catch (ClassNotFoundException e) {
         		
         		System.err.println("Classe non trovata");
             	}
             try {
      		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Adojamme","postgres","Francoasburgo45");
      		Statement st = con.createStatement();
      		ResultSet rs= st.executeQuery("SELECT  * FROM utente WHERE email = '"+ 
      				num + "' AND password = '" + due + "';");
      		while (rs.next()) {
      			nomeUtente = rs.getString(1);
      			cognome = rs.getString(2);
      			email = rs.getString(3);
      			password = rs.getString(4);
      			recensioniEffetuate = rs.getString(5);
      			idRecensore = rs.getString(6);
      			idGestore = rs.getString(7);
//      			System.out.println(nomeUtente + " " + cognome + " " + email + " " + password + " " + 
//      									 recensioniEffetuate + " " + idRecensore + " " + idGestore);
      			
      			verifica[0] = nomeUtente;
      			verifica[1] = cognome;
      			verifica[2] = email;
      			verifica[3] = password;
      			verifica[4] = "recensioniEffetuate";
      			verifica[5] = "idRecensore";
      			verifica[6] = "idGestore";
      		}
      		
      		con.close();
      		st.close();
      		rs.close();
      	} catch (SQLException e) {
      		
      		e.printStackTrace();
      	}
             
    }
    
    
}
