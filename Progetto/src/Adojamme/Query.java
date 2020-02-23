package Adojamme;

public class Query {
	static String query1;
	static String query2;
	static String query3;
	static String query4;
	static String query5;
	static String query6;
	static String query7;
	static String query8;
	static String query9;
	static String query10;
	static String query11;
	
	public static String setQuery1(String emailC, String passwordC) {
		return query1 = "SELECT  email,password FROM utente WHERE email = '" + emailC + "' AND password = '" + passwordC + "';";
	}
	public static void setQuery2(String query2) {
		Query.query2 = query2;
	}
	public static void setQuery3(String query3) {
		Query.query3 = query3;
	}
	public static void setQuery4(String query4) {
		Query.query4 = query4;
	}
	public static void setQuery5(String query5) {
		Query.query5 = query5;
	}
	public static void setQuery6(String query6) {
		Query.query6 = query6;
	}
	public static void setQuery7(String query7) {
		Query.query7 = query7;
	}
	public static void setQuery8(String query8) {
		Query.query8 = query8;
	}
	public static void setQuery9(String query9) {
		Query.query9 = query9;
	}
	public static void setQuery10(String query10) {
		Query.query10 = query10;
	}
	public static void setQuery11(String query11) {
		Query.query11 = query11;
	}
	

	
}
