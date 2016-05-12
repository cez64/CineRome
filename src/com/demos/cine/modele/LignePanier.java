package com.demos.cine.modele;

public class LignePanier {
	private Article article;
	private int qte;
	public LignePanier(Article article, int qte) {
		super();
		this.article = article;
		this.qte = qte;
	}
	
	public Article getArticle() {
		return article;
	}

	public int getQte() {
		return qte;
	}

}
