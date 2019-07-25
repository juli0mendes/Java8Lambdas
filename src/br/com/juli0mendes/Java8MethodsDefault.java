package br.com.juli0mendes;

public class Java8MethodsDefault {

	public static void main(String[] args) {
		new Pessoa().correr();
		new Carro().correr();
		new Avestruz().correr();
		new Pessoa().correrRapido();;
		new Carro().correrRapido();;
		new Avestruz().correrRapido();;
	}
	
	interface Corredor {
		abstract void correr();
		default void correrRapido() {
			System.out.println("Correr rápido.");
		}
	}
	
	static class Pessoa implements Corredor {
		@Override
		public void correr() {
			System.out.println("Pessoa correndo.");
		}
		
		@Override
		public void correrRapido() {
			System.out.println("Pessoa correndo rápido.");
		}
	}
	
	static class Carro implements Corredor {
		@Override
		public void correr() {
			System.out.println("Carro correndo.");
		}
	}
	
	static class Avestruz implements Corredor {
		@Override
		public void correr() {
			System.out.println("Avestruz correndo.");
		}
	}
}
