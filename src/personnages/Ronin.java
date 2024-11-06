package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavori, int argent) {
		super(nom, boissonFavori, argent);
		this.honneur = honneur;

	}
	
	public void donner(Commercant comm) {
		int donner = argent/10;
		
		parler(" " + comm.getNom() + " prend ces " + donner + " sous.");
		comm.gagnerArgent(donner);
		parler(" " + donner + " sous! Je te remercie généreux donateur!");
	}

}
