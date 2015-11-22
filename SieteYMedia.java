import utiles.Teclado;

/**
 * Define la clase SieteYMedia que permita al usuario jugar a las siete y media.
 * Para ello, has de almacenar las 40 cartas en un array bidimensional. Utiliza
 * el método Math.random() para seleccionar una de ellas. Recuerda que no pueden
 * seleccionarse dos veces. El jugador decide si seguir arriesgando o no
 * mediante una pregunta.
 *
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public class SieteYMedia {
	public static void main(String[] args) {
		do {
			double acumulador = 0;
			int[][] baraja = inicializarBaraja();
			do {
				acumulador = partida(acumulador, baraja);
			} while (acumulador < 7.5 && Teclado.deseaContinuar());
			System.out.println("Puntuacion final: " + acumulador + " pts");
		} while (Teclado.deseaContinuar());
	}

	/**
	 * Inicializa la baraja con numero consecutivos (1,2,3,4,5..)
	 * 
	 * @return devuelve la baraja ya inicializada.
	 */
	private static int[][] inicializarBaraja() {
		int[][] baraja = new int[4][10];
		for (int i = 0; i < baraja.length; i++) {
			for (int j = 0; j < baraja[i].length; j++) {
				baraja[i][j] = j + 1;
			}
		}
		return baraja;
	}

	/**
	 * metodo donde transcurre la partida.
	 * 
	 * @param acumulador
	 *            variable donde se va acumulando la puntuacion del jugador
	 *            durante la partida.
	 * @param baraja
	 *            baraja del juego.
	 * @return devuelve la puntuacion que lleva el jugador.
	 */
	private static double partida(double acumulador, int[][] baraja) {
		double puntuacion;
		System.out.println("Sacando una carta..\n");
		puntuacion = calcularPuntuacion(sacarCarta(baraja));
		acumulador += puntuacion;
		System.out.println("Llevas " + acumulador + " puntos en la partida.");
		comprobarPuntuacion(acumulador);
		return acumulador;
	}

	/**
	 * Escoge una carta, le calcula el modulo y su division para ver en que palo
	 * y figura esta.
	 * 
	 * @param baraja
	 *            baraja del juego.
	 * @return devuelve la figura de la carta que ha sido elegida
	 *         aleatoriamente.
	 */
	private static int sacarCarta(int[][] baraja) {
		int carta, palo = 0, figura = 0;
		carta = cartaAleatoria();
		palo = carta / 10;
		figura = carta % 10;
		comprobarCarta(baraja, carta, palo, figura);
		return figura + 1;

	}

	/**
	 * Calcula una carta de 1 a 40.
	 * 
	 * @return Devuelve la carta aleatoria.
	 */
	private static int cartaAleatoria() {
		return (int) (Math.random() * 40);
	}

	/**
	 * comprueba si la carta ya ha sido elegida o no.
	 * 
	 * @param baraja
	 *            baraja del juego.
	 * @param carta
	 *            carta elegida.
	 * @param palo
	 *            palo de la carta.
	 * @param figura
	 *            figura de la carta.
	 */
	private static void comprobarCarta(int[][] baraja, int carta, int palo,
			int figura) {
		if (baraja[palo][figura] == 0)
			sacarCarta(baraja);
		else {
			baraja[palo][figura] = 0;
			mostrarCarta(carta);
		}
	}

	/**
	 * Muestra la carta elegida.
	 * 
	 * @param carta
	 *            carta elegida.
	 */
	private static void mostrarCarta(int carta) {
		int palo = 0, figura = 0;
		String[] figuras = { "uno", "dos", "tres", "cuatro", "cinco", "seis",
				"siete", "sota", "caballo", "rey" };
		palo = carta / 10;
		figura = carta % 10;
		comprobarPalo(figuras, palo, figura);
	}

	/**
	 * Comprueba el palo de la carta.
	 * 
	 * @param figuras
	 *            Array donde estan todas las figuras.
	 * @param palo
	 *            palo de la carta.
	 * @param figura
	 *            figura de la carta.
	 */
	private static void comprobarPalo(String[] figuras, int palo, int figura) {
		switch (palo) {
		case 0:
			System.out.println(figuras[figura] + " de oros");
			break;
		case 1:
			System.out.println(figuras[figura] + " de BASTOS");
			break;
		case 2:
			System.out.println(figuras[figura] + " de ESPADAS");
			break;
		case 3:
			System.out.println(figuras[figura] + " de copas");
			break;
		}
	}

	/**
	 * Calcula la puntuacion dependiendo de la figura que sea.
	 * 
	 * @param figura
	 *            figura de la carta.
	 * @return devuelve la puntuacion a la que corresponde la figura.
	 */
	private static double calcularPuntuacion(int figura) {
		double puntuacion;
		if (figura == 8 || figura == 9 || figura == 10)
			puntuacion = 0.5;
		else
			puntuacion = figura;
		return puntuacion;
	}

	/**
	 * Comprueba la puntuacion para ver si el jugador ha llegado al limite o se
	 * ha pasado.
	 * 
	 * @param acumulador
	 *            puntuacion del jugador en la partida.
	 */
	private static void comprobarPuntuacion(double acumulador) {
		if (acumulador == 7.5)
			System.out
					.println("Conseguiste 7 puntos y medio, has ganado. Enhorabuena!");
		else if (acumulador > 7.5)
			System.out
					.println("Sobrepasaste los 7 puntos y medio, has perdido.");
	}
}