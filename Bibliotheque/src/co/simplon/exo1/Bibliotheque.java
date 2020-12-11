package co.simplon.exo1;

import java.util.ArrayList;
import co.simplon.utilexo.*;

public class Bibliotheque {
	
	String nom;
	String adresse;
	ArrayList<Adherent> tabAdherent = new ArrayList<Adherent>();
	
	public Bibliotheque(String nom, 
						String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	// Redéfinition de la méthode toString()
	@Override
	public String toString() {
		return "Bibliotheque [nom : " + nom + ", Adresse : " + adresse + ", liste d'adhérents : " + tabAdherent + "]";
	}

	// Accesseurs : getters et setters
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

    // Méthodes
	public void inscrire(Adherent ad) {
		tabAdherent.add(ad);
	}
	
	public void desincrire(Adherent ad) {
		tabAdherent.remove(ad);
	}
	
	
	
	

}


