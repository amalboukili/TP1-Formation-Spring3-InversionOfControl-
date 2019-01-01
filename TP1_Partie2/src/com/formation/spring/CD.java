package com.formation.spring;

public class CD implements IMedia{
	private String duree;

	public CD() {
		super();
	}
	public CD(String duree) {
		super();
		this.duree = duree;
	}

	@Override
	public void processusPret() {
		System.out.println("Traitement du pret d'un cv "+this.toString());
	}
	public String toString() {
		return "CD [duree = " +duree+ "]";
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}
	
}
