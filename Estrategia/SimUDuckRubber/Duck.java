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
    private int xDirection;
    private int yDirection;
    private String imageName;
    private boolean isFlying;
    
    public Duck(String imageName){
        this.imageName = imageName;
        xDirection = -1;
        yDirection = -1;
    }
    
    /**
     * Act - do whatever the Duck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!getIsFlying()){
            swim();
        } else {
            fly();
        }
        if(Greenfoot.mouseClicked(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse.getClickCount() == 1){
                quack();
            } else {
                if(canStopFly()){
                    setIsFlying(!getIsFlying()); 
                    display();
                }
            }
        }
    
    }
    
    public void quack(){
        GreenfootSound quack = new GreenfootSound("sounds" + File.separator + "redheadquack.mp3");
        quack.play();
    }
    
    public void swim(){
        int xPos;        
        
        xPos = getX() + 2 * xDirection;
        
        if(xPos <= 50 || xPos >= 1050){
            xDirection = xDirection * -1;
            display();
        }

        setLocation(xPos, getY());
            
    }
    
    public void fly(){
        int yPos;                
        
        yPos = getY() + 2 * yDirection;
        if(yPos <= 32 || yPos >= 675){
            yDirection = yDirection * - 1;
        }
        setLocation(getX(), yPos);
        
    }
    
    public void setImageName(String imageName){
        this.imageName = imageName;
    }
    
    public String getImageName(){
        return imageName;
    }
    
    public int getXDirection(){
        return xDirection;
    }
    
    public void setIsFlying(boolean value){
        isFlying = value;
    }
    
    public boolean getIsFlying(){
        return isFlying;
    }
    
    public boolean canStopFly(){
        return !(getY() <= 400 && isFlying);
    }
    
    public abstract void display();
}
