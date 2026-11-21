package repaso.tema8;

import java.util.*;

public class ArraysLIstString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] matriz = new String[10];
		
		for(int i=0;i<matriz.length;i++) {
			if(matriz[i]==null) {
				matriz[i] = "hola";
				break;
			}
		}
		
		ArrayList<String> lista = new ArrayList<String>(3);
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
		
		//add para añadir nuevos elementos a la lista
		listaNumeros.add(1);
		
		
		lista.add("Maria");
		lista.add("Angel");
		lista.add("Juan");
		lista.add("Saul");
		lista.add("Andrea");
		
		lista.add(lista.size(),"Roberto");
		lista.add(lista.size(),"Tomas");
		
		System.out.println(lista.size());
		
		//Recuperar o buscar valores en una lista
		String nombre = lista.get(0);
		
		int posicion = lista.indexOf("Saul");
		
		boolean encontrado = lista.contains("Angel");
		
		//Puedo meter lista en lista2 con addAll
		lista2.addAll(lista);
		
		//Recorrer una lista --> for each
		for(String c : lista) {
			if(c.startsWith("A")) {
				System.out.println(c);
			}
		}
		System.out.println();
		
		
		//Quiero recorrer la lista y eliminar en vez de printar:
		
		//No se puede con un for each hace falta un iterador
		//Iteradores:
		Iterator<String> it = lista.iterator();
		
		while(it.hasNext()) {
			if(it.next().startsWith("A")) {
				it.remove();
			}
		}

		it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for(String c : lista ) {
//			System.out.println(c);		
//			}
		
	
	
	}
}
