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
    private String imageName;
    private boolean isFlying;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public Duck(String imageName){
        this.imageName = imageName;
        xDirection = -1;
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
            performFly();
        }
        if(Greenfoot.mouseClicked(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse.getClickCount() == 1){
                performQuack();
            } else {                
                if(canStopFly() && flyBehavior.canFly()){
                    setIsFlying(!getIsFlying()); 
                    display();
                }
            }
        }
    
    }
    
    private void performFly(){
        flyBehavior.setY(getY());
        flyBehavior.fly();
        setLocation(getX(), flyBehavior.getY());
    }
    
    public void performQuack(){
        quackBehavior.quack();
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
    
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    
    public abstract void display();
}
