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
public class main {
    
    public static void main (String [] args){
        
        ArmstrongovBroj armstrongovBroj = new ArmstrongovBroj();
        
        ArrayList<Integer> sviArmstrongoviTrocifreniBrojevi = armstrongovBroj.VratiArmstrongoveTrocifreneBrojeve();
        
        for (int i=0; i<sviArmstrongoviTrocifreniBrojevi.size(); i++)
            System.out.println(sviArmstrongoviTrocifreniBrojevi.get(i));
    }
    
}
