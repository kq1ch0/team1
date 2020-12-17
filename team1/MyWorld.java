import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int player_hp = 3;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        //addObject(new test(), 1500, 90);
        //addObject(new test(), 1500, 400);
        //addObject(new test(), 1500, 710);
        //addObject(new test2(), 1500, 300);
        //addObject(new bg(), 1500, 400);
        //addObject(new bg(), 100, 400);
        //addObject(new man(), 300, 710);

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                Random random = new Random();
                int randomValue = random.nextInt(3);
                
                switch (randomValue){
                    case 0:
                        addObject(new test(), 1600, 700);
                        break;
                    case 1:
                        addObject(new test2(), 1600, 400);
                }
                
            }
        };
        
        
        timer.schedule(task, 1000, 2000);
        
        addObject(new player(),400,600);
        addObject(new player_foot(),400,650);
        //addObject(new maku_test(),100,400);
        //addObject(new maku_test(),1500,400);

    }
}
