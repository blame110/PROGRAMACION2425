package unidad1;

import java.util.Iterator;

public class EjemploMensajeInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definición de variables
		// Primero el tipo de dato y despues el nombre(identificador)
		// Solo se pueden definir una vez dentro del mismo bloque de código
		int numHijos = 2;
		String nombre = "Adulis";
		String apellidos = " Garcia";
		String mensaje;
		char escalera = 'B';
		float pi;
		double calculoInfinito;

		//Esto es un comentario de linea
		/* 
		 * Esto es un comentario de muchas lineas
		 */
		
		System.out.println("Mi nombre es " + nombre);
		
		nombre= "Victor Pablo";
		
		System.out.println("Mi nombre es " + nombre);
		
		nombre = nombre + " Galvan Florez";
		
		System.out.println("Mi nombre es " + nombre);

		//Para concatenar (unir o juntar) varias variables o valores se utiliza
		//el operador "+" dependiendo del tipo de valor hara una cosa u otra
		mensaje = nombre + " tiene " + numHijos + " hijos";
		
		System.out.println(mensaje);
		
		
		//para asignar un valor a una variable utilizamos el operador =
		//a la izquierda va la variable y a la derecha el valor que se le da
		apellidos = "Garcia Perez";
		pi = 3.14159f;
		calculoInfinito = 2431234213423423423423423423232342342342342423423423442342.43434;

		System.out.print("Primer Mensaje");

	}

}
