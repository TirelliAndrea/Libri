package it.andrea.libri.model;

import java.util.ArrayList;
import java.util.List;

public class AutoreLista {
	


	private List<Autore> autori;
	private LibriLista libri;
	
	public AutoreLista (){
		
		autori = new ArrayList<Autore>();
		this.libri = new LibriLista();
	}

	/**
	 * funzione per inserire un nuovo elemento nella lista autore
	 * @param a Autore
	 * @return 0 se l'elemento autore non è presente nella lista  e aggiunge l'elemento altrimenti restituisce 1
	 */
	public int aggiungiAutore (Autore a){
		
		
		if (autori.contains(a)){
			return 1;
		}else {
			autori.add(a);
			return 0;
		}
	}
	
	/**
	 * 
	 * @return la lista completa egli autori presente nella lista
	 */
	public List<Autore> getListaAutori (){
		return autori;
		
	}

	public LibriLista getLibri() {
		return libri;
	}

	public void setLibri(LibriLista libri) {
		this.libri = libri;
	}


	
	
	
	
	
	
}
