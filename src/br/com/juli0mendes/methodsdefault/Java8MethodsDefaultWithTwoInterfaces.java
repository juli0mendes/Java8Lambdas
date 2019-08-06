package br.com.juli0mendes.methodsdefault;

/**
 * @author Julio Cesar Mendes
 * 
 * The Class Java8MethodsDefaultTwo.
 */
public class Java8MethodsDefaultWithTwoInterfaces {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Pessoa().correrRapido();
	}

	/**
	 * The Interface Corredor.
	 */
	interface Corredor {
		
		/**
		 * Correr rapido.
		 */
		default void correrRapido() {
			System.out.println("Corredor correndo rápido.");
		}
	}
	
	/**
	 * The Interface Piloto.
	 */
	interface Piloto {
		
		/**
		 * Correr rapido.
		 */
		default void correrRapido() {
			System.out.println("Piloto correndo rápido.");
		}
	}

	/**
	 * The Class Pessoa.
	 */
	static class Pessoa implements Corredor, Piloto {

		@Override
		public void correrRapido() {
			Corredor.super.correrRapido();
		}
		
	}
}
