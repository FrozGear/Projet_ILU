package Principale;

import java.util.Arrays;
import java.util.List;

public enum Villages {
	
	//On creer les enums avec le nom de chaque village et son nombre d'habitants.
	
	ROQUEFEUIL("Roquefeuil", 301), BELCAIRE("Belcaire", 362), ESPEZEL("Espezel", 245), 
	CAMURAC("Camurac", 99), BELVIS("Belvis", 163), COMUS("Comus", 35), PRADES("Prades", 27),
	MONTAILLOU("Montaillou", 16), COUDONS("Coudons", 53), QUIRBAJOU("Quirbajou", 55), 
	
	RODOME("Rodome", 102), MAZUBY("Mazuby", 25), GALINAGUES("Galinagues", 44), 
	AUNAT("Aunat", 70), BESSEDE_DE_SAULT("Bessede_de_Sault", 37), LE_CLAT("Le_Clat", 26), 
	ARTIQUES("Artigues", 72), CAILLA("Cailla", 48), 
	FONTANES_DE_SAULT("Fontanes_de_Sault", 5), CAMPAGNA_DE_SAULT("Campagna_de_Sault", 20),
	
	MARSA("Marsa", 16), JOUCOU("Joucou", 30), BELFORT_SUR_REBENTY("Belfort_sur_Rebenty", 16),
	NIORT_DE_SAULT("Niort_de_Sault", 51), MERIAL("Merial", 33), LA_FAJOLLE("La_Fajolle", 13)
	;
	
	private static final List<Villages> GRAND_PLATEAU = Arrays.asList(BELCAIRE, BELVIS, CAMURAC, COMUS, COUDONS, ESPEZEL, MONTAILLOU, PRADES, QUIRBAJOU, ROQUEFEUIL);
	private static final List<Villages> PETIT_PLATEAU = Arrays.asList(AUNAT, ARTIQUES, CAMPAGNA_DE_SAULT, BESSEDE_DE_SAULT, CAILLA, FONTANES_DE_SAULT, GALINAGUES, LE_CLAT, MAZUBY, RODOME);
	private static final List<Villages> VALLEE_DU_REBENTY = Arrays.asList(BELFORT_SUR_REBENTY, JOUCOU, LA_FAJOLLE, MARSA, MERIAL, NIORT_DE_SAULT);
	
	private String nom;
	private int habitants;
	
	private Villages(String nom, int habitants) {
		this.nom = nom;
		this.habitants = habitants;
	}
	
	public String toString() {
		return nom +", nombre d'habitants : "+ habitants;
	}
	public int habitants() {
		return habitants;
	}
	

	public static List<Villages> getGrandPlateau() {
		return GRAND_PLATEAU;
	}
	public static List<Villages> getPetitPlateau() {
		return PETIT_PLATEAU;
	}
	public static List<Villages> getVallee_du_Rebenty() {
		return VALLEE_DU_REBENTY;
	}
	

	public static void main(String[] args) {

		int n = (int)(Math.random() * 3-0);
		
		if (n == 0) {
			System.out.println("Les villages du grand plateau sont : ");
			for(Villages villages : Villages.getGrandPlateau()) {
				System.out.println("- " + villages);
			}
		}
		if (n == 1) {
			System.out.println("Les villages du petit plateau sont : ");
			for(Villages villages : Villages.getPetitPlateau()) {
				System.out.println("- " + villages);
			}
		}
		if (n == 2) {
			System.out.println("Les villages de la vallee du Rebenty sont : ");
			for(Villages villages : Villages.getVallee_du_Rebenty()) {
				System.out.println("- " + villages);
			}
		}
	
	}
}
	
	
	