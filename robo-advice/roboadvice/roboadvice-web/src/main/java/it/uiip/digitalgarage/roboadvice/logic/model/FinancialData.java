package it.uiip.digitalgarage.roboadvice.logic.model;

/**
 * Created by Luca on 28/02/2017.
 */
public class FinancialData {

    private Long id;
    private Long idAsset;
    private double value;
    private String timestamp;

    public FinancialData(Long id, Long idAsset, double value, String timestamp) {
        this.id = id;
        this.idAsset = idAsset;
        this.value = value;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdAsset() {
        return idAsset;
    }

    public void setIdAsset(Long idAsset) {
        this.idAsset = idAsset;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
