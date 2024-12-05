package unidad2;

import java.util.Scanner;

public class SolucionExamenBicis {

	public static final int CAT_MTB = 1;
	public static final int CAT_DESC = 2;
	public static final int CAT_CAR = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		//Definicion de variables
		String modelo = "";
		String marca = "";
		double precio = 0;
		int categoria = 0;
		int stock;
		int punTec = 0;
		int numBicis = 0;

		//Variables del tratamiento
		double mediaPrecio = 0;
		double maxPrecio = Integer.MIN_VALUE;
		double minPrecio = Integer.MAX_VALUE;
		String modeloMax = "";
		String modeloMin = "";
		int sumaStock = 0;
		String[] listaModelosCond;
		String[] listaModelosStock;

		//Preguntamos al usuario cuantas bicicletas leemos
		System.out.print("Cuantas bicicletas vamos a leer? ");
		numBicis = teclado.nextInt();

		//El tamaño de elementos del array sera el número de bicicletas a leer
		//Ya que pueden cumplir todas la condicion
		listaModelosCond = new String[numBicis];
		listaModelosStock = new String[numBicis];

		//Vamos leyendo numBicis veces todos los datos de cada bicicleta
		for (int i = 0; i < numBicis; i++) {

			/*************************************************
			 *    INTRODUCCION DE DATOS
			 * ***********************************************/

			System.out.print("Introduce el modelo de la bicicleta " + (i + 1));
			modelo = teclado.next();

			//Validacion de la marca
			//Mientras no sea ninguna de las tres marcas validas
			//le hacemos repetir indefinididamente que ponga la marca
			do {
				System.out.print("Introduce la marca de la bicicleta " + (i + 1) + "(Orbea, Decathlon o BH)");
				marca = teclado.next();
			} while (!marca.equalsIgnoreCase("orbea") && !marca.equalsIgnoreCase("decathlon")
					&& !marca.equalsIgnoreCase("bh"));

			System.out.print("Introduce el precio de la bicicleta " + (i + 1));
			precio = teclado.nextDouble();

			do {
				System.out.print("Introduce el numero de la categoria de la bicicleta " + (i + 1)
						+ "(1-MTB,2-Descenso,3-Carretera)");
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 3);

			System.out.print("Introduce el stock de la bicicleta " + (i + 1));
			stock = teclado.nextInt();

			do {
				System.out.print("Introduce la puntuación técnica de la bicicleta " + (i + 1) + "(Entre 1 y 10)");
				punTec = teclado.nextInt();
			} while (punTec < 1 || punTec > 10);

			/***************************************************
			 * 	   TRATAMIENTO DE DATOS
			 * *************************************************/

			//Para calcular la media vamos sumando todos los precios de las bicis
			mediaPrecio = mediaPrecio + precio;

			//Para calcular el precio maximo vamos comparando todos los precios
			// de las bicicletas y si es mayor que nuestro maximo
			//Pasara a ser el nuevo maximo
			if (precio > maxPrecio) {
				maxPrecio = precio;
				modeloMax = modelo;
			}

			//Para el minimo es igual pero con <
			if (precio < minPrecio) {
				minPrecio = precio;
				modeloMin = modelo;
			}

			//Mostrar el modelo de las bicicletas de carreras cuya puntuación sea superior 
			//a 9 o cuesten menos de 190 euros
			if (categoria == CAT_CAR && (punTec > 9 || precio < 190)) {
				listaModelosCond[i] = modelo;
			}

			//Mostrará el Stock total de bicicletas de tipo Descenso
			if (categoria == CAT_DESC)
				sumaStock += stock;

			//Cuando una bicicleta tenga stock 0 y puntuación superior a 6, 
			//guardará su modelo en un array y mostrará al final la lista de productos 
			//sin stock a pedir de nuevo.
			if (stock == 0 && punTec > 6)
				listaModelosStock[i] = modelo;

		}

		//Una vez hemos acabado el bucle tenemos todos los precios sumados 
		//los dividimos entre la cantidad de bicis para sacar la media
		mediaPrecio = mediaPrecio / numBicis;

		System.out.println("El precio maximo es " + maxPrecio);
		System.out.println("El modelo de precio maximo es " + modeloMax);
		System.out.println("El precio minimo es " + minPrecio);
		System.out.println("El modelo de precio minimo es " + modeloMin);
		System.out.println("La media de precios es " + mediaPrecio);
		System.out.println("La suma de Stock de descenso " + sumaStock);

		System.out.println("LISTA DE MODELOS QUE CUMPLEN LA CONDICION 3");
		//Recorremos los nombres de los modelos de la condicion3 y los sacamos por pantalla
		for (int i = 0; i < listaModelosCond.length; i++) {
			if (listaModelosCond[i] != null)
				System.out.println(listaModelosCond[i]);
		}

		System.out.println("LISTA DE MODELOS SIN STOCK");
		for (int i = 0; i < listaModelosStock.length; i++) {
			if (listaModelosStock[i] != null)
				System.out.println(listaModelosStock[i]);
		}

		teclado.close();

	}

}
