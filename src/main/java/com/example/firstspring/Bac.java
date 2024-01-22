package com.example.firstspring;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Bac {

    private Integer Code_Wilaya;
    private String Wilaya;
    private String Centre;
    private String SERIE;
    private Integer Numero_Bac;
    private String Nom;
    private String Lieu_Naissance;
    private BigDecimal Moyenne;
    private String Decision;
    private Date Date_Naissance;

    public Bac() {
    }

    public Bac(Integer code_Wilaya, String wilaya, String centre, String SERIE, Integer numero_Bac, String nom, String lieu_Naissance, BigDecimal moyenne, String decision, Date date_Naissance) {
        Code_Wilaya = code_Wilaya;
        Wilaya = wilaya;
        Centre = centre;
        this.SERIE = SERIE;
        Numero_Bac = numero_Bac;
        Nom = nom;
        Lieu_Naissance = lieu_Naissance;
        Moyenne = moyenne;
        Decision = decision;
        Date_Naissance = date_Naissance;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Numero_Bac")
    public Integer getId() {
        return Numero_Bac;
    }
    public void setId(Integer id) {
        this.Numero_Bac = id;
    }
    public Integer getCode_Wilaya() {
        return Code_Wilaya;
    }

    public void setCode_Wilaya(Integer code_Wilaya) {
        Code_Wilaya = code_Wilaya;
    }

    public String getWilaya() {
        return Wilaya;
    }

    public void setWilaya(String wilaya) {
        Wilaya = wilaya;
    }

    public String getCentre() {
        return Centre;
    }

    public void setCentre(String centre) {
        Centre = centre;
    }

    public String getSERIE() {
        return SERIE;
    }

    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }



    public void setNumero_Bac(Integer numero_Bac) {
        Numero_Bac = numero_Bac;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getLieu_Naissance() {
        return Lieu_Naissance;
    }

    public void setLieu_Naissance(String lieu_Naissance) {
        Lieu_Naissance = lieu_Naissance;
    }

    public BigDecimal getMoyenne() {
        return Moyenne;
    }

    public void setMoyenne(BigDecimal moyenne) {
        Moyenne = moyenne;
    }

    public String getDecision() {
        return Decision;
    }

    public void setDecision(String decision) {
        Decision = decision;
    }

    public Date getDate_Naissance() {
        return Date_Naissance;
    }

    public void setDate_Naissance(Date date_Naissance) {
        Date_Naissance = date_Naissance;
    }
}
