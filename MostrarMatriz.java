import utiles.Teclado;
/**
* Crea una clase MostrarMatriz que solicite al usuario el tamaño de una nueva matriz
* y que le pida los enteros necesarios para inicializarla.
* Utiliza los métodos pedirFila(), pedirColumna(), pedirDatos(int[]) y mostrarMatriz();
* @author Antonio Luque Bravo
* @version 1.0
*/
public class MostrarMatriz{
	public static void main(String[] args) {
		int[][] matriz = new int[pedirDimension("Dame las filas de la matriz..")][pedirDimension("Dame las columnas de la matriz..")];
		pedirDatos(matriz);
		mostrarMatriz(matriz);
	}
	private static int pedirDimension(String msj){
		int dimension;
		do{
			dimension = Teclado.leerEntero(msj);
		}while(dimension<1);
		return dimension;
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
}