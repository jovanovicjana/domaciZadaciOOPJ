/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetaGrupaZadatak8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Jana Jovanovic
 */
public class Avion extends Vozilo{
    
    @Override
    boolean daLiIdePoKopnu() {
        return false;
    }

    @Override
    boolean daLiIdePoVodi() {
        return false;
    }

    @Override
    boolean daLiIdePoVazduhu() {
        return true;
    }
    
    public void upisi () throws FileNotFoundException{
        File file = new File("C:\\Users\\Jana Jovanovic\\Desktop\\avioni.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(kreirajTekstZaIspisivanje());
        printWriter.close();
    }
    
}
