package unidad1;

public class EjemploOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numAlumnosDAW=56;
		int numAlumnosASIR=32;
		int numAlumnosCETI=19;
		int numAlumnosFPB=19;
		int numAlumnosSMR=70;
		float mediaAlumnos;
		
		
		//Para sumar se usa el +
		int sumaAlumnos = numAlumnosDAW + numAlumnosASIR;
		
		//Para incrementar el valor le sumamos a el mismo lo que toque
		sumaAlumnos = sumaAlumnos + numAlumnosFPB + numAlumnosSMR;
		
		//El operador += incrementa el valor de la variable situada a la izquierda
		//Con el valor que este a la derecha
		sumaAlumnos += numAlumnosCETI;
		
		System.out.println("Los alumnos de informatica totales son: " + sumaAlumnos);
		
		sumaAlumnos = sumaAlumnos - 1; 
		//Esta instruccion es igual a la anterior
		sumaAlumnos -= 1;
		//Esta instruccion es igual a la anterior
		sumaAlumnos--;
		//++ incrementa en 1 una variable numerica
		++sumaAlumnos;
		
		//El operador ++ si se pone a la izquierda, tendrá preferencia y será lo primero
		//que se ejecute, si se pone a la derecha de la variable se ejecutara despues del resto 
		//de operadores o funciones
		System.out.println("Los alumnos de informatica actuales son: " + ++sumaAlumnos);
		
		//La media es la suma de todos los alumnos entre la cantidad de grados
		mediaAlumnos = sumaAlumnos/5;
		
		System.out.println("El resto de dividir es; " + 31%2);
		
		sumaAlumnos *= 2;
		
		
	}

}
