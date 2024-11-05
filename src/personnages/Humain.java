package personnages;

public class Humain extends Personnage {
	
	private String boissonFavori;
	public Humain(String nom, String boissonFavori, int argent) {
		super();
		this.nom = nom;
		this.boissonFavori = boissonFavori;
		this.argent = argent;
	}

	public void direBonjour() {
		System.out.println(parler(" Bonjour! Je m'appelle " + this.getNom() + " et j'aime boire du " + boissonFavori +"."));
	}
	
	public void boire() {
		System.out.println(parler(" Mmmm, un bon verre de " + boissonFavori + "! GLOUPS !"));
	}

	public void perdreArgent(int perte) {
		int money = argent - perte;
		if (money < 0) {
			argent = 0;
		} else {
			argent = money;
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	public void acheter(String bien, int prix) {
		int money = argent - prix;
		if (money < 0) {
			System.out.println(parler(" Je n'ai plus que " + this.getArgent()
					+ " sous en poche. Je ne peux même pas m'offrir un/une " + bien + " à " + prix + " sous."));
		} else {
			System.out.println(parler(" J'ai " + this.getArgent() + " sous en poche. Je vais pouvoir m'offrir un/une "
					+ bien + " à " + prix + " sous."));
			perdreArgent(prix);
			;
		}

	}

	protected String parler(String texte) {
		return "(" + this.getNom() + ") " + "-" + texte;
	}

}
