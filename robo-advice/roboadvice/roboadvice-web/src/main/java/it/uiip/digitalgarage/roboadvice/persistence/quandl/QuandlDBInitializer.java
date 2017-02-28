package it.uiip.digitalgarage.roboadvice.persistence.quandl;

import java.util.List;

import org.threeten.bp.LocalDate;

import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.QuandlSession;
import com.jimmoores.quandl.TabularResult;

import it.uiip.digitalgarage.roboadvice.logic.model.Asset;
import it.uiip.digitalgarage.roboadvice.persistence.dao.DAOAsset;
import it.uiip.digitalgarage.roboadvice.persistence.model.DAOException;

public class QuandlDBInitializer {
	
	public void getData(Asset asset) {
		QuandlSession session = QuandlSession.create();

		TabularResult tabularResult = session.getDataSet(
				DataSetRequest.Builder.of(asset.getDataSource())
				.withStartDate(LocalDate.of(2007, 01, 01))
				.withColumn(asset.getRemarksIndex())
				.build());
				
		System.out.println(tabularResult.toPrettyPrintedString());
	}
	
	public static void main(String[] args) {
		List<Asset> assets;
		try {
			assets = new DAOAsset().getAssets();
			for(Asset asset : assets) {
				new QuandlDBInitializer().getData(asset);
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
