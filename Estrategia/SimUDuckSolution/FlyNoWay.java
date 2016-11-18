/**
 * Write a description of class FlyNoWay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyNoWay implements FlyBehavior
{
    private int y;
    
    public void fly(){
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public boolean canFly(){
        return false;
    }
}
