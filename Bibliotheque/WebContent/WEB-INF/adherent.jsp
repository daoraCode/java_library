<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bibliothèque Mavel</title>
</head>
<body>
<h1>GESTION DES ADHERENTS - Bibliothèque F. Mittera - Ile-de-France </h1>
<form action="helloservlet" method="Post">
<label for="nom">Entrer votre nom :</label>
<input type="text" name="nom">
<label for="prenom">Entrer votre prénom :</label>
<input type="text" name="prenom">
<label for="adresseMail">Entrer votre adresse e-mail :</label>
<input type="text" name="adresseMail">	
<input type="submit" value="AJOUTER">


</form>
  <ul>
      <c:forEach var="adherent" items="${listeAdherents}">
        <li><c:out value="${adherent.nom}    "/>
        <c:out value="${adherent.prenom}    "/>
        <c:out value="${adherent.adresseMail}   "/></li>
      </c:forEach>
   </ul>
</body>
</html>