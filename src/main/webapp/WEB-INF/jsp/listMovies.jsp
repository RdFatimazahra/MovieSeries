<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.model.Movie" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Films</title>
    <style>
        .movie-card {
            border: 1px solid #ccc;
            border-radius: 5px;
            margin: 10px;
            padding: 10px;
            width: 300px;
            display: inline-block;
            vertical-align: top;
        }
        .movie-card img {
            max-width: 100%;
            height: auto;
        }
        .actions {
            margin-top: 10px;
        }
        .actions a {
            display: inline-block;
            margin-right: 10px;
        }
    </style>
</head>
<body>
<h1>Liste des Films</h1>

<a href="create">Ajouter un nouveau film</a> <!-- Lien mis à jour -->

<div class="movies-container">
    <%
        List<Movie> movies = (List<Movie>) request.getAttribute("movies");
        if (movies != null) {
            for (Movie movie : movies) {
    %>
    <div class="movie-card">
        <h2><%= movie.getTitre() %></h2>
        <p><strong>Description:</strong> <%= movie.getDescription() %></p>
        <p><strong>Date de Sortie:</strong> <%= movie.getDateSortie() %></p>
        <p><strong>Durée:</strong> <%= movie.getDuree() %></p>
        <p><strong>Genre:</strong> <%= movie.getGenre() %></p>
        <p><strong>Réalisateur:</strong> <%= movie.getRealisateur() %></p>
        <p><strong>Acteurs:</strong> <%= movie.getActeurs() %></p>
        <p><strong>Note:</strong> <%= movie.getNote() %></p>
        <img src="<%= movie.getImage() %>" alt="Image de <%= movie.getTitre() %>">
        <div class="actions">
            <a href="edit/<%= movie.getId() %>">Modifier</a>
            <form action="deleteMovie" method="post" style="display:inline;">
                <input type="hidden" name="id" value="<%= movie.getId() %>">
                <button type="submit">Supprimer</button>
            </form>
        </div>
    </div>
    <%
        }
    } else {
    %>
    <p>Aucun film disponible</p>
    <%
        }
    %>
</div>

</body>
</html>
