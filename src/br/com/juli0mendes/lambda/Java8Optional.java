package br.com.juli0mendes.lambda;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;
import static java.util.OptionalInt.of;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Java8Optional {

	public static void main(String[] args) {
		
		String numberString = "10";
		String numberIncorrect = "Olá";
		
		Integer numberConverted = convertInNumber(numberString);
		
		System.out.println("Java 7 - Número convertido: " + numberConverted);
		
		System.out.println("\n===================================");
		
		Optional<Integer> numberConvetedOptional = convertInNumberOptional(numberString);
		
		System.out.println("Java 8 - Número OPTIONAL convertido: " + numberConvetedOptional.get());
		
		System.out.println("\n===================================");
		
		Optional<Integer> numberConvertedOptional2 = convertInNumberOptional(numberIncorrect);
		
		System.out.println("Java 8 - Número OPTIONAL convertido (STRING): " + numberConvertedOptional2.isPresent());

		System.out.println("\n===================================");
		
		convertInNumberOptional(numberIncorrect).ifPresent(n -> System.out.println("Java 8 - Número OPTIONAL (IfPresent - sem valor) convertido (STRING): " + n));
		convertInNumberOptional(numberString).ifPresent(n -> System.out.println("Java 8 - Número OPTIONAL (IfPresent - com valor) convertido (STRING): " + n));
		
		System.out.println("\n===================================");
		
		System.out.println("Java 8 Optional orElse: " + convertInNumberOptional(numberString).orElse(12));
		System.out.println("Java 8 Optional orElse: " + convertInNumberOptional(numberIncorrect).orElse(12));
		
		System.out.println("\n===================================");
		
		System.out.println("Java 8 Optional orElseGet: " + convertInNumberOptional(numberString).orElseGet(() -> 5));
		System.out.println("Java 8 Optional orElseGet: " + convertInNumberOptional(numberIncorrect).orElseGet(() -> 5));
		
		System.out.println("\n===================================");
		
		System.out.println("Java 8 Optional orElseThrow: " + convertInNumberOptional(numberString).orElseThrow(() -> new NullPointerException("Valor vazio.")));
//		System.out.println("Java 8 Optional orElseThrow: " + convertInNumberOptional(numberIncorrect).orElseThrow(() -> new NullPointerException("Valor vazio.")));
		
		System.out.println("\n===================================");
		
		Stream.of(1, 2, 3, 4, 5).findFirst().ifPresent(n -> System.out.println("Java 8 Optional - código mais limpo: " + n));
		
		System.out.println("\n===================================");

		System.out.println("Java 8 Optional tipos primitivos: " + Java8Optional.convertInNumberOptionalPrimitivesTypes(numberString).getAsInt());	
	}

	// Java 7
	public static Integer convertInNumber(String numberString) {
		return Integer.valueOf(numberString);
	}
	
	// Java 8  - Objeto/classe
	public static Optional<Integer> convertInNumberOptional(String numberString) {
		try {
			return Optional.of(valueOf(numberString));
		} catch (Exception e) {
			return Optional.empty();
		}
	}
	
	// Java 8  - tipos primitivos
	public static OptionalInt convertInNumberOptionalPrimitivesTypes(String numberString) {
		try {
			return of(parseInt(numberString));
		} catch (Exception e) {
			return OptionalInt.empty();
		}
	}	
}
