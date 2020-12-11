package co.simplon.exo1;

import co.simplon.utilexo.DateUtil;
import java.util.Date;

public class GestionAdherents {

	public static void main(String[] args) {
		
		Adherent lolo;
		lolo = new Adherent();
		lolo.setNom("Soren");
		lolo.setPrenom("Severin");
		Date dateDeNaissance = DateUtil.toDate("25/12/2020", "dd/MM/yyyy");
		lolo.setDateDeNaissance(dateDeNaissance);
		lolo.setAdresseMail("severin.soren@capture.com");
		lolo.setAdressePostale("93000");
		//System.out.println(lolo);
		
		Adherent toto = lolo;
		//System.out.println(toto);
		toto.setPrenom("Thomas");
		//System.out.println(toto);
		//System.out.println(lolo);
		
		
		// création de la bibliothèque pour les adhérents
		Bibliotheque library = new Bibliotheque("François Mitterand", "Paris 1, 75001");
		System.out.println(library);
		
		library.inscrire(lolo);
		System.out.println(library);
		
		library.desincrire(lolo);
		System.out.println(library);
		
		
		
		
		
		
		
	}

}