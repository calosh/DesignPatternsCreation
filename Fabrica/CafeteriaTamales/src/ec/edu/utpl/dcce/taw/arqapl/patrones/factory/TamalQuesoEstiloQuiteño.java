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
public class TamalQuesoEstiloQuiteño extends Tamal{

    public TamalQuesoEstiloQuiteño() {
        super();
        String nombre = "Quiteño sólo de Queso"; 
        String masa = "Masa elaborada con maíz de Otavalo";
        String aji = "Ají de pepa de tomate de árbol";
        
        setNombre(nombre);
        setMasa(masa);
        setAji(aji);        
        
        addIngrediente("Queso de hoja fresco de Ambato");               
    }
     
    
}
