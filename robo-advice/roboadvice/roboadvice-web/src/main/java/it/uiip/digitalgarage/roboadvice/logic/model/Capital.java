package it.uiip.digitalgarage.roboadvice.logic.model;

import java.math.BigDecimal;

/**
 * Created by Luca on 28/02/2017.
 */
public class Capital {

    private Long id;
    private Long idUser;
    private BigDecimal amount;
    private String date;

    public Capital(Long id, Long idUser, BigDecimal amount, String date) {
        this.id = id;
        this.idUser = idUser;
        this.amount = amount;
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


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
