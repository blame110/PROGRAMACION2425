package unidad3;

public class EjemploUsoPersonaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hemos creado una clase denominada Personaje
		 * Las variables de una clase se denominan objetos
		 * Para crear un objeto utilizamos la palabra reservada new
		 * La clase es el fichero java donde declaramos las variables y funciones que 
		 * los objetos pueden utilizar
		 * Un objeto es como una variable de esa clase que puede guardar datos
		 * y ejecutar las funciones
		 */
		//Creamos un arma
		//Para poder usar un objeto primero hay que crearlo
		//Se utiliza la palabra reserva new para indicar que lo creamos
		//Cuando lo creamos realmente se llama a una funcion de la clase arma 
		//que se denomina contructor
		Arma arcoGelido = new Arma();

		Arma lanzaPicas = new Arma("lanza Picas", "multiples picas a la vez", 0, 20, 0, 3);

		String nombre = "pepe";

		//Creamos un personaje con new y el nombre de la clase
		Personaje aragorn = new Personaje();
		//Para acceder a las variables miembro de la clase se utiliza el .
		aragorn.fuerza = 13;

		System.out.println("El personaje tiene " + aragorn.inteligencia + " puntos de inteligencia");

		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");
		int golpe = 4;
		aragorn.recibirDanio(golpe);

		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");

		System.out.println("Tirada de ataque de aragorn: " + aragorn.tiradaAtaque());

		System.out.println("Descripcion del arma: " + arcoGelido.getDescripcion());

		arcoGelido.setDescripcion("Congela los higadillos");

		System.out.println("Descripcion del arma: " + arcoGelido.getDescripcion());

		System.out.println("Datos del arma " + arcoGelido);
	}

}
