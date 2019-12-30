package ua.nure.kn.kutsenko.agent;

import ua.nure.kn.kutsenko.db.DataBaseException;

public class SearchExeption {

	public SearchException(DataBaseException e) {
		e.printStackTrace();
	}
}
