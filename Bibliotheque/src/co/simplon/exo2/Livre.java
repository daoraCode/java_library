package co.simplon.exo2;

import java.util.Date;

public class Livre extends Exemplaire {
	private int identifiant;
	private String titre;
	private Auteur auteur;
	
	
	// Construteur, la variable auteur est un attribut de la classe Livre, mais également une classe apparentière : Auteur
	public Livre(String editeur, Date anneeEdition, int identifiant, String titre, Auteur auteur) {
		super(editeur, anneeEdition);
		this.identifiant = identifiant;
		this.titre = titre;
		this.auteur = auteur;
	}
	
	
	// Redéfinition de la méthode toString()
	@Override
	public String toString() {
		return "Livre [identifiant : " + identifiant + ", titre : " + titre + ", auteur : " + auteur + "]";
	}


	


	// Accesseurs : getters et setters
	public int getIdentifiant() {
		return identifiant;
	}
	
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	
	
}
