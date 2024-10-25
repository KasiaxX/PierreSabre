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
		int money = argent - prix;
		if(money < 0) {
			System.out.println("Je n'ai plus que " + this.getArgent() + " sous en poche. Je ne peux même pas m'offrir un/une " 
					+ bien + " à " + prix + " sous.");
		}else{
			System.out.println("J'ai " + prix + " sous en poche. Je vais pouvoir m'offrir un/une " + bien + " à " + prix + " sous.");
//			perdreArgent(prix)
		}
		
	}

	private void perdreArgent(int perte) {
		int money = argent - perte;
		if(money < 0) {
			argent = 0;			
		}else {
			argent = money;
		}
	}
	
	private void gangerArgent(int gain) {
		argent += gain;
	}

	private String parler(String texte) {
		return "(" + this.getNom() + ") " + "-" + texte;
	}

}
