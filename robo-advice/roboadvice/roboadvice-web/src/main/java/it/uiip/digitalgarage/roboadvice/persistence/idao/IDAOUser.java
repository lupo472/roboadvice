package it.uiip.digitalgarage.roboadvice.persistence.idao;

import it.uiip.digitalgarage.roboadvice.logic.model.User;
import it.uiip.digitalgarage.roboadvice.persistence.model.DAOException;

public interface IDAOUser {
	
	public User loginUser(User user) throws DAOException;
	
}
