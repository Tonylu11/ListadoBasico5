import utiles.Teclado;
/**
* Crea una clase MínimoMatriz que solicite al usuario el tamaño de una nueva matriz
* y que la inicialice con valores aleatorios (solicita al usuario el mínimo y el máximo de los valores).
* Hallará el valor mínimo de una matriz, dando exactamente su posición fila-columna.
* Utiliza los métodos pedirFila(), pedirColumna(), pedirMínimo(), pedirMaximo(), mostrarMatriz(), mostrarMínimo() ; 
*/
public class MinimoMatriz{
	public static void main(String[] args) {
		int[][] matriz = new int[pedirDimension("Dame las filas de la matriz..")][pedirDimension("Dame las columnas de la matriz..")];
		int maximo;
		int minimo = pedirMinimo("Dame el minimo al que pueden llegar los valores..");
		do {
			maximo = pedirMaximo("Dame el maximo al que pueden llegar los valores..");
		} while (minimo >= maximo);
		inicializarMatriz(matriz, maximo, minimo);
		mostrarMatriz(matriz);
		hallarMinimo(matriz);
	}
	private static int pedirDimension(String msj){
		int dimension;
		do{
			dimension = Teclado.leerEntero(msj);
		}while(dimension<1);
		return dimension;
	}
	private static int pedirMaximo(String msj){
		return Teclado.leerEntero(msj);
	}
	private static int pedirMinimo(String msj){
		return Teclado.leerEntero(msj);
	}
	private static int[][] pedirDatos(int[][] matriz){
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				matriz[i][j] = Teclado.leerEntero("Dame el valor de la posicion ["+ i +"]["+ j +"]:");
			}
		}
		return matriz;
	}
	private static void mostrarMatriz(int[][] matriz){
		for (int i=0;i<matriz.length;i++) {
			System.out.println("");
			for (int j=0;j<matriz[i].length;j++) {
				System.out.print("["+ i + "][" + j +"]:" + matriz[i][j] + "\t");
			}
		}
	}
	private static void hallarMinimo(int[][] matriz) {
		int min = matriz[0][0];
		int iAux = 0, jAux = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < min){
					min = matriz[i][j];
					iAux = i;
					jAux = j;
				}
			}
		}
		System.out.println("\nEl valor minimo de la matriz es: " + min + " y se encuentra en la posicion: [" + iAux + "]["+ jAux +"]");
	}
	/**
	 * Inicializa una matriz aleatoriamente.
	 * 
	 * @param matriz
	 *            matriz objetivo.
	 */
	private static void inicializarMatriz(int[][] matriz, int min, int max) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int) (Math.random() * (min - max) + max);
			}
		}
	}

}