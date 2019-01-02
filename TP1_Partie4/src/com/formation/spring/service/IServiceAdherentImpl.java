package com.formation.spring.service;

import java.util.Collection;

import com.formation.spring.dao.IDaoAdherent;
import com.formation.spring.modele.Adherent;

public class IServiceAdherentImpl implements IServiceAdherent{
	private IDaoAdherent dao;

	@Override
	public void initAdherent() {
		// TODO Auto-generated method stub
		dao.initAdherent();
	}

	public IServiceAdherentImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Adherent> getAllAdherent() {
		// TODO Auto-generated method stub
		return dao.getAllAdherent();
	}

	@Override
	public String toString() {
		return "IServiceAdherentImpl [dao=" + dao + "]";
	}

	public IDaoAdherent getDao() {
		return dao;
	}

	public void setDao(IDaoAdherent dao) {
		this.dao = dao;
	}
	
	
	
	
}
