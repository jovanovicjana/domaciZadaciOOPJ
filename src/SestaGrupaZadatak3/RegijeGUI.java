/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SestaGrupaZadatak3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Jana Jovanovic
 */
public class RegijeGUI {
    
    private ArrayList<Regija> regioni = new ArrayList<Regija>();


    
    public ArrayList<Regija> getRegioni() {
        return regioni;
    }
    
    public boolean Dodaj (Regija novaRegija){
        if (RegijaVecPostoji(novaRegija)){
            return false;
        }
        else {
            regioni.add(novaRegija);
            SortirajRegijePremaNatalitetu();
            return true;
        }
    }
    
    
    
    private boolean RegijaVecPostoji (Regija regijaZaProveru){
        for(int i=0; i<regioni.size(); i++){
            if (regijaZaProveru.getNaziv().equals(regioni.get(i).getNaziv()) ){
                return true;
            }
        }
        return false;
    }
    
    private void SortirajRegijePremaNatalitetu (){
        for (int i=0; i<regioni.size(); i++){
            for (int j=i+1; j<regioni.size(); j++){
                if (regioni.get(j).getNatalitet() > regioni.get(i).getNatalitet()){
                    Regija pomocni = regioni.get(i);
                    regioni.set(i, regioni.get(j));
                    regioni.set(j, pomocni);
                }
            }
        }
    }
    
    public void SacuvajRegije () throws FileNotFoundException{
        try{
            FileOutputStream rastuce_regije = new FileOutputStream ("C:\\Users\\Jana Jovanovic\\Desktop\\rastuce_regije.txt");
            FileOutputStream umiruce_regije = new FileOutputStream ("C:\\Users\\Jana Jovanovic\\Desktop\\umiruce_regije.txt");
            ObjectOutputStream outputStreamRastuce_reguje = new ObjectOutputStream(rastuce_regije);
            ObjectOutputStream outputStreamUmiruce_regije = new ObjectOutputStream(umiruce_regije);

            for (int i=0; i<regioni.size(); i++){
                if (regioni.get(i).getPromena() > 0){
                    outputStreamRastuce_reguje.writeObject(regioni.get(i));
                } else {
                    
                    outputStreamUmiruce_regije.writeObject(regioni.get(i));
                }
            }
            outputStreamRastuce_reguje.close();
            outputStreamUmiruce_regije.close();
            rastuce_regije.close();
            umiruce_regije.close();
        } catch (FileNotFoundException ex){}
          catch (IOException ex1){}
    }
    
    
    /*
    public void SerijalizacijaTest () {
        try{
        Regija regijaTest = new Regija ();
        regijaTest.setNaziv("Vozdovac");
        regijaTest.setNatalitet(1234);
        regijaTest.setMortalitet(5);
        regijaTest.setMigracioniSaldo(3);
        
        FileOutputStream file = new FileOutputStream("C:\\Users\\Jana Jovanovic\\Desktop\\serijalizacija_test.txt"); 
        ObjectOutputStream out = new ObjectOutputStream(file); 
              
        // Method for serialization of object 
        out.writeObject(regijaTest); 
              
        out.close(); 
        file.close(); 
              
        System.out.println("Object has been serialized"); 
        
        // Reading the object from a file 
        FileInputStream fileInput = new FileInputStream("C:\\Users\\Jana Jovanovic\\Desktop\\serijalizacija_test.txt"); 
        ObjectInputStream in = new ObjectInputStream(fileInput); 
              
            // Method for deserialization of object 
        Regija deserijalizovanaRegija = (Regija) in.readObject();
              
        in.close(); 
        file.close(); 
              
        System.out.println("Object has been deserialized "); 
        System.out.println("Naziv = " + deserijalizovanaRegija.getNaziv()); 
        System.out.println("Natalitet = " + deserijalizovanaRegija.getNatalitet()); 
        
        } catch(FileNotFoundException ex){
            
        }
        catch (IOException ex1){
            
        }
        catch (ClassNotFoundException ex3){
            
        }
    }
    */


    
    
}
