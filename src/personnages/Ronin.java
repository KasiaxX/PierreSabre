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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		int rep = adversaire.getReputation();
		
		parler("Je t'ai trouvé vermine, tu vas payer " 
				+ "pour ce que tu as fait à ce pauvre marchand!");
		 
		if (force >= rep) {
			parler("Je t'ai eu petit yakuza!");
			int argentAdversaire = adversaire.argent;
			honneur++;
			adversaire.perdre();
						
		}else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			adversaire.gagner(argent);
		}
		
	}

}
