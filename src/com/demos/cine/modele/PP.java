package com.demos.cine.modele;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article article1 = new Article("ref1", 11.1, "designation1", 100);
		Article article2 = new Article("ref2", 22.2, "designation2", 200);
		
		Panier panier1 = new Panier();
		panier1.ajouter(article1, 5);
		panier1.ajouter(article2, 8);
		System.out.println("nombre d'éléments dans le panier : "+panier1.getNbElements());
		System.out.println("prix total HT du panier : "+panier1.getPrixTotalHT());
		//System.out.println(""+panier1.toString());
		System.out.println(panier1);
	}

}
