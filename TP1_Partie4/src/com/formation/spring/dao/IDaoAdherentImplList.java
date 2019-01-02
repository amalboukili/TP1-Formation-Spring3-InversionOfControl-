package com.formation.spring.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.formation.spring.modele.Adherent;

public class IDaoAdherentImplList implements IDaoAdherent {
	
	private ArrayList<Adherent> liste= new ArrayList<Adherent>();
	
	@Override
	public void initAdherent() {
		Adherent a1 = new Adherent("C100","Mohammed","Ali","Rabat");
		Adherent a2= new Adherent("C200","Hari","Badr","Casablanca");
		liste.add(a1);
		liste.add(a2);
	}

	@Override
	public Collection<Adherent> getAllAdherent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "IDaoAdherentImplList [liste=" + liste + " et taille "+liste.size()+"]";
	}
	
		
}
