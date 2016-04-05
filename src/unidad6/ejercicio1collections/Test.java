package unidad6.ejercicio1collections;


import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> lista =  new LinkedList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		
		Collections.reverse(lista);
		
		for (String s : lista) {
			System.out.println(s);
		}
		
		java.util.Collections.reverse(lista);
		
		for (String s : lista) {
			System.out.println(s);
		}
		
	}
}
