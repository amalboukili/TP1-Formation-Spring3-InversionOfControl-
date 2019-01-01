package com.formation.spring;

public class ResponsableRayon {
	private String nom, garde;
	private String rayon;

	public ResponsableRayon(String nom, String garde, String rayon) {
		super();
		this.nom = nom;
		this.garde = garde;
		this.rayon = rayon;
	}

	public ResponsableRayon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResponsableRayon [nom=" + nom + ", garde=" + garde + ", rayon=" + rayon + "]";
	}
	
	public void init(){
		System.out.println("init responsableRayon ["+this.toString()+ "]");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGarde() {
		return garde;
	}

	public void setGarde(String garde) {
		this.garde = garde;
	}

	public String getRayon() {
		return rayon;
	}

	public void setRayon(String rayon) {
		this.rayon = rayon;
	}
	

}
