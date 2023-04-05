<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">




<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="page7style.css">
    <title>Document</title>
</head>




<body>
	<%@include file="header.jsp" %>
    <h3>Vous avez remportée l'enchere</h3>
    <h4>Nom de l'objet</h4>
    <div class="picture">
        <img src="" alt="">
    </div>
    <div class="detail-object">
        <p class="left">Meilleur offre</p>
        <p class="right">###</p>
        <p class="left">Mise a prix</p>
        <p class="right">###</p>
    </div>


    <fieldset>
        <legend>Retrait</legend>
        <p>adresse 10 rue</p>
        <p>vendeur</p>
        <p>telephone</p>
    </fieldset>
    <button type="submit">Retrait effectué</button>
</body>




</html>
