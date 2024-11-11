package unidad2;

import java.util.Scanner;

public class EjemploCondicionales4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Escribir un programa en java que lea dos numeros y una operacion la operacion
		 * podra ser suma, resta, multiplicacion, division y potencia se corresponderan
		 * a los caracteres +,-,*,/,^
		 */

		int num1 = 0, num2 = 0;
		double resultado = 0;
		char operacion = ' ';
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el primer número");
		num1 = teclado.nextInt();
		System.out.println("introduce el segundo número");
		num2 = teclado.nextInt();

		System.out.println("introduce el operacion (+,-,/,*,^):");
		operacion = teclado.next().charAt(0);

		// Cerramos el programa
		teclado.close();

		switch (operacion) {
		case '+':
			resultado = num1 + num2;
			// El break hace que no ejecute el siguiente case
			// Si no hay break pasa automaticamente al siguiente
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '/':
			resultado = (double) num1 / num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '^':
			resultado = Math.pow(num1, num2);
			break;
		default:
			System.out.println("El operador no es valido");
			// El return finaliza la funcion principal
			// En este caso el main, por lo cual el programa principal
			return;

		}

		// Sacamos por pantalla el resultado
		System.out.println("El resultado es: " + resultado);

		// Vamos a generar una nota aleatoria y que saque por pantalla si es un
		// insuficiente un suficiente...
		int nota = (int) (Math.random() * 11 + 1);

		System.out.println("Has sacado un " + nota);
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.print("SUSPENSO");
			break;
		case 5:
			System.out.print("SUFICIENTE");
			break;
		case 6:
			System.out.print("BIEN");
			break;
		case 7:
		case 8:
			System.out.print("NOTABLE");
			break;
		case 9:
		case 10:
			System.out.print("SOBRESALIENTE");
			break;
		case 11:
			System.out.print("ALIEN");
			break;

		}

	}

}
