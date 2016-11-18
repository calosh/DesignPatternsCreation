import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;

/**
 * Write a description of class RubberDuck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RubberDuck extends Duck
{
    public RubberDuck(String imageName){
        super(imageName);
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    
    public void display(){
        if(!getIsFlying()){
            if(getXDirection() < 0){
                setImageName("rubberDuck.png");
            } else {
                setImageName("rubberDuck0.png");
            }
        } else {
            setImageName("rubberDuck.png");
        }
        
        setImage("images"+File.separator+getImageName());
    } 
}
