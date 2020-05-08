/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrecaGrupaZadatak9;

/**
 *
 * @author Jana Jovanovic
 */
public class TestGeometrijskihTela {
    
    public static void main (String[] args){
        
        Kocka kocka = new Kocka();
        Kvadar kvadar = new Kvadar();
        
        kocka.setDuzinaStranice(25.5);
        
        kvadar.setDuzina(20);
        kvadar.setSirina(10);
        kvadar.setVisina(30);
        
        System.out.println("Povrsina kocke iznosi: " + kocka.getPovrisna());
        System.out.println("Zapremina kocke iznosi: " + kocka.getZapremina());
        
        System.out.println("Povrsina kvadra iznosi: " + kvadar.getPovrisna());
        System.out.println("Zapremina kvadra iznosi: " + kvadar.getZapremina());
    }
    
}
