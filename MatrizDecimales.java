import utiles.Teclado;

/**
 * Define la clase MatrizDecimales que cree una matriz de decimales. Pide las
 * dimensiones (filas y columnas). Se inicializa con valores aleatorios entre 1
 * y 100 y visualiza el array
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class MatrizDecimales {

	public static void main(String[] args) {
		double[][] matriz = new double[pedirDimension("Dame las filas de la matriz..")][pedirDimension("Dame las columnas de la matriz..")];
		inicializarMatriz(matriz);
		mostrarMatriz(matriz);
	}

	/**
	 * Muestra una matriz pasada por parametro.
	 * 
	 * @param matriz
	 *            matriz objetivo.
	 */
	private static void mostrarMatriz(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > 100) {
					matriz[i][j] = 100;
				}
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}
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

	/**
	 * Inicializa una matriz aleatoriamente.
	 * 
	 * @param matriz
	 *            matriz objetivo.
	 */
	private static void inicializarMatriz(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (Math.random() * 101);
			}
		}
	}
}
