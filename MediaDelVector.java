import utiles.Teclado;

/**
 * Crea una clase MediaDelVector que cree un vector con enteros aleatorios y
 * muestre la media del vector. Para ello, implementa los métodos
 * pedirDimension(), inicializarVectorAleatoriamente(int[], min, max) y
 * hallarMedia(int[]).
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class MediaDelVector {

	public static void main(String[] args) {
		int[] vector = new int[pedirDimension()];
		inicializarVectorAleatoriamente(vector);
		System.out.println("La media del vector es: " + hallarMedia(vector));

	}

	/**
	 * Halla la media del vector que se le pasa por parametro.
	 * 
	 * @param vector
	 *            vector objetivo.
	 * @return devuelve el valor de la media del vector
	 */
	private static int hallarMedia(int[] vector) {
		int min = vector[0];
		int media = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < min)
				min += vector[i];
			media = min / vector.length;

		}
		return media;
	}

	/**
	 * Pide una dimension del vector.
	 * 
	 * @return Devuelve la dimension del vector.
	 */
	private static int pedirDimension() {
		return Teclado.leerEntero("Dame la dimension del vector..");
	}

	/**
	 * Inicializa el vector que se pasa por parametro con valores aleatorios.
	 * 
	 * @param vector
	 *            vector a inializar.
	 * @return Devuelve el vector ya inicializado.
	 */
	private static int[] inicializarVectorAleatoriamente(int[] vector) {
		int max = 0, min = 10;
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		return vector;
	}
}
