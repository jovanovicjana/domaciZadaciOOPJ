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
public class PrehrambeniProizvod extends Proizvod{
    
    private String rokTrajanja;

    public PrehrambeniProizvod() {
        super();
        this.rokTrajanja = "12.12.2007";
    }

    public PrehrambeniProizvod(String naziv, float cena, String rokTrajanja) {
        super(naziv, cena);
        setRokTrajanja(rokTrajanja);
    }

    public String getRokTrajanja() {
        return rokTrajanja;
    }
    public void setRokTrajanja(String rokTrajanja) {
        
        if (rokTrajanja != null){
            
            this.rokTrajanja = rokTrajanja;
            
        } else {
            
            this.rokTrajanja = "12.12.2007";
            System.out.println("Greska! Unos za rok trajanja proizvoda nije validan");
            
        }
    }  
}
