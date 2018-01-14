package it.andrea.libri.model;

import java.util.ArrayList;
import java.util.List;

public class AutoreLista {
	
	private List<Autore> autori = new ArrayList<Autore>();;

	/**
	 * funzione per inserire un nuovo elemento nella lista autore
	 * @param a Autore
	 * @return false se l'elemento autore non è presente nella lista altrimenti restituisce false e aggiung l'elemento
	 */
	public boolean aggiungiAutore (Autore a){
		
		if (!autori.contains(a)){
		autori.add(a);
		return false;
		}else {
			return true;
		}
	}
	
	public List<Autore> getListaAutori (){
		return autori;
	}
}
