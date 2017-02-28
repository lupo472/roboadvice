package it.uiip.digitalgarage.roboadvice.logic.model;

import java.math.BigDecimal;

/**
 * Created by Luca on 28/02/2017.
 */
public class DefaultStrategy {
    private Long id;
    private String name;
    private BigDecimal bonds;
    private BigDecimal stoks;
    private BigDecimal forex;
    private BigDecimal commodities;

    public DefaultStrategy(Long id, String name, BigDecimal bonds, BigDecimal stoks, BigDecimal forex, BigDecimal commodities) {
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

    public BigDecimal getBonds() {
        return bonds;
    }

    public void setBonds(BigDecimal bonds) {
        this.bonds = bonds;
    }

    public BigDecimal getStoks() {
        return stoks;
    }

    public void setStoks(BigDecimal stoks) {
        this.stoks = stoks;
    }

    public BigDecimal getForex() {
        return forex;
    }

    public void setForex(BigDecimal forex) {
        this.forex = forex;
    }

    public BigDecimal getCommodities() {
        return commodities;
    }

    public void setCommodities(BigDecimal commodities) {
        this.commodities = commodities;
    }
}
