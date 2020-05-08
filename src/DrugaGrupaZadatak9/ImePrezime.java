/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrugaGrupaZadatak9;

import java.util.Scanner;

/**
 *
 * @author Jana Jovanovic
 */
public class ImePrezime {
    private String s1;
    private String s2;
    private String s3;
    
    public void UcitajStringove (){
        
        Scanner ulaz = new Scanner(System.in);
        
        System.out.println("Unesite prvri string: ");
        s1 = ulaz.nextLine();
        
        System.out.println("Unesite drugi string: ");
        s2 = ulaz.nextLine();
    }
    
    public void FormiranjeIIspisivanjeStringa3 (){
        
        String obrnutiString = "";
        
        for (int i=s1.length()-1; i>=0; i--){
            
            obrnutiString += s1.charAt(i);
        }
        
        s3 = obrnutiString + s2;
        System.out.println("Finalni string glasi: " + s3);        
    }
    
 
}
