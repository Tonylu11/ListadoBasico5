import utiles.Teclado;
/**
* Crea una clase CreaMatriz que solicite al usuario el tamaño de una nueva matriz y que le pida los enteros necesarios
* para inicializarlo. Utiliza los métodos pedirFila(), pedirColumna() y pedirDatos(int[])
* @author Antonio Luque Bravo
* @version 1.0
*/
public class CreaMatriz{
	public static void main(String[] args) {
		int[][] matriz = new int[pedirDimension("Dame las filas de la matriz..")][pedirDimension("Dame las columnas de la matriz..")];
		pedirDatos(matriz);
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
}