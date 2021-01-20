
public class EjerciciosCadenas {
	public static void main (String[] args) {
		System.out.println(charactersInString("Hola, hoy tengo que hacer cosas", 'h'));
		System.out.println(lowCaseInString("HoLa BuenOs DiAs"));
		System.out.println(upperCaseInString("TenGo MuCHA hamBre"));
		System.out.println(numberInString("Hoy es 19 del 01 de 2021"));
		System.out.println(palindrome("Ana lleva al oso la avellana"));
		System.out.println(hideWord("shybaoxlna", "hola"));
		System.out.println(replace("Hola soy Fran", "soy", "eres"));
		System.out.println(numberOfVowel("Quiero comer"));
		System.out.println(consonantesVocales("curso de programacion"));
	}
	
	public static int charactersInString (String cadena, char caracter) {
		cadena = cadena.toUpperCase();
		caracter= Character.toUpperCase(caracter);
		int cont = 0;
		for (int i= 0; i < cadena.length();i++) {
			if (cadena.charAt(i) == caracter) {
				cont ++;
			}
		}
		return cont;
	}
	
	public static int lowCaseInString(String cadena) {
		String cadenaMinuscula = cadena.toLowerCase().replaceAll(" ","");
		cadena= cadena.replaceAll(" ","");
		int cont = 0;
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i) == cadenaMinuscula.charAt(i)) {
				cont ++;
			}
		}
		return cont;
	}
	public static int upperCaseInString(String cadena) {
		String cadenaMayusculas = cadena.toUpperCase().replaceAll(" ","");
		cadena= cadena.replaceAll(" ","");
		int cont = 0;
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i) == cadenaMayusculas.charAt(i)) {
				cont ++;
			}
		}
		return cont;
	}
	public static int numberInString(String cadena) {
		int cont = 0;
		for (int i=0;i<cadena.length();i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				cont ++;
			}
		}
		return cont;
	}
	
	public static boolean palindrome(String cadena) {
		StringBuilder cadenaReverse = new StringBuilder (cadena);
		String cadenaInvertida = new String (cadenaReverse.reverse());
		cadena= cadena.toUpperCase().replaceAll(" ","");
		cadenaInvertida= cadenaInvertida.toUpperCase().replaceAll(" ","");
		if (cadena.compareTo(cadenaInvertida) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean hideWord(String cadena, String palabra) {
		boolean bandera = true;
		for (int i=0;i < palabra.length();i++) {
			if (cadena.indexOf(palabra.charAt(i)) < 0) {
				bandera = false;
			}
		}
		return bandera;
	}
	
	public static String replace(String frase, String palabra, String nuevaPalabra) {
		return frase.replace(palabra, nuevaPalabra);
		}
	
	public static int numberOfVowel(String cadena) {
		String vocales= new String ("AEIOU");
		cadena= cadena.toUpperCase();
		int cont= 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (vocales.indexOf(cadena.charAt(i)) > 0) {
				cont++;
			}
		}
		return cont;
	}
	
	public static String consonantesVocales (String cadena) {
		StringBuilder consonantes = new StringBuilder ("");
		StringBuilder vocales = new StringBuilder ("");
		String vocal = new String ("aeiou");
		cadena = cadena.toLowerCase().replaceAll(" ","");
		for (int i= 0; i < cadena.length(); i++) {
			if (vocal.indexOf(cadena.charAt(i)) >= 0) {
				vocales.append(cadena.charAt(i));
			}
			else { 	
				consonantes.append(cadena.charAt(i));
			}
		}
		return consonantes.toString() + vocales.toString();
	}
}
