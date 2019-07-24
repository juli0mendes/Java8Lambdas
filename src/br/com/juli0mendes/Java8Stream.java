package br.com.juli0mendes;

import java.util.Arrays;
import java.util.List;

public class Java8Stream {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		
		// JAVA 7
		for (Integer integer : asList) {
			System.out.println(integer);
		}
		
		System.out.println("-------------");
		
		// JAVA 8
		asList.stream().forEach((e) -> System.out.println(e));
		
		System.out.println("-------------");
		
		asList.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
	}
}
