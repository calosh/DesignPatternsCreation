import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;

/**
 * Write a description of class Duck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Duck extends Actor
{
    private int direccion;
    private String imageName;
    
    public Duck(String imageName){
        this.imageName = imageName;
        direccion = -1;
    }
    
    /**
     * Act - do whatever the Duck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        swim();
        if(Greenfoot.mousePressed(this)){
            quack();
        }
    
    }
    
    public void quack(){
        GreenfootSound quack = new GreenfootSound("sounds" + File.separator + "redheadquack.mp3");
        quack.play();
    }
    
    public void swim(){
        int xPos;        
        
        xPos = getX() + 2 * direccion;
        
        if(xPos <= 50 || xPos >= 1050){
            direccion = direccion * -1;
            display();
        }

        setLocation(xPos, getY());
            
    }
    
    public void setImageName(String imageName){
        this.imageName = imageName;
    }
    
    public String getImageName(){
        return imageName;
    }
    
    public int getDireccion(){
        return direccion;
    }
    
    public abstract void display();
}
