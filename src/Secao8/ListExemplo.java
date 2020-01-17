package Secao8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExemplo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		for (String x: list) {
			System.out.println(x);
		}

		System.out.println("------------------------------");
		System.out.println("Remover todos que comecem com a Letra M");
		//list.remove(1);
		System.out.println("Remover todos que comecem com a Letra M, utilizando predicado - lambda");
		list.removeIf(x -> x.charAt(0)=='M');  //funcao lambda
		System.out.println();
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		System.out.println("Para achar uma posicao de um elemento - IndexOf");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando ele nao encontra ele retorna -1
		System.out.println("---------------------");
		
		//Ficou verboso, mas foi a forma que o Java 8 achou para manter a compatibilidade
		//com o Tipo "List" que e um tipo Antigo e permitir que eu possa fazer operacoes
		//de Lambda com o tipo List (precisei conveter)
		//Filtrar todos que comecem com a letra A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
