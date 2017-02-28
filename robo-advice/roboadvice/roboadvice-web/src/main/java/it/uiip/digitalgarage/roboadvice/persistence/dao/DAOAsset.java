package it.uiip.digitalgarage.roboadvice.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.uiip.digitalgarage.roboadvice.logic.model.Asset;
import it.uiip.digitalgarage.roboadvice.persistence.idao.IDAOAsset;
import it.uiip.digitalgarage.roboadvice.persistence.model.DAOException;
import it.uiip.digitalgarage.roboadvice.persistence.util.DataSource;

public class DAOAsset implements IDAOAsset {

	private static final String GET_ASSETS = "SELECT * FROM roboadvice.asset;";
	
	//TODO Modify this method to get the complete asset
	@Override
	public List<Asset> getAssets() throws DAOException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Asset> assets = new ArrayList<>();
		try {
			connection = DataSource.getConnection();
			preparedStatement = connection.prepareStatement(GET_ASSETS);
			resultSet = preparedStatement.executeQuery();
			System.out.println("aa");
			while(resultSet.next()) {
				Long id = resultSet.getLong("id");
				this.getAssets().add(new Asset(id));
				System.out.println("Ciao");
			}
			return assets;
		} catch(SQLException e) {
			throw new DAOException(e);
		} finally {
			DataSource.close(connection);
			DataSource.close(preparedStatement);
			DataSource.close(resultSet);
		}
	}
	
	public static void main(String[] args) {
		try {
			List<Asset> assets = new DAOAsset().getAssets();
			
//			for(Asset asset: assets) {
//				System.out.println("id: " + asset.getId());
//			}
		} catch (DAOException e) {
			e.getLocalizedMessage();
		}
	}

}
