<!DOCTYPE html>
<html>
<head>
    <title>Modifier un Film</title>
</head>
<body>
<h2>Modifier un Film</h2>
<form action="edit" method="post">
    <input type="hidden" name="id" value="${movie.id}">

    <label for="titre">Titre:</label><br>
    <input type="text" id="titre" name="titre" value="${movie.titre}"><br><br>

    <label for="description">Description:</label><br>
    <input type="text" id="description" name="description" value="${movie.description}"><br><br>

    <label for="dateSortie">Date de Sortie:</label><br>
    <input type="text" id="dateSortie" name="dateSortie" value="${movie.dateSortie}"><br><br>

    <label for="duree">Durée:</label><br>
    <input type="number" id="duree" name="duree" value="${movie.duree}"><br><br>

    <label for="genre">Genre:</label><br>
    <input type="text" id="genre" name="genre" value="${movie.genre}"><br><br>

    <label for="realisateur">Réalisateur:</label><br>
    <input type="text" id="realisateur" name="realisateur" value="${movie.realisateur}"><br><br>

    <label for="acteurs">Acteurs:</label><br>
    <input type="text" id="acteurs" name="acteurs" value="${movie.acteurs}"><br><br>

    <label for="note">Note:</label><br>
    <input type="number" step="0.1" id="note" name="note" value="${movie.note}"><br><br>

    <label for="image">Image:</label><br>
    <input type="text" id="image" name="image" value="${movie.image}"><br><br>

    <input type="submit" value="Modifier">
</form>
<br>
<a href="movies">Retour à la liste des films</a>
</body>
</html>
