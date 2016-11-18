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
public class TamalCerdoEstiloQuiteño extends Tamal{

    public TamalCerdoEstiloQuiteño() {
        super();
        String nombre = "Quiteño con carne de cerdo"; 
        String masa = "Masa elaborada con Quiteño";
        String aji = "Ají de pepa de tomate de árbol";
        
        setNombre(nombre);
        setMasa(masa);
        setAji(aji);        
        
        addIngrediente("Carne cocida de cerdo traida de Sangolquí");
        addIngrediente("Zanahoria");
        addIngrediente("Arbeja");
        addIngrediente("Cebolla picada");
    }
    
    
}
