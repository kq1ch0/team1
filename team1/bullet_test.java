import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet_test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet_test extends Actor
{
    int bulletSpeed = 20;
    int turnSpeed = 0;
    public void act() 
    {
        setLocation(getX()+bulletSpeed,getY());
        //setRotation(getRotation()+turnSpeed+Greenfoot.getRandomNumber(5));
        check();
    }
    public void check()
    {
        if (getX() > 1500){
            getWorld().removeObject(this);
        }
    }
}
