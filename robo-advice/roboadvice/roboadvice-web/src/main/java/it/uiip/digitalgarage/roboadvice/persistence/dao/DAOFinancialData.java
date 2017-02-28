package it.uiip.digitalgarage.roboadvice.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.uiip.digitalgarage.roboadvice.logic.model.FinancialData;
import it.uiip.digitalgarage.roboadvice.persistence.idao.IDAOFinancialData;
import it.uiip.digitalgarage.roboadvice.persistence.model.DAOException;
import it.uiip.digitalgarage.roboadvice.persistence.util.DataSource;

public class DAOFinancialData implements IDAOFinancialData {
	
	private static final String INSERT_FINANCIAL_DATA = "INSERT INTO financial_data(id_asset, value, date) VALUES(?, ?, ?);";
	private static final String CHECK_FINANCIAL_DATA = "SELECT * FROM financial_data WHERE id_asset = ? AND date = ?;";
	
	@Override
	public void insertFinancialData(FinancialData financialData) throws DAOException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DataSource.getConnection();
			preparedStatement = connection.prepareStatement(INSERT_FINANCIAL_DATA);
			preparedStatement.setLong(1, financialData.getIdAsset());
			preparedStatement.setBigDecimal(2, financialData.getValue());
			preparedStatement.setString(3, financialData.getDate());
			if(this.checkFinancialData(financialData)) {
				preparedStatement.executeUpdate();
				System.out.println("Aggiunto");
			} else {
				System.out.println("Già presente");
			}
		} catch(SQLException e) {
			throw new DAOException(e);
		} finally {
			DataSource.close(connection);
			DataSource.close(preparedStatement);
		}
	}
	
	private boolean checkFinancialData(FinancialData financialData) throws DAOException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DataSource.getConnection();
			preparedStatement = connection.prepareStatement(CHECK_FINANCIAL_DATA);
			preparedStatement.setLong(1, financialData.getIdAsset());
			preparedStatement.setString(2, financialData.getDate());
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return false;
			}
			return true;
		} catch(SQLException e) {
			throw new DAOException(e);
		} finally {
			DataSource.close(connection);
			DataSource.close(preparedStatement);
			DataSource.close(resultSet);
		}
	}

}
