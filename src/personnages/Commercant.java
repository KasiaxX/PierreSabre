package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom,"thè",argent);
	}
	

	public int seFaireExtorquer() {
		int sou = argent;
		perdreArgent(argent);  //argent - argent = 0 , perdre tout
		parler(" J'ai tout perdu ! Le monde est trop injuste");
		return sou;
		
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(" " + argent + " Je te remercie généreux donateur!");
	}

}
