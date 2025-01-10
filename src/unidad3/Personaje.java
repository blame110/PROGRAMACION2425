package unidad3;

public class Personaje {

	//Variables miembro de la clase
	//Todos los objetos que creemos las tendrán

	//Las variables miembro y las funciones de una clase
	//Pueden ser
	// public publicas
	// private privadas
	// protected protegidas, solo las clases hijas pueden usarlas

	//Por defecto si no ponemos nada las variables son publicas
	public int fuerza;
	public int inteligencia;
	public int carisma;
	private int clase;
	//Si las ponemos privadas no serán accesibles directamente desde el objeto
	public int puntosVida;
	private int puntosPoder;

	/**
	 * Constructor principal vacio
	 */
	public Personaje() {

		System.out.println("Generando el personaje...");

		//Utilizamos this para señalar que la variable es miembro de la clase
		//por si hubiera otra variable con el mismo nombre 
		this.fuerza = (int) (Math.random() * 20);
		this.inteligencia = (int) (Math.random() * 20);
		this.carisma = (int) (Math.random() * 20);
		this.puntosVida = (int) (Math.random() * 20);
		this.puntosPoder = (int) (Math.random() * 20);

	}

	/**
	 * Esta funcion ejecuta una tirada de ataque que se calcula con 
	 * un dado de 20 mas la fuerza
	 * @return
	 */
	public int tiradaAtaque() {

		//Ejecutamos la tirada de ataque
		return this.fuerza + (int) (Math.random() * 21);
	}

	//Funciones

	//Las funciones al declararse deben de definir si son publicas/privadas/protegidas
	//y el tipo de dato que devuelven
	//En este caso no quiero que devuelva nada asi que pongo void
	public void recibirDanio(int danio) {
		this.puntosVida = this.puntosVida - danio;
	}

}
