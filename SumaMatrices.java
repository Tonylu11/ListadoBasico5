import utiles.Teclado;

/**
 * Define la clase SumaMatricesque sume dos matrices de enteros. El usuario
 * introducirá por teclado las dimensiones de las matrices(m x n). Las matrices
 * se inicializarán de forma aleatoria con enteros entre 0 y 10. Se
 * visualizarán sumandos y suma.Completa este esqueleto:
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class SumaMatrices {
	public static void main(String[] args) {
		int filas = pedirDimension("Dame las filas: ");
		int columnas = pedirDimension("Dame las columnas: ");
		int[][] sumando1 = crearMatriz(filas, columnas);
		mostrar(sumando1, "MATRIZ 1: ");
		int[][] sumando2 = crearMatriz(filas, columnas);
		mostrar(sumando2, "MATRIZ 2: ");
		int[][] suma = sumar(sumando1, sumando2);
		mostrar(suma, "MATRIZ SUMA: ");
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

	private static int[][] sumar(int[][] sumando1, int[][] sumando2) {
		int[][] matriz = sumando1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sumando1[i][j] + sumando2[i][j];
			}
		}
		return matriz;
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
