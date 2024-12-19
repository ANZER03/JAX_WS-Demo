package ws;

import java.util.Date;

public class Compte {

    private int id;
    private double solde;
    private Date date;


    public Compte() {

    }

    public Compte(int id, Date date, double solde) {
        this.id = id;
        this.date = date;
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public Double getSolde() {
        return solde;
    }

    public Integer getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }
}

