package unidad1;

public class EjemploComparadores {

	public static void main(String[] args) {
		
		int edad=18;
		String nombre = "Elisabetta";
		float nota = 4.9f;
		int numModSup =99;
		boolean traeBebida = true;
		boolean zapatillas = false;
		int numAcomp = 2;
		//El valor inicial para entrar es falso, ya que por defecto
		//Nadie puede entrar a la graduacion
		boolean puedeEntrarGrad =false;
		
		
		/*
		 * El alumno puede entrar en el acto de graduacion final de fp si y solo si
		 * es mayor de edad
		 * ha aprobado 8 modulos o mas
		 * viene con bebida
		 * no trae zapatillas deportivas
		 * trae menos de tres acompañantes
		 */
		
		//El operador > es cierto si el numero a la izquierda es mayor que el de la derecha
		//Estrictamente, si son iguales es falso
		System.out.println("Es mayor que 18?" + (edad>18));
		System.out.println("Es mayor o igyal  que 18?" + (edad>=18));
		
		System.out.println("El alumno esta suspenso?" + (nota<5));
		
		//Combinamos todas las condiciones con el operador logico y &&
		puedeEntrarGrad = edad>=18 && numModSup>=8 && traeBebida==true && zapatillas!=true && numAcomp<3;
		
		
		System.out.println("El alumno puede entrar a la graduacion? " + puedeEntrarGrad);
		
	}
	
}
