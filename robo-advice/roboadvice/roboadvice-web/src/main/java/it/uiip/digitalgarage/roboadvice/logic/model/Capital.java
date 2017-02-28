package it.uiip.digitalgarage.roboadvice.logic.model;

/**
 * Created by Luca on 28/02/2017.
 */
public class Capital {

    private Long id;
    private Long idUser;
    private double amount;
    private String date;

    public Capital(Long id, Long idUser, double amount, String date) {
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
