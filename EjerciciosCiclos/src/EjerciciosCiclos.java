import java.util.Scanner;

public class EjerciciosCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer un programa que pida un n�mero por teclado.
		 * Se tiene que hacer un recorrido desde 1 hasta el n�mero introducido
		 * Tiene que imprimir la suma de los n�meros pares e impares
		 * Ejemplo: 
		 * N�mero introducido: 12
		 * n�meros pares = 2 + 4 + 6 + 8 + 10
		 * n�meros impares= 1 + 3 + 5 + 7 + 9 + 11*/
		
		Scanner readKeyboard= new Scanner(System.in); // Entrada por teclado
		System.out.println("Introduzca un n�mero entero, por favor. �ste ser� el l�mite de la suma");
		int sum = readKeyboard.nextInt(); 
		sumEvenOdd(sum); //M�todo suma de pares e impares.
		} 
	
		public static void sumEvenOdd(int sum) { //Se llama al m�todo que recibir� un n�mero.
		int sumEven= 0; //Declaro variable de suma de pares, indicando el tipo de dato, en este caso int.
		int sumOdd= 0; // Lo mismo que arriba, pero para suma de impares.
		for (int i=1; i <=sum; i++) { //Ciclo for, el l�mite es sum, es decir, n�mero introducido en l�nea 21.
			if (i % 2 == 0) { //Se comprueba si es par o impar.
				sumEven += i; //+= operador de asignaci�n compuesta. 
			} else {
				sumOdd += i; //Podr�a usar sumOdd=sumOdd + i, en lugar del +=.
			}
		}
		System.out.println("La suma de los n�meros pares de "+ sum + " " + "es: " +sumEven); //Imprimimos :) Se coloca fuera del ciclo for porque sino imprime cada suma previa.
		System.out.println("La suma de los n�meros impares de "+ sum + " " + "es: " +sumOdd);
		}
		
	}
	


