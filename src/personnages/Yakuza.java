package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavori, int argent, String clan) {
		super(nom, boissonFavori, argent);
		this.clan = clan;
	}
	
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
		parler(" Mon clan est celui de " + clan + ".");
	}

	public void extorquer(Commercant victime) {

		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(" " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");

		int perte = victime.argent;
		gagnerArgent(victime.argent);
		reputation++;

		victime.seFaireExtorquer();
		parler(" J’ai piqué les " + perte + " sous de " + victime.getNom() + ", ce qui me fait " 
				+ argent + " sous dans ma" + "poche. Hi ! Hi ! ");

	}
	
	public int perdre() {
		int argentPerdu = argent;
		perdreArgent(argent);
		reputation--;
		parler(" J’ai perdu mon duel et mes " + argent + 
				" sous, snif... J'ai déshonoré le clan de " + clan);
		
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler(" Ce ronin pensait vraiment battre" + this.getNom() 
			+ "du clan " + clan + " ?");
		parler("Je l'ai dépouillé de ses " + gain + " sous.");
		
	}
	
	public int getReputation() {
		return reputation;
	}

}
