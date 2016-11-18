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
public class TamalCompletoEstiloQuiteño extends Tamal{

    public TamalCompletoEstiloQuiteño() {
        super();
        String nombre = "Quiteño Completo"; 
        String masa = "Masa elaborada con maíz de quiteño";
        String aji = "Ají de pepa de tomate de árbol";
        
        setNombre(nombre);
        setMasa(masa);
        setAji(aji);        
        
        addIngrediente("Carne de cerdo traída de Sangolquí");
        addIngrediente("Carne de pollo de Nanegalito");
        addIngrediente("Zanahoria");
        addIngrediente("Arbeja");
        addIngrediente("Cebolla picada");
    }    
}
