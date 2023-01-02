package Principale;

public class InfoCommercesEtActivites {
	private String genre;
	private String adresse;
	private String contact;
	
	public InfoCommercesEtActivites(String genre, String adresse, String contact) {
		this.genre = genre;
		this.adresse = adresse;
		this.contact = contact;
	}
	
	public String getgenre() {
		return genre;
	}
	public String getadresse() {
		return adresse;
	}
	public String getcontact() {
		return contact;
	}
	
	@Override
	public String toString() {
		return "Activités : " + genre + "\nAdresse : " + adresse + "\nContact : " + contact + "\n" ;
	}
}
