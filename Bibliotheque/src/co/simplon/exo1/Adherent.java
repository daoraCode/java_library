package co.simplon.exo1;

import co.simplon.utilexo.DateUtil;
import java.util.Date;

public class Adherent {

	private String nom;
	private String prenom;
	private String adresseMail;
	private Date dateDeNaissance;
	private String adressePostale;
	
	

	public Adherent() {
		super();
	}
	
	// Constructeur
	public Adherent(String nom, 
					String prenom,
					String adresseMail,
					Date dateDeNaissance, 
					String adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.dateDeNaissance = dateDeNaissance;
		this.adressePostale = adressePostale;
	}
	
	// Redéfinition de la méthode toString()
	@Override
	public String toString() {
		return "Adherent [nom=" + nom + ", prenom=" + prenom + ", adresseMail=" + adresseMail + ", dateDeNaissance="
				+ dateDeNaissance + ", adressePostale=" + adressePostale + "]";
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


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	
	public String getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	
	
	
}
