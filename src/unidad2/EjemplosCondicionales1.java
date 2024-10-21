package unidad2;

import java.util.Scanner;

public class EjemplosCondicionales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leemos de teclado la edad de una persona y le decimos si es mayor de edad o
		// no
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qué edad tienes?");
		// Leemos un entero
		int edad = teclado.nextInt();

		// Con la sentencia if se evalua una condicion
		// si la condicion es cierta entra en el bloque de codigo y lo ejecuta
		if (edad >= 18) {
			System.out.println("Puedes Entrar a la discoteca");
		} else // Si la condicion del if es falsa entra en el código del else
		{
			System.out.println("No puedes Entrar a la discoteca");
		}

		teclado.close();

	}

}
