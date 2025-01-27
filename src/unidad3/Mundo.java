package unidad3;

public class Mundo {

	public static final char TIERRA = 'T';
	public static final char BOSQUE = 'B';
	public static final char MONTANA = 'M';

	public static final char TIPO_JUGADOR = 'J';
	public static final char TIPO_ENEMIGO = 'E';

	//El juego tendrá únicamente un enemigo y un jugador
	public Enemigo enemigoP;
	public Personaje jugador;

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
			mapa[posY][posX] = Mundo.TIPO_ENEMIGO;
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
		mapa[posY][posX] = Mundo.TIPO_JUGADOR;
		return;

	}

	public Mundo() {

		Personaje raistlin = new Personaje();
		raistlin.setClase(Personaje.CLASE_MAGO);
		Enemigo orcoOscuro = new Enemigo(3, 23, 1, 5, 1, 23, 0, 350, 15, Enemigo.BOSQUE_OSCURO);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
