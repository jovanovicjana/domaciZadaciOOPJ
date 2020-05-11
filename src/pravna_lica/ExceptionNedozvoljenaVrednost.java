/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pravna_lica;

/**
 *
 * @author Jana Jovanovic
 */
public class ExceptionNedozvoljenaVrednost extends RuntimeException{

    public ExceptionNedozvoljenaVrednost(String message) {
        super(message);
    }
}
