package personnages;

public class Humain extends Personnage {
	
	protected String nom;
	protected String boissonFavori;
	protected int argent;
	
	public Humain(String nom, String boissonFavori, int argent) {
		super();
		this.nom = nom;
		this.boissonFavori = boissonFavori;
		this.argent = argent;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + this.getNom() + ") " + "-" + texte);
	}

	public void direBonjour() {
		parler(" Bonjour! Je m'appelle " + this.getNom() + " et j'aime boire du " + boissonFavori + ".");
	}

	public void boire() {
		parler(" Mmmm, un bon verre de " + boissonFavori + "! GLOUPS !");
	}

	public void perdreArgent(int perte) {
		argent = argent - perte;

	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void acheter(String bien, int prix) {
		int money = argent - prix;
		if (money < 0) {
			parler(" Je n'ai plus que " + this.getArgent() + " sous en poche. Je ne peux même pas m'offrir un/une "
					+ bien + " à " + prix + " sous.");
		} else {
			parler(" J'ai " + this.getArgent() + " sous en poche. Je vais pouvoir m'offrir un/une " + bien + " à "
					+ prix + " sous.");
			perdreArgent(prix);
			;
		}

	}

}
