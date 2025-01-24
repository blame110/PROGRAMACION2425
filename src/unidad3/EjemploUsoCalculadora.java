package unidad3;

public class EjemploUsoCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Calculadora.suma(3, 4));

		System.out.println(Calculadora.suma("550"));

		double[] numeros = { 2.0, 4.0, 5.0, 12.0 };

		System.out.println(Calculadora.suma(numeros));

		System.out.println(Calculadora.sumaRecursiva(numeros));

		System.out.println(Calculadora.factorial(5));

		System.out.println(Calculadora.factorialRecursivo(5));
	}

}
