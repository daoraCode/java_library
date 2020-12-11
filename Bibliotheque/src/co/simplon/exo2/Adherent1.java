package co.simplon.exo2;

import java.util.ArrayList;

public class Adherent1 extends Bibliotheque {
	private String nom;
	private String prenom;
	private String adresseMail;
	
	
	
	// Constructeur sans paramètres
	public Adherent1(String nomBibilotheque, String adresseBibliotheque, ArrayList<Adherent> listeAdherent,
			ArrayList<FicheEmprunt> listeFicheEmprunt) {
		super(nomBibilotheque, adresseBibliotheque, listeAdherent, listeFicheEmprunt);
	}

	// Constructeurs de la classe Adhérent1 destiné à récupérer les informations essentielles : le nom, le prénom et l'adresse e-mail
	public Adherent1(String nomBibilotheque, String adresseBibliotheque, ArrayList<Adherent> listeAdherent,
			ArrayList<FicheEmprunt> listeFicheEmprunt, String nom, String prenom, String adresseMail) {
		super(nomBibilotheque, adresseBibliotheque, listeAdherent, listeFicheEmprunt);
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
	}

	// Accesseurs : getters et setters 
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	
	
	
	
	
	
	
}
