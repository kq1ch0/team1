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

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                Random random = new Random();
                int randomValue = random.nextInt(10);
                
                switch (randomValue){
                    case 0:
                        addObject(new inemuri(), 1600, 700);
                        break;
                    case 1:
                        addObject(new test0(), 1600, 400);
                        break;
                    case 2:
                        addObject(new walkingman(), 1600, 700);
                        break;
                    case 3:
                        addObject(new cardgame(), 1600, 700);
                        break;
                    case 4:
                        addObject(new grass(), 1600, 400);
                        break;
                    case 5:
                        addObject(new omocha_game(), 1600, 400);
                        break;
                    case 6:
                        addObject(new ma_jan_pai(), 1600, 400);
                        break;
                    case 7:
                        addObject(new test100(), 1600, 100);
                        break;
                    case 8:
                        addObject(new dentaku(), 1600, 100);
                        break;
                    case 9:
                        addObject(new energy(), 1600, 100);
                        break;
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
