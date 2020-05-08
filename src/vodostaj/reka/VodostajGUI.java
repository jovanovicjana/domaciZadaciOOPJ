/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodostaj.reka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Jana Jovanovic
 */
public class VodostajGUI {
    private final double DOZVOLJENA_RAZLIKA_VODOSTAJA = 1;
    
    private Reka [] reke = new Reka [100];
    private int brojac = 0;
    
    public VodostajGUI()
    {
        Reka dunav1=new Reka();
        dunav1.setNaziv("Dunvav");
        dunav1.setVodostaj(893);
        dunav1.setDatumMerenja(new GregorianCalendar(2010,11,9));
        UnesiReku(dunav1);
        
        Reka dunav2=new Reka();
        dunav2.setNaziv("Dunvav");
        dunav2.setVodostaj(900);
        dunav2.setDatumMerenja(new GregorianCalendar(2011,11,9));
        UnesiReku(dunav2);
             
        Reka sava1=new Reka();
        sava1.setNaziv("Sava");
        sava1.setVodostaj(123);
        sava1.setDatumMerenja(new GregorianCalendar(2010,11,12));
        UnesiReku(sava1);
        
        Reka sava2=new Reka();
        sava2.setNaziv("Sava");
        sava2.setVodostaj(125);
        sava2.setDatumMerenja(new GregorianCalendar(2010,12,12));
        UnesiReku(sava2);
        
        Reka morava1=new Reka();
        morava1.setNaziv("Morava");
        morava1.setVodostaj(123);
        morava1.setDatumMerenja(new GregorianCalendar(2010,11,12));
        UnesiReku(morava1);
        
        Reka morava2=new Reka();
        morava2.setNaziv("Morava");
        morava2.setVodostaj(122);
        morava2.setDatumMerenja(new GregorianCalendar(2010,12,13));
        UnesiReku(morava2);
    }
    
    public void UnesiReku (Reka reka){
        if (brojac<100){
            reke[brojac] = reka;
            brojac++;
        }
    }
    
    public String porukaZaPrikazivanje (){
        String rezultat = "VODOSTAJ\n";
        double najvisiVodostaj = -100000000000000d;
        String nazivRekeSaNajvisimVodostajem = "";
        
        for (int i=0;  i<brojac; i++){
            rezultat += reke[i].toString() + "\n";
            
            if (reke[i].getVodostaj() > najvisiVodostaj)
            {
                najvisiVodostaj = reke[i].getVodostaj();
                nazivRekeSaNajvisimVodostajem = reke[i].getNaziv();
            }
        }
        rezultat += "Reka sa najvisim vodostajem je: " + nazivRekeSaNajvisimVodostajem;
        return rezultat;
    }
    
    public void GenerisiIzvestaj()
    {
        try{
        ArrayList<Reka> rekeKojeSeUpisujuUfajl=new ArrayList<Reka>();
        
        int duzinaNiza = brojac;
        for (int i=0; i<brojac; i++){
            String trenutnaReka = reke[i].getNaziv();
            for (int j=i+1; j<brojac; j++){
                if(trenutnaReka == reke[j].getNaziv()){
                    double razlikaVodostaja;
                    
                    if(reke[i].getDatumMerenja().after(reke[j].getDatumMerenja())){
                        razlikaVodostaja = reke[i].getVodostaj() - reke[j].getVodostaj();
                        System.out.println("Razlika vodostaja za " + reke[i].getNaziv() + "");
                        if (razlikaVodostaja > DOZVOLJENA_RAZLIKA_VODOSTAJA){
                            rekeKojeSeUpisujuUfajl.add(reke[i]);
                        }
                    }
                    else{
                        razlikaVodostaja = reke[j].getVodostaj() - reke[i].getVodostaj();
                        if (razlikaVodostaja > DOZVOLJENA_RAZLIKA_VODOSTAJA){
                            rekeKojeSeUpisujuUfajl.add(reke[j]);
                        }
                    }       
                }
            }
        }
        System.out.println(rekeKojeSeUpisujuUfajl.size());
        UpisRekaUFajl(rekeKojeSeUpisujuUfajl);
        } catch (FileNotFoundException ex){
            
        }
        catch(IOException ex){
            
        }
    }
    
    private void UpisRekaUFajl (ArrayList<Reka> rekeKojeSeUpisujuUfajl)throws FileNotFoundException,IOException{
        File file = new File("C:\\Users\\Jana Jovanovic\\Desktop\\Izveštaj.txt");
        PrintWriter printWriter = new PrintWriter(file);
        FileOutputStream fileOut =new FileOutputStream("C:\\Users\\Jana Jovanovic\\Desktop\\Izveštaj.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        for (int i=0; i<rekeKojeSeUpisujuUfajl.size(); i++){
             //printWriter.println(rekeKojeSeUpisujuUfajl.get(i).toString());
            out.writeObject(rekeKojeSeUpisujuUfajl.get(i));             
        }
        
        out.close();
         fileOut.close();
        printWriter.close();
    }
}
