/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.dcce.taw.arqapl.patrones.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgaf
 */
public class Tamal {
    private String nombre;
    private String masa;
    private String aji;
    private List<String> ingredientes;
    
    public Tamal(){
        ingredientes = new ArrayList<String>();
    }

    public Tamal(String nombre, String masa, String aji) {
        this();
        this.nombre = nombre;
        this.masa = masa;
        this.aji = aji;
    }
    
    
    
    public void preparar(){
        System.out.printf("Preparando %s", nombre);
        System.out.println("Preparando la masa");
        System.out.println("Agregando relleno");
        for(String ingrendiente : ingredientes){
            System.out.printf("\t%s\n", ingrendiente);
        }        
    }
    
    public void cocinar(){
        System.out.println("Cocinar durante 2 horas");
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(getNombre()).append("----\n");
        display.append(masa).append("\n");
        display.append(aji).append("\n");
        for(String ingrediente : ingredientes){
            display.append("\t").append(ingrediente).append("\n");
        }
        return display.toString();
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getAji() {
        return aji;
    }

    public void setAji(String aji) {
        this.aji = aji;
    }
    
    public void addIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }
    
     
    
}
