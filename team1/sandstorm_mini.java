import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sandstorm_mini here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sandstorm_mini extends Actor
{
    /**
     * Act - do whatever the sandstorm_mini wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int deg = 180;//Greenfoot.getRandomNumber(90);
    public void act() 
    {
        // Add your action code here.
        setRotation(170+Greenfoot.getRandomNumber(30));
        
    }    
}
