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
	<%@include file="header.jsp" %>
    <form action="./#" method="post">
        <h3>Mon profil</h3>
        <div class="form-div">
            <label for="username">Pseudo</label>
            <input type="text" value="${ pseudo }" id="username">
        </div>
        <div class="form-div">
            <label for="lastname">nom</label>
            <input type="text" value="${ nom }" id="lastname">
        </div>
        <div class="form-div">
            <label for="firstname">Prénom</label>
            <input type="text" value="${ prenom }" id="firstname">
        </div>
        <div class="form-div">
            <label for="email">Email</label>
            <input type="email" value="${ email }" id="email">
        </div>
        <div class="form-div">
            <label for="phone">Téléphone</label>
            <input type="tel" value="${ phone }" id="phone">
        </div>
        <div class="form-div">
            <label for="street">Rue</label>
            <input type="text" value="${ street }" id="street">
        </div>
        <div class="form-div">
            <label for="zip">Code postal</label>
            <input type="number" value="${ number }" id="zip">
        </div>
        <div class="form-div">
            <label for="city">Ville</label>
            <input type="text" value="${ city }" id="city">
        </div>
        <div class="btn-grp">
            <button>Modifier</button>
            <button>Supprimer mon compte</button>
            <button>Retour</button>
        </div>
    </form>
</body>


</html>