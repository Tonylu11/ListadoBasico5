import utiles.Teclado;

/**
 * Crea una clase CreaVector que solicite al usuario el tamaño de un nuevo
 * vector y que le pida los enteros necesarios para inicializarlo. Utiliza los
 * métodos pedirDimension() y pedirDatos(int[])
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class CreaVector {
	public static void main(String[] args) {
		int[] vector = new int[pedirDimension()];
		pedirDatos(vector);
		mostrarVector(vector);
	}

	/**
	 * Muestra un vector.
	 * 
	 * @param vector
	 *            vector objetivo.
	 */
	private static void mostrarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

	/**
	 * Pide una dimension del vector.
	 * 
	 * @return Devuelve la dimension del vector.
	 */
	private static int pedirDimension() {
		int dimension;
		do{
			dimension= Teclado.leerEntero("Dame la dimension del vector..");
		}while(dimension<=0);
		return dimension;
	}

	/**
	 * Pide los valores del vector.
	 * 
	 * @param vector
	 *            vector objetivo.
	 */
	private static void pedirDatos(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Teclado.leerEntero("Dame un numero para la posicion "
					+ i + " del vector..");

		}
	}
}