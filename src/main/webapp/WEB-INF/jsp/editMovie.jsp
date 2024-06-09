<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modifier Film</title>
</head>
<body>
<h1>Modifier Film</h1>
<form action="${pageContext.request.contextPath}/movies/edit" method="post">
    <input type="hidden" name="id" value="${movie.id}">
    <label for="titre">Titre:</label>
    <input type="text" id="titre" name="titre" value="${movie.titre}"><br>
    <label for="description">Description:</label>
    <input type="text" id="description" name="description" value="${movie.description}"><br>
    <label for="dateSortie">Date de Sortie:</label>
    <input type="text" id="dateSortie" name="dateSortie" value="${movie.dateSortie}"><br>
    <label for="duree">Durée:</label>
    <input type="text" id="duree" name="duree" value="${movie.duree}"><br>
    <label for="genre">Genre:</label>
    <input type="text" id="genre" name="genre" value="${movie.genre}"><br>
    <label for="realisateur">Réalisateur:</label>
    <input type="text" id="realisateur" name="realisateur" value="${movie.realisateur}"><br>
    <label for="acteurs">Acteurs:</label>
    <input type="text" id="acteurs" name="acteurs" value="${movie.acteurs}"><br>
    <label for="note">Note:</label>
    <input type="text" id="note" name="note" value="${movie.note}"><br>
    <label for="image">Image URL:</label>
    <input type="text" id="image" name="image" value="${movie.image}"><br>
    <button type="submit">Enregistrer</button>
</form>
</body>
</html>
