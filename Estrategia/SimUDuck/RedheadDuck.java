import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;

/**
 * Write a description of class RedheadDuck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedheadDuck extends Duck
{       
    public RedheadDuck(String imageName){
        super(imageName);
    }
    
    public void display(){
        if(getDireccion() < 0){
            setImageName("Redhead.png");
        } else {
            setImageName("Redhead0.png");
        }
        
        setImage("images"+File.separator+getImageName());
    }
}
