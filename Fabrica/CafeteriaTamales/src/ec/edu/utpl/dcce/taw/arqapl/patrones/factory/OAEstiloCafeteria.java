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
public class OAEstiloCafeteria extends Cafeteria{

    @Override
    public Tamal crearTamal(String tipo) {
        switch (tipo) {
            case "queso":
                return new TamalQuesoEstiloLojano();
            case "pollo" :
                return new TamalPolloEstiloLojano();
            case "cerdo":
                return new TamalCerdoEstiloLojano();
            case "completo" :
                return new TamalCompletoEstiloLojano();
            default:
                return null;
        }
    }
    
}
