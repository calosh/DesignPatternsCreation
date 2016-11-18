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
public class TamalCompletoEstiloLojano extends Tamal{

    public TamalCompletoEstiloLojano() {
        super();
        String nombre = "Lojano Completo"; 
        String masa = "Masa elaborada con maíz de Pindal";
        String aji = "Ají de pepa de zambo";
        
        setNombre(nombre);
        setMasa(masa);
        setAji(aji);        
        
        addIngrediente("Carne de cerdo de Catacocha");
        addIngrediente("Carne de pollo de Catamayo");
        addIngrediente("Zanahoria");
        addIngrediente("Arbeja");
        addIngrediente("Cebolla picada");
    }    
}
