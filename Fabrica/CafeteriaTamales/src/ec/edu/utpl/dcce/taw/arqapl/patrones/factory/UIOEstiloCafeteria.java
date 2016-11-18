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
public class UIOEstiloCafeteria extends Cafeteria {

    @Override
    public Tamal crearTamal(String tipo) {
        switch (tipo) {
            case "queso":
                return new TamalQuesoEstiloQuiteño();
            case "pollo" :
                return new TamalPolloEstiloQuiteño();
            case "cerdo":
                return new TamalCerdoEstiloQuiteño();
            case "completo" :
                return new TamalCompletoEstiloQuiteño();
            default:
                return null;
        }
    }
}
