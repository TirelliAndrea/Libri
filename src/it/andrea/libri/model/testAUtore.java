package it.andrea.libri.model;

public class testAUtore {

	public static void main(String[] args) {
		Autore a = new Autore("Tirelli","Andrea",1973, "Milano");
		AutoreLista lis = new AutoreLista();
		lis.aggiungiAutore(a);
		System.out.println(lis.getListaAutori().get(0).getCognome());
	}

}
