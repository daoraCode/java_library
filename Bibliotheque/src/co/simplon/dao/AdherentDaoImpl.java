package co.simplon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import co.simplon.exo2.Adherent;

	
// Cette classe a été générée grâce à la méthode getAdherentDAO() provenant de la classe `DAOLibContext`

public class AdherentDaoImpl implements AdherentDAO {
	
	// Implémentation des méthodes de l'interface AdherentDAO
	// Il s'agit d'une classe qui va servir à implémenter les méthodes de l'interface `AdherentDAO`
	
	// Implémentation MySQL
	
	// Attribut principal avant le constructeur de la classe : cet attribut est la classe `DAOLibContext` qui contient le driver DBC MySQL
	private DAOLibContext daolibcontext;

	
	// Constructeur prenant comme paramètre la classe DAOLibContext
	public AdherentDaoImpl(DAOLibContext daolibcontext) {
		this.daolibcontext = daolibcontext;
	}
	
	
	


	@Override
	public void ajouter(Adherent adherent) {	
		
		/* Il faudra définir une requête préparée pour insérer une entrée (une ligne) dans la 
		* table Adherent, requêtes MySQL : nous y retrouvons la même syntaxe mais définie en chaîne de caractères */
		
		Connection connexion = null;
		PreparedStatement preparedStatement = null;		
		try {			
			 connexion = DAOLibContext.getConnection();
			 preparedStatement = connexion.prepareStatement("INSERT INTO la_bibliotheque.Adherent(lastName, firstName, mail) VALUES(?, ?, ?);");	
			 preparedStatement.setString(1, adherent.getNom());
			 preparedStatement.setString(2, adherent.getPrenom());
			 preparedStatement.setString(3, adherent.getAdresseMail()); 
			 preparedStatement.executeUpdate();	 
			 // Vérifier si les informations ont bien été entrées dans les champs de texte */
			 int rowInserted = preparedStatement.executeUpdate();
			 if (rowInserted > 0) {
				 System.out.println("A new adherent have been subscribed in the F. Mittera Library");
			 }
		} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	
	

	@Override
	public List<Adherent> lister() {

		// Récupération des adhérents de la la table adherents
		
		List<Adherent> listeAdherents = new ArrayList<Adherent>();
		
		Statement statement = null;
		ResultSet result = null;
		Connection connexion = null;
		
		try {
			
			connexion = DAOLibContext.getConnection();
			statement = connexion.createStatement();
			
		// Etablissement de la Requête SQL permettant d'afficher la liste des adherents
		result = statement.executeQuery("SELECT lastName, firstName, mail FROM la_bibliotheque.Adherent;");
	
		
		// ---- récuparation des données de la bdd `la_bibliotheque`
		/* la méthode .next() = lecture ligne par ligne de tous les éléments de la table (retours de requêtes) */
		while(result.next()) {
			int id = result.getInt("id_adherent");
			String nom = result.getString("lastName");
			String prenom = result.getString("firstName");
			String adresseMail = result.getString("mail");
			
			// instanciation de l'objet métier `adh` de type Adherent
			Adherent adh = new Adherent();
			
			// les variables définies avant doivent être reprises pour avoir accès aux références / aux attributs de la table
			adh.setId_adherent(id);
			adh.setNom(nom);
			adh.setPrenom(prenom);
			adh.setAdresseMail(adresseMail);

			listeAdherents.add(adh);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return listeAdherents;
		
	  }
	
	
	
	
	
	
	@Override
	public void supprimer(Adherent adherent) {
		/* Il faudra définir une requête préparée pour supprimer une ligne dans la table Adherent, 
		 * requêtes MySQL similaire au Workbench, pour renommer une colonne : ALTER TABLE la_bibliotheque.Adherent CHANGE `id_adhrent` `id_adherent` int */
		Connection connexionDel = null;
		PreparedStatement preparedStatementDel = null;
		try {
			connexionDel = DAOLibContext.getConnection();
			preparedStatementDel = connexionDel.prepareStatement("DELETE FROM la_bibliotheque.Adherent WHERE id_adherent = ?;");
			preparedStatementDel.setInt(1, adherent.getId_adherent());
			preparedStatementDel.executeUpdate();		
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	}
