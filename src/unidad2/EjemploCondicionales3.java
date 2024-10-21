package unidad2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjemploCondicionales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Vamos a comprobar si un alumno ha sacado el carnet de conducir Para ello
		 * leera de teclado los siguientes datos edad, numFallosExamen, tasapagada,
		 * fechaExamenPractico, numGolpes, jamon El programa debera de comprobar si
		 * tiene derecho a carnet para ello debera tener mas de 18 años y menos de 4
		 * fallos en el examen y la tasa pagada en caso de cumplirlo se le pedira la
		 * fecha del examen practico y los golpes Si la fecha es anterior a la actual o
		 * tiene menos de dos golpes tambien aprueba En todo caso tambien tiene el
		 * carnet si ha regalado un jamon
		 */

		/************************************
		 * VARIABLES
		 ************************************/
		int edad = 0;
		int numFallosEx = 0;
		boolean tasaPagada = false;
		String sTasaPagada = "";
		// Por defecto no tenemos carnet
		boolean tieneCarnet = false;
		LocalDate fechaExamen;
		String sFechaExamen;
		int numGolpes = 0;
		boolean jamon = false;
		Scanner teclado = new Scanner(System.in);

		System.out.println("has regalado un jamón (true/false)");
		jamon = teclado.nextBoolean();

		// Si me dan un jamon tengo el carnet, pongo a true el boolean tieneCarnet
		if (jamon) {
			tieneCarnet = true;
		} else {

			System.out.println("Cual es tu edad?: ");
			edad = teclado.nextInt();
			System.out.println("Cuantas preguntas fallaste en el teórico?: ");
			numFallosEx = teclado.nextInt();
			System.out.println("Has pagado las tasas (S/N)");

			// Leemos como String si hemos pagado la tasa
			sTasaPagada = teclado.next();

			// Operador ternario si la condicion es cierta, asigna el valor que viene
			// despues de la ?
			// Si es falsa asigna el valor del final
			tasaPagada = sTasaPagada.equalsIgnoreCase("S") ? true : false;
			/*
			 * El operador ternario anterior es igual a este if if
			 * (sTasaPagada.equalsIgnoreCase("S")) tasaPagada = true; else tasaPagada =
			 * false;
			 */

			if (edad >= 18 && numFallosEx < 4 && tasaPagada) {

				// Para leer la fecha de teclado hay que leerla como un String
				// Pero puede tener muchisimos formatos
				System.out.println("Introduce la fecha del examen (dd/mm/yyyy)");
				sFechaExamen = teclado.next();
				// Creamos el formato en el cual se va a interpretar la fecha
				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				// El parse cambia el String de tipo de dato a fecha
				// Utilizamos el formato que hemos definido antes
				fechaExamen = LocalDate.parse(sFechaExamen, formateador);

				System.out.println("Cuantos golpes pegaste en el practico? ");
				numGolpes = teclado.nextInt();

				// Fecha actual
				LocalDate hoy = LocalDate.now();

				// ultima comprobacion menos de dos golpes y fecha anterior a la actual
				if (numGolpes < 2 || fechaExamen.isBefore(hoy)) {

					tieneCarnet = true;

				}

			}

		}

		// Si tiene el carnet le sacamos un mensaje por pantalla
		if (tieneCarnet)
			System.out.println("Felicidades, puedes pasar a recoger el carnet en un plazo aproximado de 4 a 20 años");
		else
			System.out.println("Try again, insert coin");

		teclado.close();
	}

}
