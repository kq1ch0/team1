
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Collision
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //player height 200px
    int jumpPower    = -20; //ジャンプ力
    int gravityPower =   1; //重力
    int groundY      = 600; //地面のY座標
    int jumpVarMax   =   2; //最大ジャンプ回数
    int vibrationValue = 2; //プレイヤー振動の量
    int ssminiFlagMax  = 15; //砂埃の頻度
    int ignoreDamageTimeMax = 50; //ダメージ無敵時間
    //int jumpFlex   =  10;
    
    int spdY         =   0; //プレイヤーのY軸速度
    int isPress      =   0; //ボタン押下フラグ
    int jumpVar      = jumpVarMax; //ジャンプ回数カウンタ
    int stepFlag     = 0;   //プレイヤーのブラー処理フラグ
    int ignoreDamageTime = 0;
    static int playerHealth = 3;
    
    static int ssFlag = 0;
    int ssminiFlag   = ssminiFlagMax;
    
    static int posX         = 0;
    static int posY         = 0;
    
    public void act() 
    {
        if (jumpVar == jumpVarMax){
            if (ssFlag == 0){
                getWorld().addObject(new sandstorm(),getX()-180,getY());
                ssFlag = 1;
            }
            ssminiFlag --;
            if (ssminiFlag <= 0){
                getWorld().addObject(new sandstorm_mini(),getX()-20,getY()+70);
                ssminiFlag = ssminiFlagMax;
            }
        }else{
            ssFlag = 0;
        }
        // Add your action code here.
        //-----ジャンプボタン処理-----
        if (Greenfoot.isKeyDown("space") && isPress==0 && jumpVar>0){
            spdY = jumpPower;
            isPress=1;
            jumpVar--;
        }
        if (!Greenfoot.isKeyDown("space")){
            isPress=0;
        }
        if (Greenfoot.isKeyDown("enter")){
            getWorld().addObject(new bullet_test(),getX(),getY());
        }
        
        //-----プレイヤー移動-----
        setLocation(getX(),getY()+spdY);
        spdY += gravityPower;
        
        //-----着地フラグ処理-----
        if (getY() > groundY){ 
            setLocation(getX(),600);
            jumpVar = jumpVarMax;
        }
        
        //-----プレイヤーに走行中の揺れをかける処理-----
        if (jumpVar == jumpVarMax){
            if (stepFlag == 0){
                setLocation(getX()+vibrationValue,getY());
                stepFlag = 1;
            }else if (stepFlag == 1){
                setLocation(getX()-vibrationValue,getY());
                stepFlag = 0;
            }
        }
    
        
        //-----player_footに渡す座標の指定-----
        posX = getX();
        posY = getY();
        
        if ((touch(test.class) || touch(test2.class)) && ignoreDamageTime == 0){
            ignoreDamageTime = ignoreDamageTimeMax;
            playerHealth--;
        }
        /*
        Actor actor = getOneIntersectingObject( test.class );
        if( actor != null && ignoreDamageTime == 0){
            
        }
        */
        if (ignoreDamageTime > 0)ignoreDamageTime--;
        
    }
    public static int getHealth(){
        return playerHealth;
    }
    
    /** This method is a pixel perfect collision detection. Return, if it intersects an actor of the given class */
    
}