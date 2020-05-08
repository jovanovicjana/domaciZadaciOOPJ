 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodostaj.reka;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jana Jovanovic
 */
public class Reka  implements Serializable{

    private String naziv = null;
    private GregorianCalendar datumMerenja;
    private double vodostaj = -1;

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        if (naziv != null && naziv.length() > 2)
            this.naziv = naziv;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }

    public GregorianCalendar getDatumMerenja() {
        return datumMerenja;
    }
    public void setDatumMerenja(GregorianCalendar datumMerenja) {
        Calendar now = new GregorianCalendar();
        if (datumMerenja != null && now.after(datumMerenja))
            this.datumMerenja = datumMerenja;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }
    private String StringDatum (){
        SimpleDateFormat smp = new SimpleDateFormat("dd/MM/yyyy");
        smp.setCalendar(datumMerenja);
        return smp.format(datumMerenja.getTime());
    }
    
    public double getVodostaj() {
        return vodostaj;
    }
    public void setVodostaj(double vodostaj) {
        if (vodostaj > 0)
            this.vodostaj = vodostaj;
        else
            throw new ExceptionNedozvoljenaVrednost("Greska! Uneli ste nedozvoljenu vrednost");
    }

    @Override
    public String toString() {
        return "Naziv reke je:" + naziv + ", vodostaj reke je: " + vodostaj + ", a datum merenja vodostaja je: " + StringDatum();
    }
    
    
}
