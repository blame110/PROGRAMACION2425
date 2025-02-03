package unidad3;

import java.util.Scanner;

public class Mundo {

	public static final char TIERRA = 'T';
	public static final char BOSQUE = 'B';
	public static final char MONTANA = 'M';

	public static final char TIPO_JUGADOR = 'J';
	public static final char TIPO_ENEMIGO = 'E';

	//El juego tendrá únicamente un enemigo y un jugador
	public Enemigo enemigoP;
	public Personaje jugador;

	//Variables para guardar el terreno pisado por los personajes
	private char tierraJ = 'J';
	private char tierraE = 'E';

	//El mapa sera un array de dos dimensiones de string
	private char[][] mapa = { { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
			{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }, { 'T', 'T', 'T', 'T', 'M', 'M', 'M', 'M', 'M', 'M' },
			{ 'T', 'T', 'T', 'T', 'B', 'B', 'B', 'B', 'B', 'B' }, { 'T', 'T', 'T', 'T', 'B', 'B', 'B', 'B', 'B', 'B' },
			{ 'M', 'T', 'T', 'T', 'B', 'B', 'B', 'B', 'B', 'B' }, { 'M', 'M', 'M', 'M', 'B', 'B', 'B', 'B', 'B', 'B' },
			{ 'M', 'M', 'M', 'M', 'B', 'B', 'B', 'B', 'B', 'B' }, { 'M', 'M', 'M', 'M', 'M', 'B', 'B', 'B', 'B', 'M' },
			{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' } };

	public void mostrarMapa() {
		//Recorremos todas las filas del mapa (cada fila es un subarray)
		for (int i = 0; i < mapa.length; i++) {
			//Recorremos cada fila o subarray desde 0 hasta la longitud de ese subarray
			for (int j = 0; j < mapa[i].length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
			//Una vez hemos dibujado la fila completa hay que pasar a la siguiente linea
			System.out.println();
		}
	}

	/**
	 * Esta funcion posiciona en el mapa a el jugador o el enemigo
	 * @param tipo es el tipo de elemento que va a poscionar en el mapa
	 */
	public void posicionarPersonajes(int tipo) {

		//Generamos aleatoriamente dos posiciones
		int posY = (int) (Math.random() * mapa.length);
		int posX = (int) (Math.random() * mapa.length);
		boolean enemigoCerca = false;

		//si es un enemigo lo colocamos del tiron y finalizamos
		if (tipo == Mundo.TIPO_ENEMIGO) {
			//Guardamos la tierra para poder volver a dibujarla despues
			this.tierraE = mapa[posY][posX];
			//Posicionamos al enemigo
			mapa[posY][posX] = Mundo.TIPO_ENEMIGO;
			//Le damos esa posicion al enemigo
			this.enemigoP.setPosX(posX);
			this.enemigoP.setPosY(posY);
			return;
		}

		//Seguimos tratando al jugador
		//Comprobamos que no hay enemigos cerca
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (mapa[posY + i][posX + j] == Mundo.TIPO_ENEMIGO)
					enemigoCerca = true;
			}
		}

		//Mientras el enemigo este cerca hay que seguir cambiando de posicion
		while (enemigoCerca) {
			//Creo nuevas coordenadas
			posY = (int) (Math.random() * mapa.length);
			posX = (int) (Math.random() * mapa.length);
			//Hay que presuponer que no hay enemigos en la costa
			//en las nuevas posiciones generadas
			enemigoCerca = false;

			//Comprobamos que no hay enemigos cerca
			for (int i = -1; i <= 1; i++) {
				for (int j = -1; j <= 1; j++) {
					if (mapa[posY + i][posX + j] == Mundo.TIPO_ENEMIGO)
						enemigoCerca = true;
				}
			}
		}

		//Si llegamos aqui implica que no hay enemigos cerca
		//Ponemos el jugador en la posicion indicada
		//Guardamos la tierra que va a ser sobreescrita por el jugador
		this.tierraJ = mapa[posY][posX];
		mapa[posY][posX] = Mundo.TIPO_JUGADOR;
		//Le damos esa posicion al enemigo
		this.jugador.setPosX(posX);
		this.jugador.setPosY(posY);
		return;

	}

	/**
	 * Constructor del Mundo
	 * Crea al jugador y al enemigo y los posiciona en el mapa
	 */

	public void moverJugador(Scanner teclado) {
		//leemos un caracter de teclado
		char movimiento = teclado.next().toLowerCase().charAt(0);

		switch (movimiento) {
		case 'w':
			//Quiere ir para arriba si ya esta arriba no nos movemos
			if (jugador.getPosY() > 0)
				jugador.setPosY(jugador.getPosY() - 1);
			break;

		case 's':
			//Quiere ir para abajo si ya esta abajo no nos movemos
			if (jugador.getPosY() < 9)
				jugador.setPosY(jugador.getPosY() + 1);
			break;

		case 'a':
			//Quiere ir para la izquierda si ya esta a la izquierda del todo no hacemos nada
			if (jugador.getPosX() > 0)
				jugador.setPosX(jugador.getPosX() - 1);
			break;

		case 'd':
			//Quiere ir para abajo si ya esta abajo no nos movemos
			if (jugador.getPosX() < 9)
				jugador.setPosX(jugador.getPosX() + 1);
			break;
		}

	}

	public Mundo() {

		Personaje raistlin = new Personaje();
		raistlin.setClase(Personaje.CLASE_MAGO);
		Enemigo orcoOscuro = new Enemigo(3, 23, 1, 5, 1, 23, 0, 350, 15, Enemigo.BOSQUE_OSCURO);

		//Posicionamos al enemigo
		posicionarPersonajes(TIPO_ENEMIGO);
		posicionarPersonajes(TIPO_JUGADOR);

	}

	public void iniciarMundo() {
		// TODO Auto-generated method stub
		boolean juegoFinalizado = false;
		Scanner teclado = new Scanner(System.in);

		//El juego se finalizará cuando el enemigo atrape al personaje
		while (!juegoFinalizado) {
			//Mostramos el mapa
			this.mostrarMapa();

		}

		teclado.close();
	}

}
