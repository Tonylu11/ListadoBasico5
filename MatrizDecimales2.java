import utiles.Teclado;

/**
 * Define la clase MatrizDecimales 2 basada en la clase anterior. Se ha de
 * inicializar con valores aleatorios (solicita al usuario el mínimo y el máximo
 * de los valores). Ha de localizar los valores máximo, mínimo y media de la
 * matriz. Que muestre tanto los valores como la posición que ocupan en la
 * matriz. Utiliza los métodos pedirFila(), pedirColumna(), pedirMínimo( ),
 * pedirMaximo(), crearMatriz(), mostrarMatriz(double [][] ), hallarMedia(
 * double[][] ) ;
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class MatrizDecimales2 {
	public static void main(String[] args) {
		double[][] matriz = new double[pedirDimension("Dame las filas de la matriz..")][pedirDimension("Dame las columnas de la matriz..")];
		int maximo;
		int minimo = pedirMinimo("Dame el minimo al que pueden llegar los valores..");
		do {
			maximo = pedirMaximo("Dame el maximo al que pueden llegar los valores..");
		} while (minimo >= maximo);
		inicializarMatriz(matriz, maximo, minimo);
		mostrarMatriz(matriz);
		hallarMaximo(matriz);
		hallarMinimo(matriz);
		System.out.println("La media de todos los valores de la matriz es: "
				+ hallarMedia(matriz));
	}

	/**
	 * Pide la dimension mostrando un mensaje.
	 * 
	 * @param msj
	 *            mensaje
	 * @return devuelve la peticion por teclado.
	 */
	private static int pedirDimension(String msj) {
		return Teclado.leerEntero(msj);
	}

	private static int pedirMinimo(String msj) {
		return Teclado.leerEntero(msj);
	}

	private static int pedirMaximo(String msj) {
		return Teclado.leerEntero(msj);
	}

	private static void hallarMaximo(double[][] matriz) {
		double max = matriz[0][0];
		int iAux = 0, jAux = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > max){
					max = matriz[i][j];
					iAux = i;
					jAux = j;
				}
			}
		}
		System.out.println("El valor maximo de la matriz es: " + max + " y se encuentra en la posicion: [" + iAux + "]["+ jAux +"]");
	}

	private static void hallarMinimo(double[][] matriz) {
		double min = matriz[0][0];
		int iAux = 0, jAux = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < min){
					min = matriz[i][j];
					iAux=i;
					jAux=j;
				}
			}
		}
		System.out.println("El valor minimo de la matriz es: " + min + " y se encuentra en la posicion: [" + iAux + "]["+ jAux +"]");
	}

	private static double hallarMedia(double[][] matriz) {
		double aux = 0;
		int i, j, valor = 0;
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				aux += matriz[i][j];
			}
			valor = j;
		}
		return aux / (i * valor);
	}

	/**
	 * Muestra una matriz pasada por parametro.
	 * 
	 * @param matriz
	 *            matriz objetivo.
	 */
	private static void mostrarMatriz(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Valor[" + i + "][" + j + "]= " + matriz[i][j]
						+ "\t");
			}
			System.out.println("\n");
		}
	}

	/**
	 * Inicializa una matriz aleatoriamente.
	 * 
	 * @param matriz
	 *            matriz objetivo.
	 */
	private static void inicializarMatriz(double[][] matriz, int min, int max) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Math.random() * (min - max) + max;
			}
		}
	}

}
