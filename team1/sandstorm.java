import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sandstorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sandstorm extends Actor
{
    /**
     * Act - do whatever the sandstorm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (player.ssFlag == 0){
            setLocation(getX()-8,getY());
            if (getX() < 10)getWorld().removeObject(this);
        }
    }    
}
