package it.uiip.digitalgarage.roboadvice.persistence.quandl;

import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.QuandlSession;
import com.jimmoores.quandl.TabularResult;

public class QuandlExample {
	
	public void example() {
		QuandlSession session = QuandlSession.create();
		TabularResult tabularResult = session.getDataSet(DataSetRequest.Builder.of("WIKI/AAPL").build());
		System.out.println(tabularResult.toPrettyPrintedString());
	}

}
