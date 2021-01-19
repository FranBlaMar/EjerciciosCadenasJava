
public class EjerciciosCadenas {
	public static void main (String[] args) {
		System.out.println(charactersInString("Hola, hoy tengo que hacer cosas", 'h'));
		System.out.println(lowCaseInString("HoLa BuenOs DiAs"));
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
}
