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
public class Kategorie implements Serializable{
    
    @Id
    private Long Slug;
    
    private String Name;
    
    //Getter
    public Long getSlug() {
        return Slug;
    }

    public String getName() {
        return Name;
    }
    
    
    //Setter
    public void setSlug(Long Slug) {
        this.Slug = Slug;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
            
    
}
