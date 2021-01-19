
public class EjerciciosCadenas {
	public static void main (String[] args) {
		System.out.println(charactersInString("Hola, hoy tengo que hacer cosas", 'h'));
		System.out.println(lowCaseInString("HoLa BuenOs DiAs"));
		System.out.println(upperCaseInString("TenGo MuCHA hamBre"));
		System.out.println(numberInString("Hoy es 19 del 01 de 2021"));
		System.out.println(palindrome("Ana lleva al oso la avellana"));
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
}
