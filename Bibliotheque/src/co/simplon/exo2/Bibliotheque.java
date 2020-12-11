package co.simplon.exo2;

import java.util.ArrayList;

public class Bibliotheque {
	private String nomBibilotheque;
	private String adresseBibliotheque;
	private ArrayList<Adherent> listeAdherent = new ArrayList<Adherent>();
	private ArrayList<FicheEmprunt> listeFicheEmprunt = new ArrayList<FicheEmprunt>();
	
	// Constructeur
	public Bibliotheque(String nomBibilotheque, 
						String adresseBibliotheque, 
						ArrayList<Adherent> listeAdherent,
						ArrayList<FicheEmprunt> listeFicheEmprunt) {
		super();
		this.nomBibilotheque = nomBibilotheque;
		this.adresseBibliotheque = adresseBibliotheque;
		this.listeAdherent = listeAdherent;
		this.listeFicheEmprunt = listeFicheEmprunt;
	}

	// Redéfinition de la méthode toString()
	
	
	// Accesseurs : getters et setters
	public String getNom() {
		return nomBibilotheque;
	}

	@Override
	public String toString() {
		return "Bibliotheque [nomBibilotheque=" + nomBibilotheque + ", adresseBibliotheque=" + adresseBibliotheque
				+ ", listeAdherent=" + listeAdherent + ", listeFicheEmprunt=" + listeFicheEmprunt + "]";
	}

	public void setNom(String nom) {
		this.nomBibilotheque = nom;
	}

	public String getAdresse() {
		return adresseBibliotheque;
	}

	public void setAdresseBibliotheque(String adresseBibliotheque) {
		this.adresseBibliotheque = adresseBibliotheque;
	}
	
	public ArrayList<Adherent> getListeAdherent() {
		return listeAdherent;
	}

	public void setListeAdherent(ArrayList<Adherent> listeAdherent) {
		this.listeAdherent = listeAdherent;
	}

	// methode permettant d'ajouter un nouvel adhérent de la liste d'adhérents grâce à la méthode add de classe ArrayList
	public void inscrire(Adherent adherent) {
		listeAdherent.add(adherent);
		System.out.println("Une personne s'est inscrite à la bibliothèque");
	}
	
	// methode permettant de désinscrire un adhérent de la liste d'adhérents grâce à la méthode remove de classe ArrayList
	public void desincrire(Adherent adherent) {
		listeAdherent.remove(adherent);
		System.out.println("Une personne s'est désinscrite de la bibliothèque");
	}
	
	
	
	

}


