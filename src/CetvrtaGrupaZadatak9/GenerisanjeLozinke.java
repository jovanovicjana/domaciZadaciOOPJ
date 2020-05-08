/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CetvrtaGrupaZadatak9;

import java.util.Random;

/**
 *
 * @author Jana Jovanovic
 */
public class GenerisanjeLozinke {

    final int NUMBER_OF_CHARACTER = 10;
    private Random random = new Random();
    
    public String generisiMalaSlova (){
        String lozinkaSaMalimSlovima = "";
        for (int i=0; i<NUMBER_OF_CHARACTER; i++){
            lozinkaSaMalimSlovima +=GenerisiRandomMaloSlovo();
        }
        return lozinkaSaMalimSlovima;
    }
    
    public String generisiVelikaSlova (){
        String lozinkaSaVelikimSlovima = "";
        for (int i=0; i<NUMBER_OF_CHARACTER; i++){
            
            lozinkaSaVelikimSlovima +=GenerisiRandomVelikoSlovo();
        }
        return lozinkaSaVelikimSlovima;
    }
     
    public String generisiVelikaIMalaSlova(){
        String lozinkaSaVelikimIMalimSlovima = "";
        for (int i=0; i<NUMBER_OF_CHARACTER; i++){
            int verovatnoca = random.nextInt(100);
            if (verovatnoca > 50){
                lozinkaSaVelikimIMalimSlovima += GenerisiRandomMaloSlovo();
            } else {
                lozinkaSaVelikimIMalimSlovima += GenerisiRandomVelikoSlovo();
            }
        }
        return lozinkaSaVelikimIMalimSlovima;
    }
      
    private char GenerisiRandomMaloSlovo(){
        int randomAscii = random.nextInt(26)+97;
        return (char)randomAscii;
    }
    
     private char GenerisiRandomVelikoSlovo(){
        int randomAscii = random.nextInt(26)+65;
        return (char)randomAscii;
    }
    
    public String generisiLozinku (boolean generisiMala, boolean generisiVelika, boolean generisiIVelikaIMala){
        if (generisiMala)
            return generisiMalaSlova();
        if (generisiVelika)
            return generisiVelikaSlova();
        if (generisiIVelikaIMala)
            return generisiVelikaIMalaSlova();
        
        return ""; 
    }
}
