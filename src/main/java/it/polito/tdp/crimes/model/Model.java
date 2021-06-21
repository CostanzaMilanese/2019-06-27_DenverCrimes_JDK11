package it.polito.tdp.crimes.model;

import java.util.List;

import it.polito.tdp.crimes.db.EventsDAO;

public class Model {
	
	EventsDAO dao = new EventsDAO();

	
	public List<String> getAllCategories(){
		return dao.listAllCategories();
	}
	public List<Integer> getAllYears(){
		return dao.listAllYears();
	}

	
}
