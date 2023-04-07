<header class="header">
	<img alt="logo" src="./images/unnamed.png">
<!-- 	//Si mon User n'est pas vide, j'affiche le premier menu -->
<!-- 	//Si mon User est vide j'affiche le deuxieme menu -->
		<div class="link_connection">
			<nav>
				<c:choose>
					<c:when test="${!empty sessionScope.utilisateur }" >
						<ul class="nodot">
							<li ><a href="">Vendre un article</a></li>
							<li><a href="./ServletProfil">Mon profil</a></li>
							<li><a href="./Deconnexion">Deconnection</a></li>
						</ul>
					</c:when>
					<c:when test="${empty sessionScope.utilisateur }" >
						<ul class="nodot">
							<li><a href="./ServletConnectionUsers">S'inscrire - Se connecter</a></li>
						</ul>
					</c:when>		
				</c:choose>	
			</nav>
		</div>
	
</header>