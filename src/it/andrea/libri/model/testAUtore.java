package it.andrea.libri.model;

public class testAUtore {

	public static void main(String[] args) {
		Autore a = new Autore("Tirelli","Andrea",1973, "Milano");
		Autore b = new Autore("Tirelli","Andrea",1973, "Milano");
		AutoreLista lis = new AutoreLista();
		AutoreLista lis2 = new AutoreLista();
		
		lis.aggiungiAutore(a);

		try{
		lis.aggiungiAutore(b);
		}catch (IllegalArgumentException e){
			System.out.println("Elemento gia presente");
		}
		
		
		Autore c = new Autore("Tirelli","Gabriele",2013, "Segrate");
		lis2.aggiungiAutore(c);
	
		
		for (Autore auto : lis.getListaAutori()){
			System.out.println(auto.toString());
		}
		
		lis.getLibri().aggiungiLibro(new Libro ("Mio Libro",2018));
		lis.getLibri().aggiungiLibro(new Libro ("Mio Libro 2",2018));
		lis.getLibri().aggiungiLibro(new Libro ("Mio Libro 3 ",2018));
		lis2.getLibri().aggiungiLibro(new Libro ("Mio Libro 4",2018));
		

	}
}
