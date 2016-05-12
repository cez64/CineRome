package com.demos.cine.modele;

public class Prix {
	private double valeur;
	public Prix(double p) throws Exception{
		//on ne cr�e pas un objet prix negatif
		if(p<0){
			throw new Exception("prix negatif");
		}
		valeur = p;
	}
	
	public double getPrix(){
		return valeur;
	}
	
	public void setPrix(double p) throws Exception{
		//on ne cr�e pas un objet prix negatif
		if(p<0){
			throw new Exception("prix negatif");
		}
		valeur = p;
	}

}
