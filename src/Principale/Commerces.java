package Principale;

public class Commerces extends InfoCommercesEtActivites {
	
	//on initialise un tableau vide
	private Commerces[] listeCom = new Commerces[1000];
	private int nbrCom = 0;

	//on fait appel a la classe mere InfoCommercesEtActivites
	private Commerces(String genre, String adresse, String contact) {
		super(genre, adresse, contact);
	}
	
	public void ajouterCom(Commerces commerce) {
		listeCom[nbrCom]= commerce;
		nbrCom++;
	}
	public void afficherCom(Commerces commerces) {
		for (int i=0 ; i < nbrCom ; i++) {
			if (listeCom[i]!= null) {
				System.out.println("- " + listeCom[i]);
			}
		}
	}
	
		
	public static void main(String[] args) {
		Commerces commerces = new Commerces("genre", "adresse", "contact");
		
		Commerces Tabac = new Commerces("Tabac Presse Loto - Chez Sharon", "16 Rue Grand Rue, 11340 Espezel", "04 68 69 03 04");
		Commerces EpicerieEspezel = new Commerces("Epicerie du village - Gamm vert", "12 Av. du Stade, 11340 Espezel", "04 68 20 30 33");
		Commerces GarageEspezel = new Commerces("AD GARAGE LACROIX", "8 Av. du Stade, 11340 Espezel", "04 68 20 31 36");
		Commerces Pharmacie = new Commerces("Pharmacie du Pays de Sault ", "1 Av. du Stade, 11340 Espezel", "04 68 20 30 08");
		Commerces RestaurantEspezel = new Commerces("Restaurant 'Relais du Pays de Sault'", "3 Pl. du Calcat, 11340 Espezel", "04 68 20 72 89");
		Commerces HotelRestaurantEspezel = new Commerces("Restaurant 'Le 100 Unique'", "12 Rue Grand Rue, 11340 Espezel", "04 68 20 30 14");
		Commerces BoucherieEspezel = new Commerces("Boucherie 'Poux Jacques'", "9 Rue Grand Rue, 11340 Espezel", "04 68 20 75 27");
		Commerces BoulangeriesEspezel = new Commerces("Fournil traditionnel du PAYS DE SAULT", "20 Rue Grand Rue, 11340 Espezel", "06 40 53 07 05");
		Commerces CooperativeAgricole = new Commerces("Coopérative Agricole Pays de Sault", "Les Prats de Dejoux, 11340 Espezel", "06 73 93 11 50");
		Commerces SeveCathare = new Commerces("La Seve Cathare", "12 ROUTE DE ROQUEFEUIL, chemin des bouleaux, 11340 Espezel", "04 68 74 93 16");
		
		Commerces EpicerieBelcaire = new Commerces("Superette UTILE Belcaire", "66 Av. d'Ax les Thermes, 11340 Belcaire", "pas de numéros");
		Commerces Veto = new Commerces("Cabinet Vétérinaire 'LE SAULT DE LA VACHE'", "48 Av. d'Ax les Thermes, 11340 Belcaire", "04 68 69 91 01");
		Commerces Pizzeria = new Commerces("Pizzeria 'Là-Haut, dans la Montagne'", "64 Av. d'Ax les Thermes, 11340 Belcaire", "07 83 17 25 21");
		Commerces BoucherieBelcaire = new Commerces("Boucherie Charcuterie Artigues Jean Francois", "74 Av. d'Ax les Thermes, 11340 Belcaire", "04 68 20 31 28");
		Commerces Docteur = new Commerces("Giusti Patrick", "70 Av. d'Ax les Thermes, 11340 Belcaire", "04 68 20 17 82");
		Commerces HotelBelcaire = new Commerces("Hôtel Restaurant Bayle", "88 Av. d'Ax les Thermes, 11340 Belcaire", "04 68 20 31 05");
		Commerces CampingBelcaire = new Commerces("Les Chalets Du Lac", "4 Chem. du Lac, 11340 Belcaire", "04 68 20 39 47");
		Commerces Menuserie = new Commerces("Menuiserie Mora", "6 Chem. de la Plaine, 11340 Belcaire", "04 68 20 31 37");
		Commerces StationService = new Commerces("Dyneff - Garage Maury Sylvain", "107 Av. d'Ax les Thermes, 11340 Belcaire", "04 68 20 38 46");
		
		Commerces CampingRoquefeuil = new Commerces("Camping La Mare aux Fées", "6 Rue de l'Eglise, 11340 Roquefeuil", "04 68 31 11 37");
		Commerces RestaurantRoquefeuil = new Commerces("Auberge la Scierie", "La Scierie, 11340 Roquefeuil", "04 68 20 78 68");
		Commerces BoucheriesRoquefeuil = new Commerces("Les Salaisons Belcairoise", "Jacques.poux@orange, 11340 Roquefeuil", "04 68 20 33 61");
		
		commerces.ajouterCom(Tabac);
		commerces.ajouterCom(EpicerieEspezel);
		commerces.ajouterCom(GarageEspezel);
		commerces.ajouterCom(Pharmacie);
		commerces.ajouterCom(RestaurantEspezel);
		commerces.ajouterCom(HotelRestaurantEspezel);
		commerces.ajouterCom(BoucherieEspezel);
		commerces.afficherCom(BoulangeriesEspezel);
		commerces.afficherCom(CooperativeAgricole);
		commerces.afficherCom(SeveCathare);
		
		commerces.ajouterCom(EpicerieBelcaire);
		commerces.ajouterCom(Veto);
		commerces.ajouterCom(Pizzeria);
		commerces.ajouterCom(BoucherieBelcaire);
		commerces.ajouterCom(Docteur);
		commerces.ajouterCom(HotelBelcaire);
		commerces.ajouterCom(CampingBelcaire);
		commerces.ajouterCom(Menuserie);
		commerces.ajouterCom(StationService);
		
		commerces.ajouterCom(CampingRoquefeuil);
		commerces.ajouterCom(RestaurantRoquefeuil);
		commerces.ajouterCom(BoucheriesRoquefeuil);
		
		commerces.afficherCom(commerces);
	}
}
