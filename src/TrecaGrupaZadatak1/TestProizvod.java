/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrecaGrupaZadatak1;

/**
 *
 * @author Jana Jovanovic
 */
public class TestProizvod {
    
     public static void main(String[] args) {
         
         PrehrambeniProizvod prehrambeniProizvod1 = new PrehrambeniProizvod("hleb",30.0f,"15.12.2018");
         PrehrambeniProizvod prehrambeniProizvod2 = new PrehrambeniProizvod();
         
         prehrambeniProizvod2.setNaziv("senf");
         prehrambeniProizvod2.setCena(120.5f);
         prehrambeniProizvod2.setRokTrajanja("10.10.2019");
         
         System.out.println("Podaci 1. proizvoda: " + "\n\tNaziv: " + prehrambeniProizvod1.getNaziv()
                                                    + "\n\tCena: " + prehrambeniProizvod1.getCena()
                                                    + "\n\tRok trajanja: " + prehrambeniProizvod1.getRokTrajanja());
         
         System.out.println("Podaci 2. proizvoda: " + "\n\tNaziv: " + prehrambeniProizvod2.getNaziv()
                                                    + "\n\tCena: " + prehrambeniProizvod2.getCena()
                                                    + "\n\tRok trajanja: " + prehrambeniProizvod2.getRokTrajanja());
         
     }
    
}
