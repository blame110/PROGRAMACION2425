package unidad1;

public class EjemploComparadores {

	public static void main(String[] args) {

		int edad = 16;
		String nombre = "Elisabetta";
		float nota = (10 + 7) / 2;
		int numModSup = 7;
		boolean traeBebida = true;
		boolean llevaZapatillas = false;
		int numAcomp = 2;
		float rentaFamiliar = 19999;
		int numFamiliares = 4;
		boolean padronFuera = false;
		String victimaTerrorismo = "si";
		String victimaMaltrato = "No";

		// El valor inicial para entrar es falso, ya que por defecto
		// Nadie puede entrar a la graduacion
		boolean puedeEntrarGrad = false;
		boolean gradoAprob = false;
		boolean becaTrans = false;

		/*
		 * El alumno puede entrar en el acto de graduacion final de fp si y solo si es
		 * mayor de edad ha aprobado 8 modulos o mas viene con bebida no trae zapatillas
		 * deportivas trae menos de tres acompañantes
		 */

		// El operador > es cierto si el numero a la izquierda es mayor que el de la
		// derecha
		// Estrictamente, si son iguales es falso
		System.out.println("Es mayor que 18?" + (edad > 18));
		System.out.println("Es mayor o igual  que 18?" + (edad >= 18));

		System.out.println("El alumno esta suspenso?" + (nota < 5));

		// Combinamos todas las condiciones con el operador logico y &&
		puedeEntrarGrad = edad >= 18 && numModSup >= 8 && traeBebida == true && llevaZapatillas != true && numAcomp < 3;

		// Aprueba el modulo si es mayor de 17 años, y cumple una de las siguiente
		// condiciones,
		// La nota media es mayor de 4.5 o tiene 6 modulos aprobados o mas

		gradoAprob = edad > 17 && (nota > 4.5 || numModSup >= 6);

		// El alumno consigue la beca de transporte si cumple que su renta familiar es
		// inferior a 20mil euros
		// la familia tiene entre 3 y 6 personas, y no esta empadronado en otra
		// provincia y cumple que es victima de
		// terrorismo o de maltrato

		// Nota1: El operador ! (no) niega (resultado contrario) la condicion que le
		// sigue
		// Nota2: Para comparar cadenas String utilizamos la funcion equals(cadena)
		// Nota 3: Con equals ignorecase da igual letras en mayusculas que minusculas

		becaTrans = rentaFamiliar < 20000 && (numFamiliares >= 3 && numFamiliares <= 6) && !padronFuera
				&& (victimaTerrorismo.equalsIgnoreCase("Si") || victimaMaltrato.equals("Si"));

		//

		System.out.println("El alumno puede entrar a la graduacion? " + puedeEntrarGrad);
		System.out.println("Ha aprobado el grado? " + gradoAprob);
		System.out.println("Le conceden la ayuda de transporte " + becaTrans);
	}

}
