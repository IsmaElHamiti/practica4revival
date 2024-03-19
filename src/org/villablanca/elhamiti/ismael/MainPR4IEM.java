package org.villablanca.elhamiti.ismael;

import daw.com.Pantalla;
import daw.com.Teclado;

public class MainPR4IEM {

	/**
	 * @author Isma
	 * @param args Argumentos de invocación del programa
	 * @version 2.163.0
	 * 
	 */
	
	public static void main(String[] args) {

		// Inicializa un array de cinco posiciones
		
		int[] array = new int[5]; 
		// Almacena cinco elementos recibidos por la consola.

		for (int i = 0; i < 5; i++) { 

		// Utilizamos la biblioteca daw.jar para no usar el Java.Scanner
		array[i] = Teclado.leerInt("Introduce un número para almacenar:"); 

		 }
		
		// Llamamos a FiltrarImpares para hacer la cosa
		filtrarImparesIEM(array);
	}
	
	/**
	 * <p>Un método que filtra los números que recibe y manda un mensaje por pantalla que indica la posición y el número cuando es par usando el método <code>esPar</code>.
	 * </p>
	 * 
	 * 
	 * @param elementos Array de números recibidos por pantalla
	 * @since 2.0.1
	 * 
	 * 
	 */
	
	
	public static void filtrarImparesIEM(int[] elementos) {
		
		for (int i = 0; i < 5; i++) {
			if (esPar(elementos[i])) {
				Pantalla.escribirString("La posición "+ (i+1) + " del array es par. (" 
			+ elementos[i] + ")");
				Pantalla.escribirSaltoLinea();
			}
		}
				
		
	}

	/**
	 * <p>Comprueba si el número recibido es par o impar usando el módulo 2.
	 * </p>
	 * 
	 * @param entero Número a comprobar
	 * @return true si es par, false si es impar
	 * @since 1.0.0
	 * @see <a href="https://aulavirtual3.educa.madrid.org/ies.villablanca.madrid/mod/assign/view.php?id=153436">Enlace al ejercicio 4 de Eclipse</a>
	 */

	public static boolean esPar(int entero){

	return entero%2==0;

	}
}
