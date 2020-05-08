/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrvaGrupaZadatak4;

import java.util.ArrayList;

/**
 *
 * @author Jana Jovanovic
 */
public class ArmstrongovBroj {
    
    public ArrayList<Integer> VratiArmstrongoveTrocifreneBrojeve (){
        
        ArrayList<Integer> trocifreniArmstrongoviBrojevi = new ArrayList();
        for (int i=100; i<1000; i++){
            
            if (BrojJeArmstrongov(i)){
                trocifreniArmstrongoviBrojevi.add(i);
            }
        }
        return trocifreniArmstrongoviBrojevi;
        
    }
    
    private boolean BrojJeArmstrongov(int broj){
        
        int zbirKubovaCifara = 0;
        int kopijaBroja=broj;
        
        while(broj != 0){
            
            int trenutnaCifra = broj % 10;
            int kubTrenutneCifre = trenutnaCifra*trenutnaCifra*trenutnaCifra;
            zbirKubovaCifara += kubTrenutneCifre;
            broj = broj / 10;
        }
        
        boolean jesteArmstrongov= zbirKubovaCifara == kopijaBroja;
        
        return jesteArmstrongov;
    }
}
