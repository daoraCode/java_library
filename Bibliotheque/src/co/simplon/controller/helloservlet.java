package co.simplon.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.dao.AdherentDAO;
import co.simplon.dao.DAOLibContext;
import co.simplon.exo2.Adherent;


@WebServlet(name = "helloservlet", urlPatterns = "/helloservlet", loadOnStartup = 1)

public class helloservlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	// attribut faisant référence à l'interface
	AdherentDAO adherentDao;
	
	public helloservlet() {
        super();
    }
	
	// constructeurs faisont une liaison avec l'interface dao adherent
	public void init() throws ServletException {
		
		DAOLibContext.init(this.getServletContext());
		
		DAOLibContext daoLibContext = new DAOLibContext();
		this.adherentDao = daoLibContext.getAdherentDAO();
	}
	
    
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// création d'une variable LA
		List<Adherent> LA = this.adherentDao.lister();
		request.setAttribute("listeAdherents", LA);
		System.out.println(LA);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/adherent.jsp").forward(request, response);
	
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Adherent adherent = new Adherent();
		
		//int idAdherent = Integer.parseInt(request.getParameter("id_adherent"));
		String nomAdherent = request.getParameter("nom");
		String prenomAdherent = request.getParameter("prenom");
		String mailAdherent = request.getParameter("adresseMail");
		
		//adherent.setId_adherent(idAdherent);
		adherent.setNom(nomAdherent);
		adherent.setPrenom(prenomAdherent);
		adherent.setAdresseMail(mailAdherent);

		adherentDao.ajouter(adherent);
		// adherentDao.supprimer(adherent);

		request.setAttribute("listeAdherents", adherentDao.lister());
		this.getServletContext().getRequestDispatcher("/WEB-INF/adherent.jsp").forward(request, response);
	
	}

}
