/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrecaGrupaZadatak9;

/**
 *
 * @author Jana Jovanovic
 */
public abstract class GeometrijskoTelo {
    
    protected double povrisna;
    protected double zapremina;
    
    public abstract void izracunajPovrsinu ();
    public abstract void izracunajZapreminu ();

    public double getPovrisna() {
        izracunajPovrsinu();
        return povrisna;
    }

    public double getZapremina() {
        izracunajZapreminu();
        return zapremina;
    }
    
    
    
    
    
    
}
