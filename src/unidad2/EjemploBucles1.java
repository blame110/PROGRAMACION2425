package unidad2;

import java.util.Scanner;

public class EjemploBucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numTabla = 0;

		// El bucle for repite el código entre llaves un numero finito de veces
		// Normalmente se utiliza una variable contadora (i en este caso)
		// y se repite mientras la condicion sea cierta
		// Es importante que dentro del código o en la tercera parte del for
		// Haya instrucciones que permitan que la condicion sea falsa y acabe el bucle
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1);
		}

		System.out.print("Introduce un número para hacer la tabla de multiplicar:");
		numTabla = teclado.nextInt();

		System.out.println("Tabla de multiplicar del " + numTabla);

		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.println(numTabla + " x " + (i + 1) + " = " + numTabla * (i + 1));
		}

		teclado.close();
	}

}
