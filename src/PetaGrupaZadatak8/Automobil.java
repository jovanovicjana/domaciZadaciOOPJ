/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetaGrupaZadatak8;

/**
 *
 * @author Jana Jovanovic
 */
public class Automobil extends Vozilo{

    @Override
    boolean daLiIdePoKopnu() {
        return true;
    }

    @Override
    boolean daLiIdePoVodi() {
        return false;
    }

    @Override
    boolean daLiIdePoVazduhu() {
        return false;
    }

}
