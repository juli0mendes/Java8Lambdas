package br.com.juli0mendes.methodsdefault;

/**
 * @author Julio Cesar Mendes
 * 
 *         The Class Java8MethodsDefaultWithMultipleInheritance.
 */
public class Java8MethodsDefaultWithMultipleInheritance {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Pessoa().correr();
		new Pessoa().pilotar();
	}

	/**
	 * The Interface Corredor.
	 */
	interface Corredor {

		/**
		 * Correr rapido.
		 */
		default void correr() {
			System.out.println("Corredor correndo.");
		}
	}

	/**
	 * The Interface Piloto.
	 */
	interface Piloto {

		/**
		 * Pilotar.
		 */
		default void pilotar() {
			System.out.println("Piloto pilotando.");
		}
	}

	/**
	 * The Class Pessoa.
	 */
	static class Pessoa implements Corredor, Piloto {
	}
}
