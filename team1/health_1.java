import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class health_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health_1 extends Actor
{
    /**
     * Act - do whatever the health_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int pHealth;
    public void act() 
    {
        pHealth = player.getHealth();
        if (pHealth < 1){
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }    
}
