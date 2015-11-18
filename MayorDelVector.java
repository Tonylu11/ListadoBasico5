import utiles.Teclado;

/**
 * Crea una clase MayorDelVector que cree un vector con enteros aleatorios y
 * muestre el valor máximo. Para ello, implementa los métodos pedirDimension(),
 * inicializarVectorAleatoriamente(int[], i, max) y hallarMaximo(int[]).
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class MayorDelVector {
	public static void main(String[] args) {
		int[] vector = new int[pedirDimension()];
		inicializarVectorAleatoriamente(vector);
		mostrarVector(vector);
		System.out.println("El valor maximo del vector es: "
				+ hallarMaximo(vector));

	}

	/**
	 * Halla el maximo del vector que se le pasa por parametro.
	 * 
	 * @param vector
	 *            vector objetivo.
	 * @return devuelve el valor maximo del vector
	 */
	private static int hallarMaximo(int[] vector) {
		int max = 0;
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] > max)
				max=vector[i]; 
		}
		return max;
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
}