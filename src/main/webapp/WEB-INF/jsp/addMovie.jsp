<!DOCTYPE html>
<html>
<head>
    <title>Ajouter un Film</title>
</head>
<body>
<h2>Ajouter un Nouveau Film</h2>
<form action="add" method="post">
    <label for="titre">Titre:</label><br>
    <input type="text" id="titre" name="titre"><br><br>

    <label for="description">Description:</label><br>
    <input type="text" id="description" name="description"><br><br>

    <label for="dateSortie">Date de Sortie:</label><br>
    <input type="text" id="dateSortie" name="dateSortie"><br><br>

    <label for="duree">Durée:</label><br>
    <input type="number" id="duree" name="duree"><br><br>

    <label for="genre">Genre:</label><br>
    <input type="text" id="genre" name="genre"><br><br>

    <label for="realisateur">Réalisateur:</label><br>
    <input type="text" id="realisateur" name="realisateur"><br><br>

    <label for="acteurs">Acteurs:</label><br>
    <input type="text" id="acteurs" name="acteurs"><br><br>

    <label for="note">Note:</label><br>
    <input type="number" step="0.1" id="note" name="note"><br><br>

    <label for="image">Image URL:</label><br>
    <input type="text" id="image" name="image"><br><br>

    <input type="submit" value="Ajouter">
</form>
</body>
</html>
