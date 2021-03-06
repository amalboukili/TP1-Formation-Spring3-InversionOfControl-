package com.formation.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.formation.spring.modele.Adherent;
import com.formation.spring.utils.connexionBD;

public class IDaoAdherentImplBD implements IDaoAdherent{
	private ConnexionBD bd = new connexionBD();
	private ArrayList<Adherent> liste=new ArrayList<Adherent>();
	
	@Override
	public void initAdherent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Collection<Adherent> getAllAdherent(){
		ResultSet result=bd.Select("select * from adherent");
		Adherent a1;
		try {
			while (result.next()) {
				a1= new Adherent();
				a1.setCodeAdherent(result.getString("code"));
				a1.setNom(result.getString("nom"));
				a1.setPrenom(result.getString("prenom"));
				a1.setAdresse(result.getString("adresse"));
				liste.add(a1);
			}
			bd.DisConnect();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return liste;
	}

}
