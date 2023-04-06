<!DOCTYPE html>
<html lang="fr">




<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="">
    <title>Document</title>
</head>




<body>
<c:choose>
	<c:when test="${utilisateurs.no_utilisateur != null }">
		<%@include file="headerDisconnectBTN.jsp" %>
	</c:when>
	<c:otherwise>
		<%@include file="header.jsp" %>
	</c:otherwise>
</c:choose>
    <h3>Détail vente</h3>
    <h4>Nom de l'objet</h4>
    <div class="picture">
        <img src="" alt="">
    </div>
    <div class="detail-object">
        <p class="left">Description</p>
        <p class="right">###</p>
        <p class="left">Categorie</p>
        <p class="right">###</p>
        <p class="left">Meilleur offre</p>
        <p class="right">###</p>
        <p class="left">Mise a prix</p>
        <p class="right">###</p>
        <p class="left">Fin de l'enchere</p>
        <p class="right">###</p>
        <p class="left">Retrait</p>
        <p class="right">###</p>
        <p class="left">Vendeur</p>
        <p class="right">###</p>
    </div>


    <label for="proposition">Ma proposition</label>
    <input type="number" name="proposition" id="proposition">


    <button type="submit">Enchérir</button>
    <button type="submit">Retour</button>
</body>




</html>
