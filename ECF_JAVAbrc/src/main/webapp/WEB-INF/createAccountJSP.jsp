<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/profilUserCSS.css">
    <title>Document</title>
</head>

<body>
	<%@include file="header.jsp" %>
    <form action="./SerlvetCreateAccount" method="POST">
        <h3>Mon profil</h3>
        <div class="form-div">
            <label for="nickname">Pseudo</label>
			<input type="text" id="nickname" name="creationAccountNickName"required/>
        </div>
        <div class="form-div">
            <label for="lastName">Nom</label>
			<input type="text" id="lastName" name="creationAccountLastName"required/>
        </div>
        <div class="form-div">
            <label for="name">Prénom</label>
			<input type="text" id="name" name="creationAccountName"required/>
        </div>
        <div class="form-div">
            <label for="email">Email</label>
			<input type="email" id="email" name="creationAccountEmail"required/>
        </div>
        <div class="form-div">
            <label for="phone">Télephone</label>
			<input type="tel" id="phone" name="creationAccountPhone"required/>
        </div>
        <div class="form-div">
            <label for="street">Rue</label>
			<input type="text" id="street" name="creationAccountStreet"required/>
        </div>
        <div class="form-div">
            <label for="postalCode">Code Postal</label>
			<input type="number" id="postalCode" name="creationAccountNumber"required/>
        </div>
        <div class="form-div">
            <label for="city">Ville</label>
			<input type="text" id="city" name="creationAccountCity"required/>
        </div>
        <div class="form-div">
            <label for="password">Mot de passe</label>
			<input type="password" id="password" name="creationAccountPassword"required/>
        </div>
        <div class="form-div">
			<label for="passwordConfirmation">Confirmation</label>
			<input type="password" id="passwordConfirmation" name="creationAccountPasswordConfirmation"required/>
        </div>
        <div class="btn-grp">
            <button>Créer</button>
            <div class="btn-annuler"><a href="./">Annuler</a></div>
            
            
        </div>
    </form>
</body>

</html>
