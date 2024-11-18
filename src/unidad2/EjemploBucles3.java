package unidad2;

import java.util.Scanner;

public class EjemploBucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear un programa que genere un número aleatorio entre 1 y 50
		//Y nos de 5 intentos de adivinarlo
		//Nos dara pistas, si es superior o inferior lo dira y si esta a menos de 2 posiciones
		//dira "caliente, caliente"

		//Generamos un número entre 1 y 50
		int numGenerado = (int) (Math.random() * 50) + 1;
		int num = -1;
		//int numIntentos=5;
		Scanner teclado = new Scanner(System.in);
		boolean encontrado = false;
		System.out.println("Numero Generado:" + numGenerado);
		//Repetimos el numero de intentos 
		for (int numIntentos = 5; numIntentos > 0 && !encontrado; numIntentos--) {
			//Leo el número que el usuario piensa que es el correcto
			System.out.print("intento numero " + numIntentos + ":");
			num = teclado.nextInt();

			if (num == numGenerado) {
				System.out.println("Felicidades, has acertado");
				//Con break hacemos que el bucle se acabe
				//break;

				//Otra opcion de parada de bucle sería poner un booleano que indique el final
				encontrado = true;

				//Tambien eliminando los intentos se acabaría
				//numIntentos = 1;
			} else {
				//No hemos acertado

				//Para ver si esta cerca, hacemos el valor absoluto (pasa a positivo si es negativo)
				//Y comprobamos que la distancia entre los numeros es menos de 3, es decir
				//2 o 1
				if (Math.abs(num - numGenerado) < 3) {

					System.out.println("Caliente, Caliente");
				}

				//Vamos a decirle si el número buscado es mayor o menor
				if (num > numGenerado)
					System.out.println("El numero que buscas es Menor");
				else
					System.out.println("El numero que buscas es Mayor");

			}

		}

		//Leer un número por teclado y decir si es primo o no
		//Un número es primo si solo le divide el 1 o el mismo

		teclado.close();

	}

}
