/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrugaGrupaZadatak11;

/**
 *
 * @author Jana Jovanovic
 */
public class GlavnaKlasa {
    
    public static void main(String[] args) {
        ImePrezime imePrezime = new ImePrezime();
        
        imePrezime.UcitajStringove();
        
        int brojPojavljivanja = imePrezime.NadjiBrojPojavljivanja();
        System.out.println("Broj pojavljivanja drugog stringa u prvom je: " + brojPojavljivanja);
       
    
    }
}
