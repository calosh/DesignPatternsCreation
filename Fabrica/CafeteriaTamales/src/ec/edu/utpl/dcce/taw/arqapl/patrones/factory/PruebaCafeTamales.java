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
public class PruebaCafeTamales {
    public static void main(String[] args) {
        Cafeteria uioCafeteria = new UIOEstiloCafeteria();
        Cafeteria oaCafeteria = new OAEstiloCafeteria();
        
        Tamal tamal = uioCafeteria.pedirTamal("pollo");
        System.out.printf("Cliente 1 pidió un %s\n", tamal.getNombre());
        
        tamal = oaCafeteria.pedirTamal("pollo");
        System.out.printf("Cliente 2 pidió un %s\n", tamal.getNombre());
    }    
}
