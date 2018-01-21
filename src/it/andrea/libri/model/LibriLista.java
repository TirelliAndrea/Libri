package it.andrea.libri.model;

import java.util.ArrayList;
import java.util.List;

public class LibriLista {
	
	private List<Libro> libri;
	
	public LibriLista (){
		
		libri = new ArrayList<Libro>();
	}
	
	
	/**
	 * Funzione che aggiunge un nuovo libro nella lista
	 * @param Libro
	 * @return 0 se l'elemento non è nella lista 1 se è presente
	 */
	public int aggiungiLibro (Libro a){
			
			
			if (libri.contains(a)){
				return 1;
			}else {
				libri.add(a);
				return 0;
			}
		}


	
	public List<Libro> getLibri() {
		return libri;
	}

	
}
