<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.model.Movie" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Films</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        img {
            max-width: 100px;
            max-height: 100px;
        }
        .actions {
            white-space: nowrap;
        }
    </style>
</head>
<body>
<h1>Liste des Films</h1>
<table>
    <thead>
    <tr>
        <th>Titre</th>
        <th>Description</th>
        <th>Date de Sortie</th>
        <th>Durée</th>
        <th>Genre</th>
        <th>Réalisateur</th>
        <th>Acteurs</th>
        <th>Note</th>
        <th>Image</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Movie> movies = (List<Movie>) request.getAttribute("movies");
        if (movies != null) {
            for (Movie movie : movies) {
    %>
    <tr>
        <td><%= movie.getTitre() %></td>
        <td><%= movie.getDescription() %></td>
        <td><%= movie.getDateSortie() %></td>
        <td><%= movie.getDuree() %></td>
        <td><%= movie.getGenre() %></td>
        <td><%= movie.getRealisateur() %></td>
        <td><%= movie.getActeurs() %></td>
        <td><%= movie.getNote() %></td>
        <td><img src="<%= movie.getImage() %>" alt="Image de <%= movie.getTitre() %>"></td>
        <td class="actions">
            <a href="editMovie.jsp?id=<%= movie.getId() %>">Modifier</a>
            <form action="deleteMovie" method="post" style="display:inline;">
                <input type="hidden" name="id" value="<%= movie.getId() %>">
                <button type="submit">Supprimer</button>
            </form>
        </td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="10">Aucun film disponible</td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
<br>
<a href="jsp/addMovie.jsp">Ajouter un nouveau film</a> <!-- Lien mis à jour -->
</body>
</html>
