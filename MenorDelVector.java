import utiles.Teclado;

/**
 * Crea una clase MenorDelVector que cree un vector con enteros aleatorios y
 * muestre el valor m�nimo. Para ello, implementa los m�todos pedirDimension(),
 * inicializarVectorAleatoriamente(int[], min, max) y hallarMinimo(int[]).
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class MenorDelVector {
	public static void main(String[] args) {
		int[] vector = new int[pedirDimension()];
		inicializarVectorAleatoriamente(vector);
		System.out.println("El valor maximo del vector es: "
				+ hallarMinimo(vector));

	}

	/**
	 * Halla el minimo del vector que se le pasa por parametro.
	 * 
	 * @param vector
	 *            vector objetivo.
	 * @return devuelve el valor minimo del vector
	 */
	private static int hallarMinimo(int[] vector) {
		int min = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < min)
				min = vector[i];
		}
		return min;
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