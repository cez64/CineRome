package com.demos.cine.modele;

import java.util.ArrayList;

public class Panier {
	private ArrayList<LignePanier> contenu = new ArrayList<LignePanier>();

	public Panier() {
		super();
	}
	
	public double getPrixTotalHT(){
		double prixTotalHT = 0;
		for (int i = 0; i < contenu.size(); i++){
			prixTotalHT = prixTotalHT + (contenu.get(i).getArticle().getPrixHT() * contenu.get(i).getQte());
		}
		return prixTotalHT;
	}
	
	public int getNbElements(){
		/*int nbElements = 0;
		for (int i = 0; i <= contenu.size(); i++){
			nbElements = nbElements + contenu.get(i).getQte();
		}*/
		return contenu.size();
	}
	
	public void ajouter(Article article, int qte){
		LignePanier lignePanier = new LignePanier(article, qte);
		contenu.add(lignePanier);
	}

	public String toString() {
		String description = "";
		for (LignePanier lp : contenu){
			description += lp.getArticle().getDesignation()+" --> reference de l'article : "
			+lp.getArticle().getReference()+"; quantite commandee : "+lp.getQte()+"\n";
		}	
		return description;
	}

}
