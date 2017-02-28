package it.uiip.digitalgarage.roboadvice.logic.model;

/**
 * Created by Luca on 28/02/2017.
 */
public class Portfolio {
    private Long id;
    private Long idUser;
    private Long id_strategy;
    private Long idAsset;
    private double units;
    private double value;
    private String date;

    public Portfolio(Long id, Long idUser, Long id_strategy, Long idAsset, double units, double value, String date) {
        this.id = id;
        this.idUser = idUser;
        this.id_strategy = id_strategy;
        this.idAsset = idAsset;
        this.units = units;
        this.value = value;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getId_strategy() {
        return id_strategy;
    }

    public void setId_strategy(Long id_strategy) {
        this.id_strategy = id_strategy;
    }

    public Long getIdAsset() {
        return idAsset;
    }

    public void setIdAsset(Long idAsset) {
        this.idAsset = idAsset;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
