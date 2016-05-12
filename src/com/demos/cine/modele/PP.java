package com.demos.cine.modele;

public class PP {

	public static void main(String[] args) {
		Panier panier1 = new Panier();
		// TODO Auto-generated method stub
		try{
		Article article1 = new Article("ref1", new Prix(11.1), "designation1", 100);
		panier1.ajouter(article1, 5);
		}
		catch(Exception e){
			System.out.println("article non créé car prix < 0");
		}
		
		try{
		Article article2 = new Article("ref2", new Prix(22.2), "designation2", 200);
		panier1.ajouter(article2, 8);
		}
		catch(Exception e){
			System.out.println("article non créé car prix < 0");
		}
		
		System.out.println("nombre d'éléments dans le panier : "+panier1.getNbElements());
		System.out.println("prix total HT du panier : "+panier1.getPrixTotalHT());
		//System.out.println(""+panier1.toString());
		System.out.println(panier1);
	}

}
