import java.util.Scanner;

public class EjerciciosCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer un programa que pida un número por teclado.
		 * Se tiene que hacer un recorrido desde 1 hasta el número introducido
		 * Tiene que imprimir la suma de los números pares e impares
		 * Ejemplo: 
		 * Número introducido: 12
		 * números pares = 2 + 4 + 6 + 8 + 10
		 * números impares= 1 + 3 + 5 + 7 + 9 + 11*/
		
		Scanner readKeyboard= new Scanner(System.in); // Entrada por teclado
		System.out.println("Introduzca un número entero, por favor. Éste será el límite de la suma");
		int sum = readKeyboard.nextInt(); 
		sumEvenOdd(sum); //Método suma de pares e impares.
		} 
	
		public static void sumEvenOdd(int sum) { //Se llama al método que recibirá un número.
		int sumEven= 0; //Declaro variable de suma de pares, indicando el tipo de dato, en este caso int.
		int sumOdd= 0; // Lo mismo que arriba, pero para suma de impares.
		for (int i=1; i <=sum; i++) { //Ciclo for, el límite es sum, es decir, número introducido en línea 21.
			if (i % 2 == 0) { //Se comprueba si es par o impar.
				sumEven += i; //+= operador de asignación compuesta. 
			} else {
				sumOdd += i; //Podría usar sumOdd=sumOdd + i, en lugar del +=.
			}
		}
		System.out.println("La suma de los números pares de "+ sum + " " + "es: " +sumEven); //Imprimimos :) Se coloca fuera del ciclo for porque sino imprime cada suma previa.
		System.out.println("La suma de los números impares de "+ sum + " " + "es: " +sumOdd);
		}
		
	}
	


