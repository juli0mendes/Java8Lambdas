package br.com.juli0mendes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Julio Cesar Mendes
 * 
 *         The Class Java8Stream.
 */
public class Java8Stream {

	public static void main(String[] args) {

		List<Integer> listaInteiros = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9);
		
		// JAVA 7
		for (Integer integer : listaInteiros) {
			System.out.println(integer);
		}
		
		System.out.println("-------------");
		
		// JAVA 8
		listaInteiros.stream().forEach((e) -> System.out.println(e));
		
		System.out.println("-------------");
		
		listaInteiros.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().skip(2).forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().limit(2).forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().distinct().forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().skip(2).limit(3).forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().filter(e -> e % 2 == 0).distinct().forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().map(e -> e * 2).forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		listaInteiros.stream().limit(3).map(e -> e * 2).forEach(e -> System.out.println(e));
	
		System.out.println("\n");
		
		System.out.println(listaInteiros.stream().map(e -> e * 2).count());
		
		System.out.println("\n");
		
		System.out.println(listaInteiros.stream().filter(e -> e % 2 == 0).count());
		
		System.out.println("\n");
		
		System.out.println(listaInteiros.stream().filter(e -> e % 2 == 0).min(Comparator.naturalOrder()).get());
		
		System.out.println("\n");
		
		System.out.println(listaInteiros.stream().filter(e -> e % 2 == 0).max(Comparator.naturalOrder()).get());
		
		System.out.println("\n");
		
		List<Integer> novaListaInteiros = listaInteiros.stream().filter(e -> e % 2 == 0).map(e -> e * 3).collect(Collectors.toList());
		System.out.println(novaListaInteiros);
		
		System.out.println("\n");
		
		Map<Boolean, List<Integer>> mapa1 = listaInteiros.stream().map(e -> e *3).collect(Collectors.groupingBy(e -> e % 2 == 0));
		System.out.println(mapa1);
		
		System.out.println("\n");
		
		Map<Integer, List<Integer>> mapa2 = listaInteiros.stream().collect(Collectors.groupingBy(e -> e % 3));
		System.out.println(mapa2);
		
		System.out.println("\n");
		
		String collect = listaInteiros.stream().map(e -> String.valueOf(e)).collect(Collectors.joining());
		System.out.println(collect);
		
		System.out.println("\n");
		
		System.out.println(listaInteiros.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(";")));
		
		System.out.println("\n");
		
		
	}
}
