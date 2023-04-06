<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="page5style.css">
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

    <h3>Filtres :</h3>
    <form action="" method="post">
        <fieldset>
            <legend>
                <input type="radio" id="achats" name="drone" value="achats" checked>
                <label for="achats">Achats</label>
            </legend>


            <div>
                <input type="checkbox" id="auction_open" name="auction_open" value="auction_open" checked>
                <label for="auction_open">Mes enchères ouvertes</label>
            </div>


            <div>
                <input type="checkbox" id="auction_active" name="drone" value="auction_active">
                <label for="auction_active">Mes enchères en cours</label>
            </div>


            <div>
                <input type="checkbox" id="auction_win" name="auction_win" value="auction_win" checked>
                <label for="auction_win">Mes enchères remportées</label>
            </div>
        </fieldset>


        <fieldset>
            <legend>
                <input type="radio" id="achats" name="drone" value="achats" checked>
                <label for="achats">Achats</label>
            </legend>


            <div>
                <input type="checkbox" id="huey" name="drone" value="huey" checked>
                <label for="huey">Huey</label>
            </div>


            <div>
                <input type="checkbox" id="dewey" name="drone" value="dewey">
                <label for="dewey">Dewey</label>
            </div>


            <div>
                <input type="checkbox" id="louie" name="drone" value="louie">
                <label for="louie">Louie</label>
            </div>
        </fieldset>


        <label for="category">Catégories</label>
        <select name="category" id="category">
            <option value="all">Toutes</option>
            <option value="car">Voiture</option>
            <option value="furnishing">Ameublement</option>
            <option value="art_and_decoration">Art et décoration</option>
            <option value="fashion_and_jewelry">Mode et bijoux</option>
            <option value="watchmaking">Horlogerie</option>
            <option value="music">Musique</option>
        </select>


        <!-- <label for="search-input"></label> -->
        <input type="search" name="search-input" id="search-input" placeholder="Le nom de l'arcticle contient" size="25">


        <button type="submit">Rechercher</button>
    </form>


    <div class="container"></div>
</body>




</html>
