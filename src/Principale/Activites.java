package Principale;

public class Activites extends InfoCommercesEtActivites {
	
	//on initialise un tableau vide
	private Activites[] listeActi = new Activites[150];
	private int nbrActi = 0;
	
	//on fait appel a la classe mere InfoCommercesEtActivites
	private Activites(String genre, String adresse, String contact) {
		super(genre, adresse, contact);
	}
	
	public void ajouterActi(Activites acti) {
		listeActi[nbrActi]= acti;
		nbrActi++;
	}
	public void afficherActi(Activites activites) {
		for (int i=0 ; i < nbrActi ; i++) {
			if (listeActi[i]!= null) {
				System.out.println("- " + listeActi[i]);
			}
		}
	}
	
		
	public static void main(String[] args) {
		Activites activites = new Activites("genre", "adresse", "contact");

		Activites Escalade = new Activites("Escalade", "64 Av. d'Ax les Thermes, 11340 Belcaire", "04 68 20 31 23");
		Activites Ski = new Activites("Ski", "Col du Teil, 11340 Camurac", "04 68 20 32 27");
		Activites Trial = new Activites("Trial 'SPORT EN PAYS DE SAULT'", "9 AV DU STADE 11340 ESPEZEL", "pas de numeros");
		Activites Lac = new Activites("Lac de Belcaire", "11340 Belcaire", "pas de numeros");
		Activites Randonnees = new Activites("Sentier cathares", "partout sur le Plateau de Sault", "pas de numeros");
		
		activites.ajouterActi(Escalade);
		activites.ajouterActi(Ski);
		activites.ajouterActi(Trial);
		activites.ajouterActi(Lac);
		activites.ajouterActi(Randonnees);
		
		
		activites.afficherActi(activites);
		

	}
	
}

