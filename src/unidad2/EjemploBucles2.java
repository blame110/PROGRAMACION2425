package unidad2;

public class EjemploBucles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sacar los números pares entre 1 y 20
		// Recorremos los números entre 1 y 20 y sacamos
		// solo los que cumplan ser pares (modulo entre 2 igual a 0)
		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0)
				System.out.println(i);
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

	}

}
