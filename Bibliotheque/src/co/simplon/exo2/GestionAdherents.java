package co.simplon.exo2;

import co.simplon.utilexo.DateUtil;
import java.util.Date;
import java.util.ArrayList;

public class GestionAdherents {

	public static void main(String[] args) {
		
		Adherent lolo;
		lolo = new Adherent();
		lolo.setNom("Soren");
		lolo.setPrenom("Severin");
		Date dateDeNaissance = DateUtil.toDate("25/12/2020", "dd/MM/yyyy");
		lolo.setDateDeNaissance(dateDeNaissance);
		lolo.setAdresseMail("severin.soren@capture.com");
		lolo.setAdressePostale(93942);
		System.out.println(lolo);
		System.out.println("---------------------------");
		
		// Définition de la bibliothèque des adhérents
		ArrayList<Adherent> listeBiblioAdh = new ArrayList<Adherent>();
		ArrayList<FicheEmprunt> listeFicheEmprunt = new ArrayList<FicheEmprunt>();
		Bibliotheque bibliotheque = new Bibliotheque("F.Mitterand", "Paris Rue 1", listeBiblioAdh, listeFicheEmprunt);
		System.out.println(bibliotheque);
		System.out.println("---------------------------");
		
		// Inscription d'un adhérent
		bibliotheque.inscrire(lolo);
		System.out.println(bibliotheque);
		System.out.println("---------------------------");
		
		// Désinscription d'un adhérent
		bibliotheque.desincrire(lolo);
		System.out.println(bibliotheque);
		System.out.println("---------------------------");
		
		bibliotheque.inscrire(lolo);
		System.out.println(bibliotheque);
		System.out.println("---------------------------");
		
		// La création d'un exmplaire que je compte emprunter par la suite
		Exemplaire exemplaire = new Exemplaire("Gallimar", DateUtil.toDate("01/12/2019", "dd/MM/yyyy"));
		System.out.println("---------------------------");
	
		// La date de mon emprunt de cet exemplaire
		Date dateEmprunt = DateUtil.toDate("01/12/2019", "dd/MM/yyyy");
		System.out.println("---------------------------");
		
		// L'emprunt de l'exemplaire avec la date correspondante
		lolo.emprunter(exemplaire, dateEmprunt);
		System.out.println(lolo.getListeExemplaire());
		System.out.println("---------------------------");
		
		// Nouvel Adhérent : Thomas
			
		
	
	}
}