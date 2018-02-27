package jpa;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mschwandt
 */

@Entity
public class Anzeige implements Serializable{

    @Id
    private Long id;
    
    private String Angebot;
    private String Titel;
    private String Beschreibung;
    private Date Datum;
    private Date OnlineBis;
    private long Preisvorstellung;
    private String ArtDesPreises;
    private long Postleitzahl;
    private String Ort;

    
    //Getter
    public Long getId() {
        return id;
    }
    
    public String getAngebot() {
        return Angebot;
    }

    public String getTitel() {
        return Titel;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public Date getDatum() {
        return Datum;
    }

    public Date getOnlineBis() {
        return OnlineBis;
    }

    public long getPreisvorstellung() {
        return Preisvorstellung;
    }

    public String getArtDesPreises() {
        return ArtDesPreises;
    }

    public long getPostleitzahl() {
        return Postleitzahl;
    }

    public String getOrt() {
        return Ort;
    }
    
    
    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setAngebot(String Angebot) {
        this.Angebot = Angebot;
    }

    public void setTitel(String Titel) {
        this.Titel = Titel;
    }

    public void setBeschreibung(String Beschreibung) {
        this.Beschreibung = Beschreibung;
    }

    public void setDatum(Date Datum) {
        this.Datum = Datum;
    }

    public void setOnlineBis(Date OnlineBis) {
        this.OnlineBis = OnlineBis;
    }

    public void setPreisvorstellung(long Preisvorstellung) {
        this.Preisvorstellung = Preisvorstellung;
    }

    public void setArtDesPreises(String ArtDesPreises) {
        this.ArtDesPreises = ArtDesPreises;
    }

    public void setPostleitzahl(long Postleitzahl) {
        this.Postleitzahl = Postleitzahl;
    }

    public void setOrt(String Ort) {
        this.Ort = Ort;
    }
    
}
