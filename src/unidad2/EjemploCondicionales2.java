package unidad2;

public class EjemploCondicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escribe un programa que lea una nota y nos diga
		// si es un insuficiente, suficiente, bien , notable, sobresaliente o matricula
		double nota = (Math.random() * 10);

		System.out.println("Tu nota es " + nota);

		// Si ha sacado menos de 5 ha suspendido
		if (nota < 5) {
			System.out.println("Ha suspendido");
			System.out.println("Lo siento mucho");
		} else
		// Si estamos dentro implica que la nota es mayor o igual a 5
		// Si ademas es menor de 6 implica que es un suficiente
		if (nota < 6) {
			System.out.println("Tienes un suficiente");
		} else if (nota < 7) {
			System.out.println("Tienes un bien");
		} else if (nota < 9) {
			System.out.println("Tienes un notable");
		} else if (nota < 10) {
			System.out.println("Tienes un sobresaliente");
		} else {
			System.out.println("Tienes una matricula");
		}

	}

}
