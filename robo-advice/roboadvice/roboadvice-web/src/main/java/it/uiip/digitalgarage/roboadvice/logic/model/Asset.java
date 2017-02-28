package it.uiip.digitalgarage.roboadvice.logic.model;

public class Asset {
	
	private Long id;
	private String dataSource;
	private int remarksIndex;
	
	public Asset(Long id, String dataSource, int remarksIndex) {
		this.id = id;
		this.dataSource = dataSource;
		this.remarksIndex = remarksIndex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public int getRemarksIndex() {
		return remarksIndex;
	}

	public void setRemarksIndex(int remarksIndex) {
		this.remarksIndex = remarksIndex;
	}

}
