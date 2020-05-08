/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetaGrupaZadatak9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Jana Jovanovic
 */
public class WriteGeometrijskaTela {
    
    public static void main (String [] args) throws FileNotFoundException{
        try{
        Kocka kocka = new Kocka();
        Kvadar kvadar = new Kvadar();
        
        kocka.setDuzinaStranice(25.5);
        
        kvadar.setDuzina(20);
        kvadar.setSirina(10);
        kvadar.setVisina(30);
        
        File file = new File("C:\\Users\\Jana Jovanovic\\Desktop\\geometrijskaTela.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Povrsina kocke iznosi: " + kocka.getPovrisna());
        printWriter.println("Zapremina kocke iznosi: " + kocka.getZapremina());
        printWriter.println("Povrsina kvadra iznosi: " + kvadar.getPovrisna());
        printWriter.println("Zapremina kvadra iznosi: " + kvadar.getZapremina());
        printWriter.close();
        }
        catch(GeometrijskoTeloException ex){
            File file = new File("C:\\Users\\Jana Jovanovic\\Desktop\\geometrijskaTela.txt");
            PrintWriter printWriter = new PrintWriter(file);
            
            printWriter.println("Exception uhvacen");
            printWriter.println(ex.getMessage());
            printWriter.close();
        }
 
    }
}
