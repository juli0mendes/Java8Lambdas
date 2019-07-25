package br.com.juli0mendes;

public class Java8InterfacesStatic {

	public static void main(String[] args) {
		System.out.println(Corredor.calcularVelocidade(10, 2));
	}
	
	interface Corredor {
		static double calcularVelocidade(double d, double t) {
			return d / t;
		}
	}
}