import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;

/**
 * Write a description of class MallardDuck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MallardDuck extends Duck
{
    public MallardDuck(String imageName){
        super(imageName);
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    
    public void display(){
        if(!getIsFlying()){
            if(getXDirection() < 0){
                setImageName("wood_duck_male_Tv.png");
            } else {
                setImageName("wood_duck_male_Tv0.png");
            }
        } else {
            setImageName("mallardduckFly.png");
        }
        
        setImage("images"+File.separator+getImageName());
    }          
}
