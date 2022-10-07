package com.esprit.microservice.job;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Job implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private Boolean etat;


    public Job() {
        super();
    }

    public Job(String nom, Boolean etat) {
        super();
        this.nom = nom;
        this.etat = etat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public Boolean getEtat() {
        return etat;
    }
}
