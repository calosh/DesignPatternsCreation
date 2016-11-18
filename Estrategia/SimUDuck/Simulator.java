import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Simulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulator extends World
{

    /**
     * Constructor for objects of class Simulator.
     * 
     */
    public Simulator()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 700, 1); 
        Duck rhDuck = new RedheadDuck("Readhead.png");
        Duck mDuck = new MallardDuck("wood_duck_male_Tv.png");
        addObject(rhDuck, 500, 610); 
        addObject(mDuck, 900, 520);
    }
}
