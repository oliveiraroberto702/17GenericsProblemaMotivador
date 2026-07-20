package servicos;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeImpressora {
	
	List<Object> lista = new ArrayList<>();
	
	public void entraValor(Object valor) {
		lista.add(valor);
	}
	
	public Object primeiro()   {
		if(lista.isEmpty()) {
			throw new IllegalStateException("List está vazia");
		}
		return lista.get(0);
	}
	public void imprime() {
		System.out.print("[");
		/*
		for(int i=1; i<=lista.size();i++) {
			System.out.print(i < lista.size() ? lista.get(i-1) + ", ": lista.get(i-1));
		}
		*/
		if(!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for (int i=1; i<lista.size(); i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.println("]");
	}

}
