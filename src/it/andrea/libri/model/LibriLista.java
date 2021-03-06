package it.andrea.libri.model;

import java.util.ArrayList;
import java.util.List;

import it.andrea.libri.beans.Libro;

public class LibriLista {
	
	private List<Libro> libri;
	
	public LibriLista (){
		
		libri = new ArrayList<Libro>();
	}
	
	
	/**
	 * Funzione che aggiunge un nuovo libro nella lista
	 * @param Libro
	 * @return 0 se l'elemento non � nella lista 1 se � presente
	 */
	public void aggiungiLibro (Libro a){
			
			
			if (!libri.contains(a)){
				libri.add(a);
			}else {
			 throw new IllegalArgumentException("Elemento Gia presente");
			}
		}


	
	public List<Libro> getListaLibri() {
		return libri;
	}

	
}
