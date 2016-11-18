import greenfoot.GreenfootSound;
import java.io.File;

/**
 * Write a description of class Squeak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squeak implements QuackBehavior
{
    public void quack(){
        GreenfootSound squeakSound = new GreenfootSound("sounds" + File.separator + "quacktoy.mp3");
        squeakSound.play();
    }
}
