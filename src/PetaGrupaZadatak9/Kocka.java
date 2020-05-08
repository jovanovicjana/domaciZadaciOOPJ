/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetaGrupaZadatak9;

/**
 *
 * @author Jana Jovanovic
 */
public class Kocka extends GeometrijskoTelo{

    private double duzinaStranice;
    
    @Override
    public void izracunajPovrsinu() {
        povrisna = duzinaStranice*duzinaStranice*6;
    }

    @Override
    public void izracunajZapreminu() {
        zapremina = duzinaStranice*duzinaStranice*duzinaStranice;
    }

    public double getDuzinaStranice() {
        return duzinaStranice;
    }
    public void setDuzinaStranice(double duzinaStranice) {
        if (duzinaStranice > 0)
            this.duzinaStranice = duzinaStranice;
        else
            throw new GeometrijskoTeloException("Greska! uneli ste nedozvoljenu vrednost.");
    }
    
    
    
    
    
}
