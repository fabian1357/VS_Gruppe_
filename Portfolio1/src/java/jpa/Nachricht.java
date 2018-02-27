package jpa;


import java.io.Serializable;
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
public class Nachricht implements Serializable{
    
    @Id
    private Long id;
    
    private String VonBenutzer;
    private String AnBenutzer;
    private String ZuArtikel;
    private String Text;
    
    
    //Getter
    public Long getId() {
        return id;
    }

    public String getVonBenutzer() {
        return VonBenutzer;
    }

    public String getAnBenutzer() {
        return AnBenutzer;
    }

    public String getZuArtikel() {
        return ZuArtikel;
    }

    public String getText() {
        return Text;
    }
    
    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setVonBenutzer(String VonBenutzer) {
        this.VonBenutzer = VonBenutzer;
    }

    public void setAnBenutzer(String AnBenutzer) {
        this.AnBenutzer = AnBenutzer;
    }

    public void setZuArtikel(String ZuArtikel) {
        this.ZuArtikel = ZuArtikel;
    }

    public void setText(String Text) {
        this.Text = Text;
    }
    
    
}
