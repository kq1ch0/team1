import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_san here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A_san extends Actor
{
    /**
     * Act - do whatever the A_san wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if( Greenfoot.isKeyDown("left")){
        setRotation(180);
        move(1);
    }   // Add your action code here.

    int x = getX();
    int y = getY();
        if( Greenfoot.isKeyDown( "down" ) ){
        setLocation( x,y+1 );
    }

        if (Greenfoot.isKeyDown("up")){
            setRotation(-90);
            move(1);
        }// Add your action code here.

    }    
}
