package it.uiip.digitalgarage.roboadvice.logic.model;

/**
 * Created by Luca on 28/02/2017.
 */
public class CustomStrategy {

    private Long id;
    private Long idUser;
    private double bonds;
    private double stocks;
    private double forex;
    private double commodities;
    private boolean active;
    private String timestamp;

    public CustomStrategy(Long id,Long idUser, double bonds, double stocks, double forex, double commodities, boolean active, String timestamp) {
        this.idUser = idUser;
        this.bonds = bonds;
        this.stocks = stocks;
        this.forex = forex;
        this.commodities = commodities;
        this.active = active;
        this.timestamp = timestamp;
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

    public double getBonds() {
        return bonds;
    }

    public void setBonds(double bonds) {
        this.bonds = bonds;
    }

    public double getStocks() {
        return stocks;
    }

    public void setStocks(double stocks) {
        this.stocks = stocks;
    }

    public double getForex() {
        return forex;
    }

    public void setForex(double forex) {
        this.forex = forex;
    }

    public double getCommodities() {
        return commodities;
    }

    public void setCommodities(double commodities) {
        this.commodities = commodities;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
