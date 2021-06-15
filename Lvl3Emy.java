import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl3Emy extends Actor
{
    private GreenfootImage ghostImg1 = new GreenfootImage("W4Enemy.png");
    private GreenfootImage ghostImg2 = new GreenfootImage("W4Enemy2.png");
    
    private GreenfootImage ghostLeftImg1 = new GreenfootImage("W4EnemyRot.png");
    private GreenfootImage ghostLeftImg2 = new GreenfootImage("W4Enemy2Rot.png");
    private int frame = 2;
    private int direction = 1;
    private int moveX = 1;
    private int moveNegX = 1; 
    private boolean side = false; 
    
    public void act()
    {
        movement();
        die();
        changePic();
        moveX += moveNegX;
    }
    public void changePicRight()
    {
        if (frame == 8)
        {
           setImage(ghostImg1);
        }
        
        else if (frame == 16)
        {
           setImage(ghostImg2);
           frame = 2;
           return;
        }
        
        frame+= 1;
    }
    public void changePicLeft()
    {
        if (frame == 8)
        {
           setImage(ghostLeftImg1);
        }
        
        else if (frame == 16)
        {
           setImage(ghostLeftImg2);
           frame = 2;
           return;
        }
        
        frame+= 1;
    }
    
    public void changePic(){
        if (side == false){
            changePicRight();
        }
        
        if(side){
            changePicLeft();
        }
    }
    
    public void movement(){
        setLocation(getX()-direction, getY());
        
        if(moveX == 61){  
           direction *= -1;
           side=true; 
           moveX = 1;
           moveNegX *= -1; 
        }
        
        if(moveX == -60){
           direction *= -1;
           side=false;
           moveX= 1; 
           moveNegX *= -1; 
        }
        
    }
    
    public void die(){
        if(isTouching(projectile.class) || isTouching(projectileL.class)){
            removeTouching(projectile.class);
            removeTouching(projectileL.class);
            getWorld().removeObject(this);
        }
    }
}
