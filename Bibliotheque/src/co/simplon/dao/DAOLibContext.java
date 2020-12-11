package co.simplon.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public class DAOLibContext {
	
/*  Avec la méthode ServletContext, il ne sera pas nécessaire d'initiliaser les valeurs/paremètres de
 	connexion de la BDD. L'autre méthode consiste donc à utiliser les valeurs de chaque variable 
 	qui fait référence aux informations de connexion à la base de données MySQL Workbench */
	
	static String urldblib; //= "jdbc:mysql://localhost:3306/la_bibliotheque";
	static String usernlib; //= "root";
	static String pswdlib;  // = "nata0904elle0909";
	
/*Il faut s'assurer que le chemin d'accès au `Server Runtime` a bien été défini : Java Build Path, Add Library, 
 * Ajout du serveur souhaité afin d'importé par exemple  la classe ServletContext */

	public static void init(ServletContext context) {
		
		try {
			Class.forName(context.getInitParameter("JDBC_DRIVER"));
			urldblib = context.getInitParameter("JDBC_URL");
			usernlib = context.getInitParameter("JDBC_LOGIN");
			pswdlib = context.getInitParameter("JDBC_PASSWORD");
			
		} catch(ClassNotFoundException e) {
				e.printStackTrace();
		}
	}
	
		
		public static Connection getConnection() throws SQLException {

				try {
				// JDBC driver initialized
				// Le driver JDBC MySQL va pouvoir être initialisé
					
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				// Get a connection to a database la_bibliotheque
				/* Connexion à la base de données la_bibliotheque, la méthode .getConnection() prendra en paramètre 
				 les valeurs référentielles aux données de connexion à la BDD MySQL */
				
				Connection co = DriverManager.getConnection(urldblib, usernlib, pswdlib);
				System.out.println("New library have been opened, you're welcome");
			
				
				// return connection object co
				// retour l'objet de connexion co pour terminer la méthode `getConnection` 
				
				return co;

	}
				// Récupération du Dao Adhérent
		
		public AdherentDAO getAdherentDAO() {
			return new AdherentDaoImpl(this);
			
			// le mot clé `this` n'avait pas fonctionné et a causer une erreur ! (Pourquoi ?)
			/* Il n'avait pas fonctionné car cette liaison devait être validée grâce au constructeur de la classe AdherentDaoImpl
			  avec comme paramètre `daolibcontext` */
			 
		}
		
	
}
		

