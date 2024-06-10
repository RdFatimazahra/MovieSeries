<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Détails du Film</title>
</head>
<body>
<h1>Détails du Film</h1>
<p><strong>Titre:</strong> ${movie.titre}</p>
<p><strong>Description:</strong> ${movie.description}</p>
<p><strong>Date de Sortie:</strong> ${movie.dateSortie}</p>
<p><strong>Durée:</strong> ${movie.duree}</p>
<p><strong>Genre:</strong> ${movie.genre}</p>
<p><strong>Réalisateur:</strong> ${movie.realisateur}</p>
<p><strong>Acteurs:</strong> ${movie.acteurs}</p>
<p><strong>Note:</strong> ${movie.note}</p>
<p><strong>Image URL:</strong> ${movie.image}</p>
<a href="${pageContext.request.contextPath}/movies/list">Retour à la liste</a>
</body>
</html>
