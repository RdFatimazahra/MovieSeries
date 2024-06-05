<html>
<head>
    <title>Add/Edit Movie</title>
</head>
<body>
<h2>${movie.id == null ? 'Add' : 'Edit'} Movie</h2>
<form action="${pageContext.request.contextPath}/movies${movie.id != null ? '/' + movie.id : ''}" method="post">
    <input type="hidden" name="id" value="${movie.id}" />
    <p>Title: <input type="text" name="titre" value="${movie.titre}" /></p>
    <p>Description: <textarea name="description">${movie.description}</textarea></p>
    <p>Release Date: <input type="text" name="dateSortie" value="${movie.dateSortie}" /></p>
    <p>Duration: <input type="text" name="duree" value="${movie.duree}" /></p>
    <p>Genre: <input type="text" name="genre" value="${movie.genre}" /></p>
    <p>Director: <input type="text" name="realisateur" value="${movie.realisateur}" /></p>
    <p>Actors: <input type="text" name="acteurs" value="${movie.acteurs}" /></p>
    <p>Rating: <input type="text" name="note" value="${movie.note}" /></p>
    <p><input type="submit" value="Save" /></p>
</form>
<a href="${pageContext.request.contextPath}/movies">Back to list</a>
</body>
</html>
