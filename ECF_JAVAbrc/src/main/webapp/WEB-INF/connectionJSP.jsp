<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/connection.css">
<title>Connexion</title>
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
	<form action="./ServletConnectionUsers" method="POST">

		<div class="label-input">
			<label for="login_user">Identifiant</label>
			<input type="text" id="login_user" name="account_connection_form">
        </div>
        <div class="label-input">
			<label for="login_password">Mot de passe</label>
			<input type="password" id="login_password" name="account_connectionn_form">
		</div>


		<div class="login-container">
            <div class="login-container-right">
                <button>Connexion</button>
                <input type="checkbox" name="cookie_remember_me" id="label_cookie">
                <label for="label_cookie">Se souvenir de moi</label>
            </div>
            <a href="./ServletForgotPassword">Mot de passe oubli�</a>
		</div>
	</form>
	<form action="./SerlvetCreateAccount" method="get" class="form2">
		<button id="btn-createAcc">Cr�er un compte</button>
	</form>
</body>
</html>