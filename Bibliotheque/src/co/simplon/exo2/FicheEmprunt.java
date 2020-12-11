package co.simplon.exo2;

import java.util.ArrayList;
import java.util.Date;

import co.simplon.utilexo.DateUtil;

public class FicheEmprunt {	
	private Date dateEmprunt;
	private Date dateLimiteEmprunt;
	
	// Constructeur pour créer l'objet : la fiche d'emprunt
	public FicheEmprunt(String nomBibilotheque, String adresseBibliotheque, ArrayList<Adherent> listeAdherent,
			Date dateEmprunt, Date dateLimiteEmprunt) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.dateLimiteEmprunt = dateLimiteEmprunt;
	}

	// Constructeurs sans paramètres
	public FicheEmprunt(String nomBibilotheque, String adresseBibliotheque, ArrayList<Adherent> listeAdherent) {
		super();
	}	

	// Accesseurs : getters et setters
	public Date getDateEmprunt() {
		return dateEmprunt;
	}


	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateLimiteEmprunt() {
		return dateLimiteEmprunt;
	}

	public void setDateLimiteEmprunt(Date dateLimiteEmprunt) {
		this.dateLimiteEmprunt = dateLimiteEmprunt;
	}

	@Override
	public String toString() {
		String emprunt = DateUtil.toString(dateEmprunt, "dd/MM/yyyy");
		String limiteEmprunt = DateUtil.toString(dateLimiteEmprunt, "dd/MM/yyyy");
		
		return "FicheEmprunt [date de l'emprunt : " + emprunt + ", date limite de l'emprunt : " + limiteEmprunt + "]";
	}
	
	
	

}
