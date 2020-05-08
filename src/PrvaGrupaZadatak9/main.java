/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrvaGrupaZadatak9;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jana Jovanovic
 */
public class main {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Unesite celi broj: ");
        int x = input.nextInt();
        
        System.out.println("Unesite cifru za koju zelite da proverite da li se nalazi u unetoj celobrojnoj vrednosti: ");
        int c = input.nextInt();
        
        Provera provera = new Provera(x,c);
        
        if(provera.ProveriSadrzanostCifre())
            System.out.println("Cifra je sadrzana u unetom broju");
        else 
            System.out.println("Cifra nije sadrzana u unetom broju");

    }
    
}
