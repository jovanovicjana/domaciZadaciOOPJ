/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pravna_lica.prodaja;

import pravna_lica.ExceptionNedozvoljenaVrednost;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Jana Jovanovic
 */
public class ProdajaNaVelikoGUI {
    
        private Racun [] racuni;

    public ProdajaNaVelikoGUI() {
        racuni = new Racun[100];
    }
    
    private int brojac = 0;
    
    //dodavanje racuna u niz 
    public void DodajRacun (Racun racun){
        if (brojac<100){
            racuni [brojac] = racun;
            brojac++;
        } else
            throw new ExceptionNedozvoljenaVrednost("U nizu nema dovoljno mesta");
    }
    
    public void Obrisi (int PIB){
        if (DaLiPostoji(PIB)){
            for (int i=0; i<brojac; i++){
                if (PIB == racuni[i].getPreduzece().getPIB()){
                    racuni = removeTheElement(racuni, brojac, i);
                    brojac --;
                }
            }
        }
        
    }
    
    private boolean DaLiPostoji (int PIB){
        for (int i=0; i<racuni.length; i++){
            if (PIB == racuni[i].getPreduzece().getPIB())
                return true;
        }
        return false;
    }
    
    public Racun [] removeTheElement(Racun [] arr, int brojElemenata,int index){ 
        if (arr == null || index < 0 || index >= arr.length) { 
            return arr; 
        } 
  
        Racun [] anotherArray = new Racun[arr.length - 1]; 

        for (int i = 0, k = 0; i < brojElemenata; i++) { 
            if (i == index) { 
                continue; 
            }  
            anotherArray[k++] = arr[i]; 
        } 
        
        return anotherArray; 
    }
    
        
    public void UpisiUFajl () throws FileNotFoundException {
        try{
            File file = new File("C:\\Users\\Jana Jovanovic\\Desktop\\racuni.out");
            PrintWriter printWriter = new PrintWriter(file);
            
            for (int i=0; i<brojac; i++){
                printWriter.println(racuni[i].toString());
            }
            printWriter.close();
        
        }
        catch (ExceptionNedozvoljenaVrednost ex){
        }
        catch (FileNotFoundException ex1){
            
        }
            
    }
                

}
