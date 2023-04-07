<!DOCTYPE html>
<html lang="fr">


<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/profilUserCSS.css">
    <title>Document</title>
</head>


<body>
<c:choose>
	<c:when test="${sessionScope.utilisateur != null }">
		<%@include file="headerDisconnectBTN.jsp" %>
	</c:when>
	<c:otherwise>
		<%@include file="header.jsp" %>
	</c:otherwise>
</c:choose>
    <form action="./ServletUpdateAccount" method="post">
        <h3>Mon profil</h3>
        <div class="form-div">
            <label for="username">Pseudo</label>
            <input type="text" value="${ sessionScope.utilisateur.pseudo }" id="username">
        </div>
        <div class="form-div">
            <label for="lastname">nom</label>
            <input type="text" value="${ sessionScope.utilisateur.nom }" id="lastname">
        </div>
        <div class="form-div">
            <label for="firstname">Prénom</label>
            <input type="text" value="${ sessionScope.utilisateur.prenom }" id="firstname">
        </div>
        <div class="form-div">
            <label for="email">Email</label>
            <input type="email" value="${ sessionScope.utilisateur.email }" id="email">
        </div>
        <div class="form-div">
            <label for="phone">Téléphone</label>
            <input type="tel" value="${ sessionScope.utilisateur.telephone }" id="phone">
        </div>
        <div class="form-div">
            <label for="street">Rue</label>
            <input type="text" value="${ sessionScope.utilisateur.rue }" id="street">
        </div>
        <div class="form-div">
            <label for="zip">Code postal</label>
            <input type="number" value="${ sessionScope.utilisateur.codePostal }" id="zip">
        </div>
        <div class="form-div">
            <label for="city">Ville</label>
            <input type="text" value="${ sessionScope.utilisateur.ville }" id="city">
        </div>
        <div class="btn-grp">
            <button>Modifier</button>
            <button>Supprimer mon compte</button>
            <button>Retour</button>
        </div>
    </form>
</body>


</html>