/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrecaGrupaZadatak1;

import java.security.spec.PSSParameterSpec;

/**
 *
 * @author Jana Jovanovic
 */
public class Proizvod {
    
    private String naziv;
    private float cena;

    public Proizvod() {
        this.naziv = "nepoznat";
        this.cena = 0.0f;
    }

    public Proizvod(String naziv, float cena) {
        
        setCena(cena);
        setNaziv(naziv);
        
       /* if (naziv != null && cena > 0.0f){
            
        this.naziv = naziv;
        this.cena = cena;
        } else {
            
            System.out.println("Greska! Uneti parametri nisu validni.");
            
            this.naziv = "nepoznat";
            this.cena = 0.0f;
        }
        */
        
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        
        if (naziv == null){
            
             System.out.println("Greska! Vrednost za naziv je nedozvoljena.");
             
             this.naziv = "nepoznat";
            
        } else {
            
            this.naziv = naziv;
        }
    }

    public float getCena() {
        return cena;
    }
    public void setCena(float cena) {
        
        if (cena < 0.0f){
            
             System.out.println("Greska! Vrednost za cenu mora biti veca od 0");
             
             this.cena = 0.0f;
            
        } else {
            
            this.cena = cena;
        }
    }
    
    
    
    
    
    
}
