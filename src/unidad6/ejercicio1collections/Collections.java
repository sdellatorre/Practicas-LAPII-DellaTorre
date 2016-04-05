package unidad6.ejercicio1collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	public static <T> void reverse(List<T> lista){
		List <T> lAux = new ArrayList<T>(lista.size());
		lAux.addAll(lista);
		lista.clear();
		for (int i = lAux.size()-1; i>=0 ; i--){
			lista.add(lAux.get(i));
			
		}
	}
}
