import utiles.Teclado;
/**
* Define la clase MultiplicaMatrices que multiplique dos matrices de enteros.
* El usuario introducirá por teclado las dimensiones de las matrices (m x n, n x o).
* Las matrices se inicializarán de forma aleatoria con enteros entre 1 y 10. Se visualizarán factores y resultado.
* @author Antonio Luque Bravo
* @version 1.0
*/
public class MultiplicaMatrices{
	public static void main(String[] args) {
		int filasPrimeraMatriz = pedirDimension("Dame las filas de la primera matriz: ");
		int columnasPrimeraMatriz = pedirDimension("Dame las columnas de la primera matriz: ");
		int filasSegundaMatriz = columnasPrimeraMatriz;
		int columnasSegundaMatriz = pedirDimension("Dame las columnas de la segunda matriz: ");
		int[][] factor1 = crearMatriz(filasPrimeraMatriz, columnasPrimeraMatriz);
		mostrar(factor1, "MATRIZ 1: ");
		int[][] factor2 = crearMatriz(filasSegundaMatriz, columnasSegundaMatriz);
		mostrar(factor2, "MATRIZ 2: ");
		int[][] producto = multiplicar(factor1, factor2);
		mostrar(producto, "PRODUCTO: ");
	}

	private static int pedirDimension(String msj) {
		int dimension;
		do {
			dimension = Teclado.leerEntero(msj);
			if (dimension < 0)
				System.out.println("La dimension debe de ser mayor que cero..");
		} while (dimension < 0);
		return dimension;
	}

	private static int[][] crearMatriz(int filas, int columnas) {
		int[][] matriz = new int[filas][columnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 11);
			}
		}
		return matriz;
	}
	private static int [][] multiplicar(int [][] factor1, int [][] factor2){
		int [][] producto = new int[factor1.length][factor2[0].length];
		for (int i=0; i < producto.length; i++) {
			for (int j=0; j < producto[i].length; j++) {
				for (int k=0; k<factor1[0].length; k++) {
					producto [i][j] += factor1[i][k]*factor2[k][j]; 
				}
			}
		}
		return producto;
	}
	private static void mostrar(int[][] matriz, String msj) {
		System.out.println("\n" + msj);
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}
	}
}