package co.simplon.exo2;

import java.util.Date;

public class Auteur extends Livre {
	private int id_auteur;
	private String nom;
	private String prenom;
	
	// Constructeur
	public Auteur(String editeur, Date anneeEdition, int identifiant, String titre, Auteur auteur, int id_auteur,
			String nom, String prenom) {
		super(editeur, anneeEdition, identifiant, titre, auteur);
		this.id_auteur = id_auteur;
		this.nom = nom;
		this.prenom = prenom;
	}

	// Redéfinition de la méthode toString()
	@Override
	public String toString() {
		return "Auteur [identifiant de l'auteur : " + id_auteur + ", nom de l'auteur : " + nom + ", prenom de l'auteur : " + prenom + "]";
	}

	// Accesseurs : getters et setters
	public int getId_auteur() {
		return id_auteur;
	}

	public void setId_auteur(int id_auteur) {
		this.id_auteur = id_auteur;
	}

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
}
