package it.andrea.libri.model;

import it.andrea.libri.beans.Autore;
import it.andrea.libri.beans.Libro;

public class testAUtore {

	public static void main(String[] args) {
		Autore a = new Autore("Tirelli","Andrea",1973, "Milano");
		Autore b = new Autore("Tirelli","Andrea",1973, "Milano");
		AutoreLista lis = new AutoreLista();
		int t = lis.aggiungiAutore(a);
		if (t == 1){
			System.out.println("Elemento gia presente");
		}
		
		int p = lis.aggiungiAutore(b);
		if (p == 1){
			System.out.println("Elemento gia presente");
		}
		
		
		Autore c = new Autore("Tirelli","Gabriele",2013, "Segrate");
		int q = lis.aggiungiAutore(c);
		if (q == 1){
			System.out.println("Elemento gia presente");
		}else {
			System.out.println("Elemento inserito");
		}
		
		for (Autore auto : lis.getListaAutori()){
			System.out.println(auto.toString());
		}
		
		lis.getLibri().aggiungiLibro(new Libro ("Mio Libro",2018));
		
		for (Libro libri : lis.getLibri().getLibri())
			System.out.println(libri.toString());
	}
}
