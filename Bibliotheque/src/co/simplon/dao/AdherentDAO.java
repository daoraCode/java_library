package co.simplon.dao;

import java.util.List;

import co.simplon.exo2.Adherent;

public interface AdherentDAO {
	
	
	
	
	 
	/* Interface destinées aux adhérents : elle représente une liaison spécifique à l'entité (la classe, objet métier, modèle ou bean) Adhérent, 
	 * Pour insérer un attribut de la BDD, cette méthode prend pour objet Adherent en paramètre et ne retourne rien, 
	 * celle-ci sera réellement implémentée dans `AdherentDaoImpl` */
	
	void ajouter(Adherent adherent);
	
	
	
	
	/* Pour retirer un attribut de la la BDD, cette méthode prend pour objet Adherent en paramètre car et ne retourne rien, 
	 * celle-ci sera réellement implémentée dans `AdherentDaoImpl */
	
	void supprimer(Adherent adherent);
	
	
	

	
	// Pour retourner la liste des adhérents préalablement insérer dans la BDD (Cette méthode ne prend pas de paramètres)
	// <Adherent> car nous voulons accéder à l'objet métier Adherent qui remplira la liste créée
	
	List<Adherent> lister();
 

}
