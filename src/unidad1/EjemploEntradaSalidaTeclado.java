package unidad1;

import java.util.Scanner;

public class EjemploEntradaSalidaTeclado {

	/**
	 * Comentario javadoc
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		// Comentario de una linea
		String nombre = "";
		int edad = 23;
		char sexo = 'p';
		float sueldo = 1300.4f;
		// El numero de telefono es un string ya que existe la posibilidad de que se
		// introduzca un
		// elemento no numerico
		String telefono = "(980) 633422";
		// Los valores boolean pueden ser true o false
		// Se les puede asignar una expresion logica que la evalua como true o false
		boolean esHombre = true;
		boolean esMayorEdad = true;

		// Creamos un objeto de tipo teclado para poder leer por la terminal
		Scanner teclado = new Scanner(System.in);

		// Mensaje para leer el teclado
		System.out.println("¿Tu nombre cual ser?: ");
		// Leemos el nombre de teclado
		nombre = teclado.next();

		// Leemos el sexo
		System.out.print("Sexo (M/F): ");
		sexo = teclado.next().charAt(0);

		System.out.println("Cuántos años tienes? ");
		// Leemos un entero que es la edad de teclado
		// Para eso utilizamos nextint
		edad = teclado.nextInt();

		// Leemos el sueldo
		System.out.print("Cuánto cobras al mes? ");
		// Leemos un float utilizamos nextfloat
		sueldo = teclado.nextFloat();

		esMayorEdad = (edad >= 18);

		System.out.println("¿El alumno es mayor de edad? " + esMayorEdad);

		// Mostramos el nombre del alumno
		System.out.println("El nombre del alumno es " + nombre + " y cobra " + sueldo + " \n,y su sexo es " + sexo);

		/*
		 * 
		 * Comentario de muchas lineas
		 */
		// Cerramos el teclado cuando ya no lo vayamos a utilizar
		teclado.close();
	}

}
