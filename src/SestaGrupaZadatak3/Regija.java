/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SestaGrupaZadatak3;

import java.io.Serializable;

/**
 *
 * @author Jana Jovanovic
 */
public class Regija implements Serializable{
    private String naziv;
    private int natalitet;
    private int mortalitet;
    private int migracioniSaldo;
    

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        if (naziv != null && naziv.length() > 2)
            this.naziv = naziv;
        else
            throw new DemografijaException("Greska! Uneli ste nedozvoljenu vrednost");
    }

    public int getNatalitet() {
        return natalitet;
    }
    public void setNatalitet(int natalitet) {
        if (natalitet > 0)
            this.natalitet = natalitet;
        else
            throw new DemografijaException("Greska! Uneli ste nedozvoljenu vrednost");
    }

    public int getMortalitet() {
        return mortalitet;
    }
    public void setMortalitet(int mortalitet) {
        if (mortalitet > 0)
            this.mortalitet = mortalitet;
        else
            throw new DemografijaException("Greska! Uneli ste nedozvoljenu vrednost");
    }

    public int getMigracioniSaldo() {
        return migracioniSaldo;
    }
    public void setMigracioniSaldo(int migracioniSaldo) {
        this.migracioniSaldo = migracioniSaldo;
    }
    
    public int getPromena(){
        return natalitet - mortalitet + migracioniSaldo;
    }

    @Override
    public String toString() {
        return "NAZIV opstine: "+ naziv + " NATALITET: " + natalitet + " MORTALITET: " + mortalitet + " MIGRACIONI SALDO: " + migracioniSaldo + " PROMENA: " + getPromena();
    }        
}
