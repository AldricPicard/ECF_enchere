package fr.afpa.javaee.bo;

import java.time.LocalDate;

public class Articles {

	private String nomArticle;
	private String descriptionArticle;
	private LocalDate debutEncheres;
	private LocalDate finEncheres;
	private int prixInitial;
	private int prixDeLaVente;
	private Users user;
	private Categories categorie;
	
	public Articles(String nomArticle, String descriptionArticle, LocalDate debutEncheres, LocalDate finEncheres, int prixInitial, int prixDeLaVente,
			Users user, Categories categorie) {
		this.nomArticle = nomArticle;
		this.descriptionArticle = descriptionArticle;
		this.debutEncheres = debutEncheres;
		this.finEncheres = finEncheres;
		this.prixInitial = prixInitial;
		this.prixDeLaVente = prixDeLaVente;
		this.user = user;
		this.categorie = categorie;
	}
	
	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescriptionArticle() {
		return descriptionArticle;
	}

	public void setDescriptionArticle(String descriptionArticle) {
		this.descriptionArticle = descriptionArticle;
	}
	
	public LocalDate getDebutEncheres() {
		return debutEncheres;
	}

	public void setDebutEncheres(LocalDate debutEncheres) {
		this.debutEncheres = debutEncheres;
	}

	public int getPrixInitial() {
		return prixInitial;
	}

	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}

	public Users getUsers() {
		return user;
	}

	public void setUsers(Users user) {
		this.user = user;
	}

	public Categories getCategorie() {
		return categorie;
	}

	public void setCategorie(Categories categorie) {
		this.categorie = categorie;
	}

	public LocalDate getFinEncheres() {
		return finEncheres;
	}

	public int getPrixDeLaVente() {
		return prixDeLaVente;
	}
	
}
