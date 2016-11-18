/**
 * Write a description of class FlyWithWings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyWithWings implements FlyBehavior 
{
    private int yDirection = -1;
    private int y;
    
    public void fly(){
        int yPos;                
        
        yPos = getY() + 2 * yDirection;
        if(yPos <= 32 || yPos >= 675){
            yDirection = yDirection * - 1;
        }
        y = yPos;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public boolean canFly(){
        return true;
    }
}
