package unidad2;

import java.util.Scanner;

public class EjemploBucles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Sacar los números pares entre 1 y 20
		// Recorremos los números entre 1 y 20 y sacamos
		// solo los que cumplan ser pares (modulo entre 2 igual a 0)
		for (int i = 1; i <= 20; i++) {

			//El numero es par si su modulo entre 2 da 0 (el resto de la division)
			if (i % 2 == 0)
				System.out.println(i);
		}
		System.out.println("NUMEROS PARES ENTRE 1 Y 40");
		//REalizar un bucle que muestre todos los pares del 1 al 40
		for (int i = 0; i < 40; i++) {
			//Para los números pares no ejecutamos el bucle
			if ((i + 1) % 2 != 0)
				continue;

			System.out.println(i + 1);
		}

		System.out.println("Version 2:");

		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}

		// mostrar todas las tablas de multiplicar de 1 a 10

		// Para cada numero j sacamos su tabla de multiplicar
		for (int j = 0; j < 10; j++) {

			System.out.println("Tabla de multiplicar del numero " + (j + 1));
			System.out.println("-----------------------------------");

			// Tabla de multiplicar del numero j
			for (int i = 0; i < 10; i++) {
				System.out.println((j + 1) + " x " + (i + 1) + " = " + (j + 1) * (i + 1));
			}

			// Pongo un espaciado antes de la siguiente linea
			System.out.println();
		}

		//Leer de teclado 10 numeros y sacar la media, el máximo y el mínimo
		int i = 0, num = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		//La suma se tiene que inicializar a 0
		double media = 0;

		while (i < 5) {
			System.out.print("Introduce el número " + (i + 1) + ":");
			num = teclado.nextInt();

			//Vamos sumando todos los numeros
			media = media + num;

			//Si el número que leo es mayor que el maximo hasta este momento, ese numero es el nuevo maximo
			//Por lo cual se lo asigno como valor maximo
			if (num > max)
				max = num;
			//Para calcular el minimo vamos comprobando si el numero leido es menor que el min actual
			if (num < min)
				min = num;

			i++;
		}

		//Fuera del bucle dividimos la suma de los numeros entre
		//La cantidad de elementos para calcular la media
		media = media / 5;

		System.out.println("La media es: " + media);
		System.out.println("El máximo es: " + max);
		System.out.println("El mínimo es: " + min);

		//Leer un número y mostrar su factorial y los divisores hasta 100
		//El factorial de un número es la multiplicacion de todos los números desde 1 hasta dicho numero
		//Por ejemplo el factorial de 5 es 1*2*3*4*5 =120
		System.out.print("Introduce un número para calcular su factorial:");
		num = teclado.nextInt();
		//Si es una multiplicacion lo que va a guardarse tiene que inicializarse a 1
		int factorial = 1;

		//Para hacer el factorial vamos desde 1 hasta el número leido
		//No defino la i (int i) porque ya esta definida antes
		for (i = 1; i <= num; i++) {
			factorial = i * factorial;
		}

		System.out.println("El factorial de " + num + " es " + factorial);
		teclado.close();
	}

}
