/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pravna_lica.prodaja;


import java.util.GregorianCalendar;
import pravna_lica.Preduzece;
import pravna_lica.ExceptionNedozvoljenaVrednost;
import java.util.TimeZone;

/**
 *
 * @author Jana Jovanovic
 */
public class Racun {
    private GregorianCalendar datum;
    private double iznos;
    private Preduzece preduzece;

    public GregorianCalendar getDatum() {
        return datum;
    }
    public void setDatum(GregorianCalendar datum) {
        if (datum != null)
            this.datum = datum;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }

    public double getIznos() {
        return iznos;
    }
    public void setIznos(double iznos) {
        if (iznos > 0)
            this.iznos = iznos;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");

    }

    public Preduzece getPreduzece() {
        return preduzece;
    }
    public void setPreduzece(Preduzece preduzece) {
        if (preduzece != null)
            this.preduzece = preduzece;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }

    @Override
    public String toString() {
        int godina = datum.get(GregorianCalendar.YEAR);
        int mesec = datum.get(GregorianCalendar.MONTH) + 1;
        int dan = datum.get(GregorianCalendar.DAY_OF_MONTH);
       
        return dan + " - " + mesec + " - " + godina + " - " + preduzece.getPIB() + " - " + preduzece.getNaziv() + " - " + preduzece.getAdresa() + " - " + preduzece.getTelefon() + " - " + iznos;
    }
    
    
    
    
}
