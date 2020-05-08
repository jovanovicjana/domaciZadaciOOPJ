/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrvaGrupaZadatak9;

/**
 *
 * @author Jana Jovanovic
 */
import java.math.BigInteger;

public class Provera {
    
    int x;
    int c;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    public Provera(int x, int c) {
        this.x = x;
        this.c = c;
    }
    
   
    public boolean ProveriSadrzanostCifre (){
        
        //boolean sadrziCifru = false;
        
        while(x != 0)
        {
            int trenutnaCifra = x %10;
            
            if(trenutnaCifra == c)
            {
                //sadrziCifru = true;
                //break;
                return true;
            
            }
            x = x/10;
        }
        //return sadrziCifru;
        return false;
    }
    
    
}
