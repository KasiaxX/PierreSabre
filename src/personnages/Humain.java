package personnages;

import java.io.ObjectInputStream.GetField;

public class Humain {
	
	private String nom;
	private String boissonFavori;
	private int argent;
		
	
	public Humain(String nom, String boissonFavori, int argent) {
		super();
		this.nom = nom;
		this.boissonFavori = boissonFavori;
		this.argent = argent;
	}

	private String getNom() {
		return nom;
	}

	private int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println(parler(" Bonjour! Je m'appelle " + this.getNom() + " et j'aime boire du " + boissonFavori +"."));
	}
	
	public void boire() {
		System.out.println(parler(" Mmmm, un bon verre de " + boissonFavori + "! GLOUPS !"));
	}
	
	private void acheter(String bien, int prix) {

	}

	private void perdreArgent(int perte) {

	}

	private String parler(String texte) {
		return "(" + this.getNom() + ") " + "-" + texte;
	}

}
