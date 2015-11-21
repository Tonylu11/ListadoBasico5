import utiles.*;

/**
 * Crea la clase NotasAlumnos. Declara y crea un tipo de variable que
 * sea capaz de contener la nota que han obtenido 4 alumnos en los diferentes módulos en los queestán matriculados.
 * Sabemos que el primer alumno está matriculado en 4 módulos;
 * el segundo en 7, el tercero en 3 módulos y el cuarto en dos módulos.
 * Genera aleatoriamente las notas de los alumnos y muéstralos.
 * Utiliza métodos de la forma más eficiente y clara.
 * @author Antonio Luque Bravo
 * @version 1.0
 */

public class NotasAlumnos{
	public static void main(String[] args){
		int [][] notas = asignarModulos();
		inicializarMatrizAleatoriamente(notas);
		mostrar(notas, "Notas de los alumnos.");
	}

	private static void inicializarMatrizAleatoriamente(int[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)(Math.random()*11);
		}
	}

	private static int[][] asignarModulos(){
		int[][] notas = new int[4][];
		notas[0] = new int[4];
		notas[1] = new int[7];
		notas[2] = new int[3];
		notas[3] = new int[2];
		return notas;
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