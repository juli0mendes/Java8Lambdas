package br.com.juli0mendes.lambda;

import static java.lang.Double.POSITIVE_INFINITY;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Java8Reduce {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> numbersEmpty = Arrays.asList();
		
		String s = "Olá, mundo!";
		String[] arrayCharacters = s.split(" ");
		List<String> listOfString = Arrays.asList(arrayCharacters);
		
		Optional<Integer> reduceSum = numbers.stream().reduce((n1, n2) -> n1 + n2);
		System.out.println("Java 8 Reduce (soma): " + reduceSum.get());
		
		Optional<Integer> reduceSumWithListEmpty = numbersEmpty.stream().reduce((n1, n2) -> n1 + n2);
		System.out.println("Java 8 Reduce (soma - lista vazia): " + reduceSumWithListEmpty);
		
		Optional<Integer> reduceMultiplication = numbers.stream().reduce((n1, n2) -> n1 * n2);
		System.out.println("Java 8 Reduce (multiplicacao): " + reduceMultiplication.get());
		
		Optional<String> reduceConcat = listOfString.stream().reduce((str1, str2) -> str1.concat(str2));
		System.out.println("Java 8 Reduce (concatenação): " + reduceConcat.get());
		
		// NÃO USE O EXEMPLO ABAIXO
		Optional<Integer> reduceMinus = numbers.stream().reduce((n1, n2) -> n1 - n2);
		System.out.println("Java 8 Reduce (subtração): " + reduceMinus.get());
		
		System.out.println("\n===================================");
		
		Integer reduceSum2 = numbers.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("Java 8 Reduce Identification (soma): " + reduceSum2);
		
		Integer reduceSumWithListEmpty2 = numbersEmpty.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("Java 8 Reduce Identification (soma - lista vazia): " + reduceSumWithListEmpty2);
		
		Integer reduceMultiplication2 = numbers.stream().reduce(1, (n1, n2) -> n1 * n2);
		System.out.println("Java 8 Reduce Identification (multiplicacao): " + reduceMultiplication2);
		
		String reduceConcat2 = listOfString.stream().reduce("", (str1, str2) -> str1.concat(str2));
		System.out.println("Java 8 Reduce (concatenação): " + reduceConcat2);
		
		// reduce do menor valor
		OptionalDouble reduceMinValue = DoubleStream.of(1.5, 2.9, 6.7).reduce((d1, d2) -> Math.min(d1, d2));
		System.out.println("Java 8 Reduce (DoubleStream): " + reduceMinValue.getAsDouble());
		
		double reduceMinValue2 = DoubleStream.of(1.5, 2.9, 6.7).reduce(POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));
		System.out.println("Java 8 Reduce Identification (DoubleStream): " + reduceMinValue2);
		
		System.out.println("\n===================================");
		
		Integer reduceSum3 = numbers.stream().reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> n1 + n2);
		System.out.println("Java 8 Reduce Combination (soma): " + reduceSum3);
		
		System.out.println("\n===================================");
		
		String reduceWithMapAndCombine = numbers.stream().reduce("", (n1, n2) -> n1.toString().concat(n2.toString()), (n1, n2) -> n1.concat(n2)); 
		System.out.println("Java 8 Reduce (combination): " + reduceWithMapAndCombine);
	}
}
