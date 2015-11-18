import utiles.Teclado;

/**
 * Define la clase ModificaVector. Realizará las siguientes opciones: a. Creará
 * un vector con la dimensión indicada por el usuario. b. Inicializará con
 * valores consecutivos (1, 2, 3…). c. Después se solicitará al usuario un
 * elemento del array (entre 1 y longitud) y su nuevo valor para modificarlo. d.
 * Este proceso de modificación de un elemento se repetirá tantas veces como
 * quiera el usuario (¿quiere modificar otro(s/n)?) e. Al acabar, se
 * visualizarán el array ya modificado.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class ModificaVector {
	public static void main(String[] args) {
		int[] vector = new int[pedirDimension()];
		inicializarVector(vector);
		System.out
				.println("YA LO HE CREADO. Ahora vamos a modificar el array.");
		do {
			modificarVector(vector);
		} while (Teclado.deseaContinuar());
		mostrarVector(vector);
	}

	/**
	 * Muestra el vector.
	 * 
	 * @param vector
	 *            vector objetivo.
	 */
	private static void mostrarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("a[" + i + "] = " + vector[i]);
		}
	}

	/**
	 * Pide un valor por teclado.
	 * 
	 * @return Entero por teclado.
	 */
	private static int pedirNuevoValor() {
		return Teclado.leerEntero("Dame el nuevo valor de esa posicion..");
	}

	/**
	 * Pide una posicion de un vector.
	 * 
	 * @param vector
	 *            vector objetivo.
	 * @return posicion.
	 */
	static int pedirPosicion(int[] vector) {
		int posicion = 0;
		do {
			posicion = Teclado
					.leerEntero("Dame una posicion del array para modificarlo..");
			if (posicion > 0 && posicion < vector.length + 1)
				return posicion;
			System.out
					.println("El numero debe de ser positivo y existir en el array..");
		} while (true);
	}

	/**
	 * Pide una dimension como entero.
	 * 
	 * @return dimension.
	 */
	private static int pedirDimension() {
		int dimension;
		do {
			dimension = Teclado
					.leerEntero("Vamos a crear un array con valores consecutivos. Dame la longitud del array (entero positivo):");
		} while (dimension < 1);
		return dimension;
	}

	/**
	 * Inicializa un vector secuencialmente.
	 * 
	 * @param vector
	 *            vector objetivo.
	 */
	private static void inicializarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = i + 1;
		}

	}

	/**
	 * Modifica el vector pasado por parametro.
	 * 
	 * @param vector
	 *            vector objetivo.
	 * @return vector.
	 */
	private static int[] modificarVector(int[] vector) {
		vector[pedirPosicion(vector) - 1] = pedirNuevoValor();
		return vector;
	}
}
