package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Raphael");
		list.add("Pitol");
		list.add("Juliani");
		list.add("Joana");
		list.add("Joao");
		list.add("Romualdo");
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("===========");
		
		//inserindo na posição 2 da lista
		list.add(2, "Cilene");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("===========");
		
		list.remove(4);
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("===========");
		//Remove todos da lista que começa com a leta J
		list.removeIf(x -> x.charAt(0) == 'J');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("===========");
		//retorn o index ou seja a posição na lista
		System.out.println("indexOf Pitol = "+list.indexOf("Pitol"));
		System.out.println("===========");
		//retorno de index que não existe retorna -1
		System.out.println("indexOf indefinido Pitool = "+list.indexOf("Pitoll"));
		System.out.println("===========");
		
		//Buscando somente os nomes com R
		//Converte o list para stream depois faz a operação desejada com lambida por final o collect trandforma 
		//novamente em List o resutado.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("===========");
		// Retonar o primeiro nome da lista que inicia com a letra R ou null se não tiver nenhum
		String nome = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
		String nomeNull = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
		System.out.println(nomeNull);
	}

}
