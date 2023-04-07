<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="shortcut icon" href="./images/unnamed.png" type="image/x-icon">

    <title>Accueil</title>
</head>

<body>
	<%@include file="header.jsp" %>

    <main>
        <div class="container_main">
            <form action="#" method="get">
                <h2>Filtres :</h2>
                <div class="container_label_select">
                    <div class="label_categorie">
                        <label for="select_category">Cat�gories :</label>
                        <div class="select_categorie">
                            <select name="select_category" id="select_category" form="select_category"
                                class="index_select">
                                <option value="car">Voiture</option>
                                <option value="furnishing">Ameublement</option>
                                <option value="art_and_decoration">Art et d�coration</option>
                                <option value="fashion_and_jewelry">Mode et bijoux</option>
                                <option value="watchmaking">Horlogerie</option>
                                <option value="music">Musique</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="search_bar">
                    <input type="text" name="search" placeholder="Le nom de l'article" />
                </div>
                <div class="search_button">
                    <button>Rechercher</button>
                </div>
            </form>
        </div>
        <!-- 		ajouter les derniers annonces mis sur le site -->
        <!-- ---------------------------------------------------- -->
        <section>
            <div class="grille">
                <div class="grid-item">
                    <div class="grid-left">
                        <img src="" alt="">
                    </div>
                    <div class="grid-right">
                        <h6>Titre article</h6>
                        <div class="right-txt">
                            <div class="line">
                                <p class="type">Prix</p>
                                <p class="type2">XXX pts</p>
                            </div>
                            <div class="line">
                                <p class="type">Fin de l'ench�re</p>
                                <p class="type2">xx/xx/xx</p>
                            </div>
                            <div class="line">
                                <p class="type">Retrait</p>
                                <p class="type2">xx Rue mes couilles 75000 Paris</p>
                            </div>
                            <div class="line">
                                <p class="type">Vendeur</p>
                                <p class="type2">pseudo</p>
                            </div>
                        </div>
                        
                    </div>
                </div>
                <div class="grid-item">
                    <div class="grid-left">
                        <img src="" alt="">
                    </div>
                    <div class="grid-right">
                        <h6>Titre article</h6>
                        <div class="right-txt">
                            <div class="line">
                                <p class="type">Prix</p>
                                <p class="type2">XXX pts</p>
                            </div>
                            <div class="line">
                                <p class="type">Fin de l'ench�re</p>
                                <p class="type2">xx/xx/xx</p>
                            </div>
                            <div class="line">
                                <p class="type">Retrait</p>
                                <p class="type2">xx Rue mes couilles 75000 Paris</p>
                            </div>
                            <div class="line">
                                <p class="type">Vendeur</p>
                                <p class="type2">pseudo</p>
                            </div>
                        </div>
                        
                    </div>
                </div>
                
            <!-- 
                <div class="grid-item"></div>
                <div class="grid-item"></div>
                <div class="grid-item"></div>
                <div class="grid-item"></div> 
            -->
            </div>
        </section>
    </main>

</body>

</html>