
public class EjerciciosCadenas {
	public static void main (String[] args) {
		System.out.println(charactersInString("Hola, hoy tengo que hacer cosas", 'h'));
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
	
}
