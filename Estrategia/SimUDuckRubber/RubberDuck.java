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
    
    public void quack(){
        GreenfootSound squeak = new GreenfootSound("sounds" + File.separator + "quacktoy.mp3");
        squeak.play();
    }
    
}
