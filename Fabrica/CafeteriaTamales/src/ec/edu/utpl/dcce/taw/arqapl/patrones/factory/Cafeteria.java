/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.dcce.taw.arqapl.patrones.factory;

/**
 *
 * @author jorgaf
 */
public abstract class Cafeteria {
    public abstract Tamal crearTamal(String tipo);
    
    public Tamal pedirTamal(String tipo){
        Tamal tamal = crearTamal(tipo);
        System.out.printf("---- Preparando un tamal %s ----\n", tamal.getNombre());
        tamal.preparar();
        tamal.cocinar();
        
        return tamal;        
    }    
}
