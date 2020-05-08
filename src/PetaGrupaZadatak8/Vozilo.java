/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetaGrupaZadatak8;

/**
 *
 * @author Jana Jovanovic
 */
public abstract class Vozilo {
    
    String marka;
    String model;

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        if (marka !=null)
            this.marka = marka;
        else
            throw new VoziloExeption("Greska! Uneli ste nedozvoljenu vrednost.");
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model !=null)
            this.model = model;
        else
            throw new VoziloExeption("Greska! Uneli ste nedozvoljenu vrednost.");
    }
    
    abstract boolean daLiIdePoKopnu();
    
    abstract boolean daLiIdePoVodi();
    
    abstract boolean daLiIdePoVazduhu();

    public void ispisi (){
        System.out.println(kreirajTekstZaIspisivanje());
    }
    
    public String kreirajTekstZaIspisivanje (){
        if (daLiIdePoKopnu()){
            return "Marka vozila je: " + getMarka() +
                    "\nModel vozila je: " + getModel() +
                    "Vozilo ide po kopnu";
        }
        else if (daLiIdePoVodi()){
            return "Marka vozila je: " + getMarka() +
                    "\nModel vozila je: " + getModel() +
                    "Vozilo ide po vodi";
        }
        else if (daLiIdePoVazduhu()){
            return"Marka vozila je: " + getMarka() +
                    "\nModel vozila je: " + getModel() +
                    "Vozilo ide vazduhom";
        }  
        return "";
    }
    
}
