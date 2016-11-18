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
public class TamalQuesoEstiloLojano extends Tamal{

    public TamalQuesoEstiloLojano() {
        super();
        String nombre = "Lojano sólo de Queso"; 
        String masa = "Masa elaborada con maíz de Pindal";
        String aji = "Ají de pepa de zambo";
        
        setNombre(nombre);
        setMasa(masa);
        setAji(aji);        
        
        addIngrediente("Queso fresco de Yangana");        
        addIngrediente("Cebolla picada");
    }
     
    
}
