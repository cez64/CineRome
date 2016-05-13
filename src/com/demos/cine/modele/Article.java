package com.demos.cine.modele;

public class Article {
	private int i;
	private String reference;
	private double prixHT;
	private String designation;
	private int qteStock;
	private boolean dematerialise;
	
	public Article(String reference, double prixHT, String designation, int qteStock) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = qteStock;
		this.dematerialise = false;
	}
	
	//objets dématérialisés
	public Article(String reference, double prixHT, String designation) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = 0;
		this.dematerialise = true;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void incrementeStock(int qte){
		this.qteStock = this.qteStock + qte;	
	}
	
	public void decrementeStock(int qte){
		this.qteStock = this.qteStock - qte;
	}

	@Override
	public String toString() {
		String description = "";
		if (!isDematerialise()){
			description = 
			"reference=" + reference + 
			", prixHT=" + prixHT + 
			", designation=" + designation + 
			", qteStock=" + qteStock + "]";
		}else{
			description = 
			"reference=" + reference + 
			", prixHT=" + prixHT + 
			", designation=" + designation + 
			", objet dématérialisé";
		}
		return description;	
	}

	public boolean isDematerialise() {
		return dematerialise;
	}

	public void setDematerialise(boolean dematerialise) {
		this.dematerialise = dematerialise;
	}
	
	
	
}
