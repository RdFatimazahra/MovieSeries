<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter une Série</title>
</head>
<body>
<h1>Ajouter une Série</h1>
<form method="post" action="ajouterSerie">
    <label for="titre">Titre:</label>
    <input type="text" id="titre" name="titre" required><br>
    <label for="description">Description:</label>
    <textarea id="description" name="description" required></textarea><br>
    <label for="dateDebut">Date de Début:</label>
    <input type="date" id="dateDebut" name="dateDebut" required><br>
    <label for="dateFin">Date de Fin:</label>
    <input type="date" id="dateFin" name="dateFin" required><br>
    <label for="nombreDeSaison">Nombre de Saisons:</label>
    <input type="number" id="nombreDeSaison" name="nombreDeSaison" required><br>
    <label for="genre">Genre:</label>
    <input type="text" id="genre" name="genre" required><br>
    <label for="createur">Créateur:</label>
    <input type="text" id="createur" name="createur" required><br>
    <label for="acteurs">Acteurs:</label>
    <textarea id="acteurs" name="acteurs" required></textarea><br>
    <label for="note">Note:</label>
    <input type="number" id="note" name="note" min="0" max="10" step="0.1" required><br>
    <input type="submit" value="Ajouter">
</form>
</body>
</html>
