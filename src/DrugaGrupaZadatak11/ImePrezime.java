/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrugaGrupaZadatak11;

import java.util.Scanner;

/**
 *
 * @author Jana Jovanovic
 */
public class ImePrezime {
    private String string1;
    private String string2;
    
    public void UcitajStringove (){
        
        Scanner ulaz = new Scanner(System.in);
        
        System.out.println("Unesite prvi string: ");
        string1 = ulaz.nextLine();
        
        System.out.println("Unesite drugi string: ");
        string2 = ulaz.nextLine();
    }
    
    public int NadjiBrojPojavljivanja()
    {
        int brojPojavljivanja=0;
        int duzinaStringa1 = string1.length();
        int duzinaStringa2 = string2.length();
        
        if(duzinaStringa1 < duzinaStringa2){
            
            return 0;
        } else {
            
            for (int i=0; i<duzinaStringa1-duzinaStringa2; i++){
                
                String stringZaProveru = string1.substring(i,i+duzinaStringa2);
                
                if (stringZaProveru.equals(string2)){
                    brojPojavljivanja++;
                }
            }
        }
   
        return brojPojavljivanja;
    }
    
    

    
 
}
