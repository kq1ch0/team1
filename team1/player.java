import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //player height 200px
    int jumpPower    = -15; //ジャンプ力
    int gravityPower =   1; //重力1
    int groundY      = 600; //地面のY座標
    int jumpVarMax   =   3; //最大ジャンプ回数
    //int jumpFlex   =  10;
    
    int spdY         =   0; //プレイヤーのY軸速度
    int isPress      =   0; //ボタン押下フラグ
    int jumpVar      = jumpVarMax; //ジャンプ回数カウンタ
    
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("space") && isPress==0 && jumpVar>0){
            spdY = jumpPower;
            isPress=1;
            jumpVar--;
        }
        if (!Greenfoot.isKeyDown("space")){
            isPress=0;
        }
        
        setLocation(getX(),getY()+spdY);
        spdY += gravityPower;
        
        if (getY() > groundY){
            setLocation(getX(),600);
            jumpVar = jumpVarMax;
        }
    }    
}
