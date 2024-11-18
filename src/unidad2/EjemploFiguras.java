package unidad2;

import java.util.Scanner;

public class EjemploFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hacer con # un cuadrado un rectangulo un triangulo un rombo una escalera
		 * 
		 * ####
		 * ####
		 * ####
		 * ####
		 */
		int base = 6;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cual es la base?: ");
		base = teclado.nextInt();

		//Repetimos size veces cada linea
		for (int i = 0; i < base; i++) {
			//Dibujamos 1 linea repitiendo size veces el caracter
			for (int j = 0; j < base; j++) {
				System.out.print("#");
			}

			//Pasamos a la siguiente linea
			System.out.println();
		}

		//Despues del cuadrado dibujaremos un triangulo se lee por teclado la base
		//Ejemplo de triangulo base  
		//       #
		//      ###
		//     ##### 
		//    #######
		//   #########
		//  ###########

		//7base 3 altura 2
		//base 5 altura 3
		//base 7 altura 4
		//base 9 altura 5
		//base 11 altura 6
		//Hay que escribir base/2+1 veces

		//Bucle principal que va escribiendo cada linea
		for (int i = 1; i <= (base / 2 + 1); i++) {

			//Antes de escribir los # hay que poner espacios para que quede alineado
			//Hay que escribir la mitad de la base de espacios en blanco
			//Y luego en cada linea un espacio menos
			for (int z = 1; z < ((base) / 2 - i + 2); z++) {
				System.out.print(" ");
			}

			//Para escribir cada linea utilizamos un bucle
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("#");
			}
			//Pasamos a la siguiente linea
			System.out.println();

		}

		//POR HACER
		//MODIFICAR EL TRIANGULO Y CONVERTIRLO EN UN ROMBO

		teclado.close();

	}

}
