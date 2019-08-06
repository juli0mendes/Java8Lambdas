package br.com.juli0mendes.functionalinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Julio Cesar Mendes
 * 
 * The Class Java8FunctionalInterface.
 */
public class Java8FunctionalInterface {

	public static void main(String[] args) {
		
		// JAVA 8: FUNÇÕES LAMBDA
		testFunctionalInterfaceWithRunnable();
		
		System.out.println("\n");
		
		testFunctionalInterfaceWithActionListener();		
	}

	/**
	 * Test functional interface with runnable.
	 */
	private static void testFunctionalInterfaceWithRunnable() {
		
		// JAVA 7
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Olá, mundo");
			}
		}).run();
		
		System.out.println("\n");

		// JAVA 8		
		new Thread(() -> System.out.println("Olá, mundo")).run();
	}
	
	/**
	 * Test functional interface with action listener.
	 */
	private static void testFunctionalInterfaceWithActionListener() {

		// JAVA 7		
		JButton jButton = new JButton();
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Olá, mundo");
			}
		});
		
		// JAVA 8		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(e -> System.out.println("Olá, mundo"));
	}
}
