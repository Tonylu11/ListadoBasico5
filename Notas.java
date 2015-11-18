/**
 * Define la clase Notas que almacene en un array 15 notas. Las notas se
 * inicializarán de forma aleatoria con enteros entre 0 y 10. Se visualizarán
 * las notas resultantes.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Notas {

	public static void main(String[] args) {
		int[] notas = new int[15];
		inicializarVectorAleatoriamente(notas);
		mostrarNotas(notas);

	}

	private static void mostrarNotas(int[] notas) {
		int j = 1;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + j + ": " + notas[i]);
			j++;
		}
	}

	/**
	 * Inicializa el vector que se pasa por parametro con valores aleatorios.
	 * 
	 * @param vector
	 *            vector a inializar.
	 * @return Devuelve el vector ya inicializado.
	 */
	private static int[] inicializarVectorAleatoriamente(int[] vector) {
		int max = -1, min = 11;
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		return vector;
	}
}
