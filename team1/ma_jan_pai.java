import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ma_jan_pai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ma_jan_pai extends Actor
{
    /**
     * Act - do whatever the ma_jan_pai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        
        setLocation(x-8,y);
        if(x == 0){
            getWorld().removeObject(this);
          
        }
    }    
}
