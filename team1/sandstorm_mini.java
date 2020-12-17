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
    int flg = 0;
    
    public void act() 
    {
        if (flg == 0){
            setRotation(170+Greenfoot.getRandomNumber(30));
            flg = 1;
        }
        // Add your action code here.
        move(5);
        if (getX() < 10)getWorld().removeObject(this);
    }    
}
