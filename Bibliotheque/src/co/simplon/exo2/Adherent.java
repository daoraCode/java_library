package co.simplon.exo2;

import java.util.ArrayList;
import java.util.Date;

public class Adherent {
	private int id_adherent;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String adresseMail;
	private int adressePostale;
	private ArrayList<Exemplaire> listeExemplaire = new ArrayList<Exemplaire>();
	
	// Constructeur, l'attribut listeExemplaire est une variable de type Arraylist
	public Adherent() {
		super();
	}
	
	

	// Constructeur avec paramètres
	public Adherent(int id_adherent, String nom, String prenom, String adresseMail, Date dateDeNaissance,
			int adressePostale, ArrayList<Exemplaire> listeExemplaire) {
		super();
		this.id_adherent = id_adherent;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.dateDeNaissance = dateDeNaissance;
		this.adressePostale = adressePostale;
		this.listeExemplaire = listeExemplaire;
	}


	// Methode .toString()
	@Override
	public String toString() {
		return "Nouvel adhérent [nom : " + nom + ", prenom : " + prenom + ", adresse e-mail :" + adresseMail + "]";
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

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public int getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(int adressePostale) {
		this.adressePostale = adressePostale;
	}
	
	public ArrayList<Exemplaire> getListeExemplaire() {
		return listeExemplaire;
	}

	public int getId_adherent() {
		return id_adherent;
	}

	public void setId_adherent(int id_adherent) {
		this.id_adherent = id_adherent;
	}

	public void setListeExemplaire(ArrayList<Exemplaire> listeExemplaire) {
		this.listeExemplaire = listeExemplaire;
	}
	
	
	// Définition de la méthode emprunter(), elle utilise l'attribut listExemplaire pour y insérer .add provenant de la classe ArrayList
	// Les paramètre d'une méthode doivent éventuellement être rappelées pour chacune d'entre elles et dans l'ordre avec lesquelles elles ont été créées 
	public void emprunter(Exemplaire exemplaire, Date dateDePret) {
			this.listeExemplaire.add(exemplaire);
			System.out.println("Une personne a emprunté un livre à la bibliothèque");	
		
	}
	
	
}
