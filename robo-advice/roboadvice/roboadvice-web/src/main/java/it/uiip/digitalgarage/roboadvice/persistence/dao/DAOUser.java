package it.uiip.digitalgarage.roboadvice.persistence.dao;

import org.springframework.stereotype.Component;

import it.uiip.digitalgarage.roboadvice.model.User;
import it.uiip.digitalgarage.roboadvice.persistence.DAOException;
import it.uiip.digitalgarage.roboadvice.persistence.idao.IDAOUser;

@Component
public class DAOUser implements IDAOUser {

	@Override
	public User loginUser(User user) throws DAOException {
		return user;
	}

}
