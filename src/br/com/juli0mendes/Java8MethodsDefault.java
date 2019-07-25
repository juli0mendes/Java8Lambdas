package br.com.juli0mendes;

/**
 * The Class Java8MethodsDefault.
 *
 * @author Julio Cesar Mendes
 * 
 *         Metodos Default em interfaces são para evitar que tenha que fornecer
 *         uma implementação para um novo método em uma interface.
 */
public class Java8MethodsDefault {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Pessoa().correr();
		new Carro().correr();
		new Avestruz().correr();
		new Pessoa().correrRapido();
		new Carro().correrRapido();
		new Avestruz().correrRapido();
	}

	/**
	 * The Interface Corredor.
	 */
	interface Corredor {
		
		/**
		 * Correr.
		 */
		abstract void correr();

		/**
		 * Correr rapido.
		 */
		default void correrRapido() {
			System.out.println("Correr rápido.");
		}
	}

	/**
	 * The Class Pessoa.
	 */
	static class Pessoa implements Corredor {
		
		/* (non-Javadoc)
		 * @see br.com.juli0mendes.Java8MethodsDefault.Corredor#correr()
		 */
		@Override
		public void correr() {
			System.out.println("Pessoa correndo.");
		}

		/* (non-Javadoc)
		 * @see br.com.juli0mendes.Java8MethodsDefault.Corredor#correrRapido()
		 */
		@Override
		public void correrRapido() {
			System.out.println("Pessoa correndo rápido.");
		}
	}

	/**
	 * The Class Carro.
	 */
	static class Carro implements Corredor {
		
		/* (non-Javadoc)
		 * @see br.com.juli0mendes.Java8MethodsDefault.Corredor#correr()
		 */
		@Override
		public void correr() {
			System.out.println("Carro correndo.");
		}
	}

	/**
	 * The Class Avestruz.
	 */
	static class Avestruz implements Corredor {
		
		/* (non-Javadoc)
		 * @see br.com.juli0mendes.Java8MethodsDefault.Corredor#correr()
		 */
		@Override
		public void correr() {
			System.out.println("Avestruz correndo.");
		}
	}
}
