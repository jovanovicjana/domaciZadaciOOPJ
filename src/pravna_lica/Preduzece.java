/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pravna_lica;

import java.util.GregorianCalendar;

/**
 *
 * @author Jana Jovanovic
 */
public class Preduzece {
    private int PIB;
    private String naziv;
    private int telefon;
    private String adresa;

    public int getPIB() {
        return PIB;
    }
    public void setPIB(int PIB) {
        if (PIB > 0)
            this.PIB = PIB;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        if (naziv != null && naziv != "")
            this.naziv = naziv;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }

    public int getTelefon() {
        return telefon;
    }
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        if (adresa != null && adresa != "")
            this.adresa = adresa;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }
    
    
    
}
