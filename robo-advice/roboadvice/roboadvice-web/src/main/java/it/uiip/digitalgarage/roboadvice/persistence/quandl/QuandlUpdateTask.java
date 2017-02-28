package it.uiip.digitalgarage.roboadvice.persistence.quandl;


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Component;
import org.threeten.bp.LocalDate;

import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.QuandlSession;
import com.jimmoores.quandl.Row;
import com.jimmoores.quandl.TabularResult;

import it.uiip.digitalgarage.roboadvice.logic.model.Asset;
import it.uiip.digitalgarage.roboadvice.logic.model.FinancialData;
import it.uiip.digitalgarage.roboadvice.persistence.dao.DAOAsset;
import it.uiip.digitalgarage.roboadvice.persistence.dao.DAOFinancialData;
import it.uiip.digitalgarage.roboadvice.persistence.model.DAOException;

@Component
public class QuandlUpdateTask {

	public void update(Asset asset) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -5);
				
		QuandlSession session = QuandlSession.create();

		TabularResult tabularResult = session.getDataSet(
				DataSetRequest.Builder.of(asset.getDataSource())
				.withStartDate(LocalDate.of(calendar.get(Calendar.YEAR), (calendar.get(Calendar.MONTH) + 1), calendar.get(Calendar.DAY_OF_MONTH)))
				.withColumn(asset.getRemarksIndex())
				.build());
		
		for(int i = 0; i < tabularResult.size(); i++) {
			Row row = tabularResult.get(i);
			Double value = row.getDouble(1);
			BigDecimal valueDecimal = new BigDecimal(value);
			String date = row.getString(0);
			FinancialData financialData = new FinancialData(asset.getId(), valueDecimal, date);
			try {
				new DAOFinancialData().insertFinancialData(financialData);
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		List<Asset> assets;
		try {
			assets = new DAOAsset().getAssets();
			System.out.println("Calendario " + GregorianCalendar.getInstance().get(Calendar.DAY_OF_MONTH));
			for(Asset asset : assets) {
				new QuandlUpdateTask().update(asset);
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
