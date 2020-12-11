package co.simplon.exo2;

import java.util.Date;

public class Exemplaire {	
	private String editeur;
	private Date anneeEdition;
	

	// Constructeur
	public Exemplaire(String editeur, 
					  Date anneeEdition) {
		super();
		this.editeur = editeur;
		this.anneeEdition = anneeEdition;
	}

	// Redéfinition de la méthode toString()
	@Override
	public String toString() {
		return "Exemplaire [editeur : " + editeur + ", anneeEdition : " + anneeEdition + "]";
	}

	// Accesseurs : getters et setters
	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;	
	}

	public Date getAnneeEdition() {
		return anneeEdition;
	}

	public void setAnneeEdition(Date anneeEdition) {
		this.anneeEdition = anneeEdition;
	}
	
	
	
}
