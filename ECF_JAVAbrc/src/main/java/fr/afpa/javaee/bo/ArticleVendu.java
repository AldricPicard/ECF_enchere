package fr.afpa.javaee.bo;

import java.time.LocalDate;

public class ArticleVendu {
	private int idArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private int prixInitial;
	private int prixVente;
	
	//Constructeur Article Vendu
	public ArticleVendu(int idArticle,String nomArticle,String description,LocalDate dateDebutEncheres,LocalDate dateFinEncheres,int prixInitial,int prixVente) {
		this.idArticle = idArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		
	}
	
	// getter et setter
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public String getNom_article() {
		return nomArticle;
	}
	public void setNom_article(String nom_article) {
		this.nomArticle = nom_article;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateDebutEnchères() {
		return dateDebutEncheres;
	}
	public void setDateDebutEnchères(LocalDate dateDebutEnchères) {
		this.dateDebutEncheres = dateDebutEnchères;
	}
	public LocalDate dateFinEncheres() {
		return dateFinEncheres;
	}
	public void setDatefinEnchères(LocalDate datefinEnchères) {
		this.dateFinEncheres = datefinEnchères;
	}
	public int getPrixInitial() {
		return prixInitial;
	}
	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}
	public int getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}
	
	
	
	
}
