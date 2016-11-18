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
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    
    public void display(){
        if(!getIsFlying()){
            if(getXDirection() < 0){
                setImageName("Redhead.png");
            } else {
                setImageName("Redhead0.png");
            }
        } else {
            setImageName("duckFlay.png");
        }
        
        setImage("images"+File.separator+getImageName());
    }
}
