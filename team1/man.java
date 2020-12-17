import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends Actor
{
    /**
     * Act - do whatever the man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-4,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+4,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-4 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
           setLocation( x,y+4 );
        }
        
        Actor actor = getOneIntersectingObject( test.class );
        actor = getOneIntersectingObject( test2.class );
        if( actor != null){
            // TARO とぶつかった時の処理を書く
            getWorld().showText( "Hit", 100, 100 );
        }
    }    
}
