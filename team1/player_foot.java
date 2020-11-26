import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player_foot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player_foot extends Actor
{
    /**
     * Act - do whatever the player_foot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int angle = 0;
    int playerx = player.posX;
    int playery = player.posY+50;
    public void act() 
    {
        playerx = player.posX-10;
        playery = player.posY+50;
        setLocation(playerx,playery);
        setRotation(angle);
        angle += 50;
    }    
}
