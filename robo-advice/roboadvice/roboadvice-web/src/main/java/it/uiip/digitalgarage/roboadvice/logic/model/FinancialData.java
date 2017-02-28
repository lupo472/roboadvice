package it.uiip.digitalgarage.roboadvice.logic.model;

import java.math.BigDecimal;

public class FinancialData {

    private Long id;
    private Long idAsset;
    private BigDecimal value;
    private String timestamp;

    public FinancialData(Long id, Long idAsset, BigDecimal value, String timestamp) {
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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
