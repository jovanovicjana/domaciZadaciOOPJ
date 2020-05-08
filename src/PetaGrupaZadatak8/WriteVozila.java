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
public class WriteVozila {
    
    public static void main (String [] args)throws FileNotFoundException{
    
     try{
         
         Automobil automobil = new Automobil();
         
         Avion avion = new Avion();
         
         automobil.setMarka("Mercedes");
         automobil.setModel("E220");
         
         avion.setMarka("Boeing");
         avion.setModel("747");
         
        File file = new File("C:\\Users\\Jana Jovanovic\\Desktop\\vozila.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Marka automobila je: " + automobil.getMarka());
        printWriter.println("Marka automobila je: " + automobil.getModel());
        printWriter.println("Marka aviona je: " + avion.getMarka());
        printWriter.println("Model aviona je: " + avion.getModel());
        printWriter.close();
        
        }
        catch(VoziloExeption ex){
            File file = new File("C:\\Users\\Jana Jovanovic\\Desktop\\vozila.txt");
            PrintWriter printWriter = new PrintWriter(file);
            
            printWriter.println("Exception uhvacen");
            printWriter.println(ex.getMessage());
            printWriter.close();
        }
    
    }
    
    
}
