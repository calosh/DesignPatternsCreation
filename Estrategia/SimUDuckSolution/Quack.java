import greenfoot.GreenfootSound;
import java.io.File;

/**
 * Write a description of class Quack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quack implements QuackBehavior  
{
    /**
     * Constructor for objects of class Quack
     */
    public Quack()
    {
    }
    
    public void quack(){
        GreenfootSound quackSound = new GreenfootSound("sounds" + File.separator + "redheadquack.mp3");
        quackSound.play();
    }

    
}
