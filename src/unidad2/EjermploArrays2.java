package unidad2;

public class EjermploArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos un array de 10 numeros
		int listaNumeros[] = new int[10];

		//Recorremos todas las posiciones del array y le vamos insertando numeros
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = (int) (Math.random() * 10.0) + 1;
			System.out.println("Numero en pos " + i + " es " + listaNumeros[i]);
		}

		//queremos sacar el numero mayor y menor de todos los que hay en el array
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		//Recorremos todas las posiciones del array buscando max y min
		for (int i = 0; i < listaNumeros.length; i++) {
			//Si el numero actual es mayor que nuestro maximo hasta ahora
			//Este numero es el nuevo maximo
			if (listaNumeros[i] > maxNum) {
				maxNum = listaNumeros[i];
			}
			//Igual para el minimo, en caso de que el actual sea menor que nuestro minimo temporal
			if (listaNumeros[i] < minNum) {
				minNum = listaNumeros[i];
			}

			//Comprobacion de la cantidad de numeros que se repiten
			//Vamos a guardar el número actual
			int numABuscar = listaNumeros[i];
			int cantRep = 0;

			//Recorremos todas las posiciones del array buscando el numero a buscar
			for (int j = 0; j < listaNumeros.length; j++) {
				//Si el numero en la posicion j del array es el numero a buscar
				//Es que hay un numero igual al buscado y incremento la cantidad de repetidos
				if (listaNumeros[j] == numABuscar) {
					//Incrementamos la cantidad de numeros encontrados
					cantRep++;
				}

			}
			//Si hemos encontrado mas de una repeticion lo sacamos por pantalla
			if (cantRep > 1) {
				System.out.println("El número " + numABuscar + " se repite " + (cantRep - 1) + " veces");
			}

		}

		//Mostramos el máximo y el mínimo
		System.out.println("El maximo es " + maxNum);
		System.out.println("El minimo es " + minNum);

	}

}
