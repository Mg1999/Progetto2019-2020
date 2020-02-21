package Utility;

import java.util.Random;

public class GeneratoreID {
	private final static String LETTERE = "abcdefghijklmnopqrstuvwxyz";
	private final static char[] ALFANUMERICHE = (LETTERE.toUpperCase() + "0123456789").toCharArray();
	
	public static String generatoreCodiceProprietario() {
		StringBuilder result = new StringBuilder();
		result.append("1");
		for(int i=0;i<7;i++) {
			result.append(ALFANUMERICHE[new Random().nextInt(ALFANUMERICHE.length)]);
		}
		return result.toString();
	}
	
	public static String generatoreCodiceRecensore() {
		StringBuilder result = new StringBuilder();
		result.append("2");
		for(int i=0;i<7;i++) {
			result.append(ALFANUMERICHE[new Random().nextInt(ALFANUMERICHE.length)]);
		}
		return result.toString();
	}
}
