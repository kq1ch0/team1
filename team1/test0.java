import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test0 extends Actor
{
    /**
     * Act - do whatever the test0 wants to do. This method is called whenever
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
