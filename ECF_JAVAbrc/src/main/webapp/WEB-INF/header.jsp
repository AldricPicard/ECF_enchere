<header>
	<img alt="logo" src="./images/unnamed.png">
	<nav>
	
<!-- 	//Si mon User n'est pas vide, j'affiche le premier menu -->
<!-- 	//Si mon User est vide j'affiche le deuxieme menu -->
		<c:choose>
			<c:when test="${!empty sessionScope.utilisateur }" >
				<ul>
					<li><a href="">Vendre un article</a></li>
					<li><a href="./ServletProfil">Mon profil</a></li>
					<li><a href="./Deconnexion">Deconnection</a></li>
				</ul>
			</c:when>
			<c:when test="${empty sessionScope.utilisateur }" >
				<ul>
				<li><a href="./ServletConnectionUsers">S'inscrire</a></li>
				<li><a href="./ServletConnectionUsers">Se connecter</a></li>
			</ul>
			</c:when>		
		</c:choose>	
	</nav>
</header>