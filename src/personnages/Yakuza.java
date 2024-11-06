package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonFavori, int argent, String clan) {
		super(nom, boissonFavori, argent);
		this.clan = clan;
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

}
