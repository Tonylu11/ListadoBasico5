/**
 * Crea una clase DelReves que implemente el m�todo mostrarDelReves(int []). Se
 * le pasar� como argumento un vector de enteros inicializado mediante llaves.
 * Mostrar� dicho vector del rev�s.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class DelReves {

	public static void main(String[] args) {
		int[] vector = { 1, 2, 3, 4, 5, 6, 7 };
		mostrarDelReves(vector);
	}

	/**
	 * Muestra del reves el vector que se le pasa por parametro.
	 * 
	 * @param vector
	 *            vector objetivo.
	 */
	static void mostrarDelReves(int[] vector) {
		for (int i = vector.length-1; i >= 0; i--) {
			System.out.println(vector[i]);
		}
	}
}
