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
public class Kvadar extends GeometrijskoTelo{
    private double duzina;
    private double sirina;
    private double visina;
    
    @Override
    public void izracunajPovrsinu() {
        povrisna = 2*(duzina*sirina) + 2*(duzina*visina) + 2*(sirina*visina);
    }

    @Override
    public void izracunajZapreminu() {
        zapremina = duzina*sirina*visina;
    }

    public double getDuzina() {
        return duzina;
    }
    public void setDuzina(double duzina) {
        if (duzina > 0)
            this.duzina = duzina;
        else
            throw new GeometrijskoTeloException("Greska! Duzina strani mora biti veca od nule.");
    }

    public double getSirina() {
        return sirina;
    }
    public void setSirina(double sirina) {
        if (sirina > 0)
            this.sirina = sirina;
        else
            throw new GeometrijskoTeloException("Greska! Sirina strani mora biti veca od nule.");
    }

    public double getVisina() {
        return visina;
    }
    public void setVisina(double visina) {
        if (visina > 0)
            this.visina = visina;
        else
            throw new GeometrijskoTeloException("Greska!Visina mora biti veca od nule.");
    }


    
    
}
