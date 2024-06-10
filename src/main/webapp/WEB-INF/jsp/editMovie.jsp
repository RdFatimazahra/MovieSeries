<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.model.Movie" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modifier Film</title>
    <style>
        label {
            display: inline-block;
            width: 100px;
            font-weight: bold;
        }
        input[type="text"] {
            width: 300px;
            margin-bottom: 10px;
        }
        button {
            display: block;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<h1>Modifier Film</h1>
<form action="<%= request.getContextPath() %>/movies/edit" method="post">
    <%
        Movie movie = (Movie) request.getAttribute("movie");
    %>
    <input type="hidden" name="id" value="<%= movie.getId() %>">
    <label for="titre">Titre:</label>
    <input type="text" id="titre" name="titre" value="<%= movie.getTitre() %>"><br>
    <label for="description">Description:</label>
    <input type="text" id="description" name="description" value="<%= movie.getDescription() %>"><br>
    <label for="dateSortie">Date de Sortie:</label>
    <input type="text" id="dateSortie" name="dateSortie" value="<%= movie.getDateSortie() %>"><br>
    <label for="duree">Durée:</label>
    <input type="text" id="duree" name="duree" value="<%= movie.getDuree() %>"><br>
    <label for="genre">Genre:</label>
    <input type="text" id="genre" name="genre" value="<%= movie.getGenre() %>"><br>
    <label for="realisateur">Réalisateur:</label>
    <input type="text" id="realisateur" name="realisateur" value="<%= movie.getRealisateur() %>"><br>
    <label for="acteurs">Acteurs:</label>
    <input type="text" id="acteurs" name="acteurs" value="<%= movie.getActeurs() %>"><br>
    <label for="note">Note:</label>
    <input type="text" id="note" name="note" value="<%= movie.getNote() %>"><br>
    <label for="image">Image URL:</label>
    <input type="text" id="image" name="image" value="<%= movie.getImage() %>"><br>
    <button type="submit">Enregistrer</button>
</form>
</body>
</html>
