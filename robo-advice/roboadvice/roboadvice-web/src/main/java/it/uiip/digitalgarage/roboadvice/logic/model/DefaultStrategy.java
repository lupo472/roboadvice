package it.uiip.digitalgarage.roboadvice.logic.model;

/**
 * Created by Luca on 28/02/2017.
 */
public class DefaultStrategy {
    private Long id;
    private String name;
    private double bonds;
    private double stoks;
    private double forex;
    private double commodities;

    public DefaultStrategy(Long id, String name, double bonds, double stoks, double forex, double commodities) {
        this.id = id;
        this.name = name;
        this.bonds = bonds;
        this.stoks = stoks;
        this.forex = forex;
        this.commodities = commodities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBonds() {
        return bonds;
    }

    public void setBonds(double bonds) {
        this.bonds = bonds;
    }

    public double getStoks() {
        return stoks;
    }

    public void setStoks(double stoks) {
        this.stoks = stoks;
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
}
