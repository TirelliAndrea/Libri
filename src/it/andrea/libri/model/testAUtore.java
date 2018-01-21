package it.andrea.libri.model;

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
		
		
		for (int i = 0; i<lis.getListaAutori().size(); i++){
			System.out.println(lis.getListaAutori().get(i).getCognome());
		}
		
		
		lis.setLibri(new Libro ("Pippo", 2018));
	}
}
