package com.demos.cine.modele;

public class Article {
	private String reference;
	private double prixHT;
	private String designation;
	private int qteStock;
	
	public Article(String reference, double prixHT, String designation, int qteStock) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = qteStock;
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
		return "Article [reference=" + reference + ", prixHT=" + prixHT + ", designation=" + designation + ", qteStock="
				+ qteStock + "]";
	}
	
}
