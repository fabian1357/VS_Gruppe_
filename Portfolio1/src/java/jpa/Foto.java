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
public class Foto implements Serializable{
    
    @Id
    private Long id;
    
    private String Bezeichnung;

    
    //Getter
    public Long getId() {
        return id;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    
    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setBezeichnung(String Bezeichnung) {
        this.Bezeichnung = Bezeichnung;
    }
    
    
    
}
