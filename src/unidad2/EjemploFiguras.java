package unidad2;

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
		int size = 6;

		//Repetimos size veces cada linea
		for (int i = 0; i < size; i++) {
			//Dibujamos 1 linea repitiendo size veces el caracter
			for (int j = 0; j < size; j++) {
				System.out.print("#");
			}

			//Pasamos a la siguiente linea
			System.out.println();
		}

	}

}
