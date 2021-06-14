import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private GreenfootImage zomImg1 = new GreenfootImage("ZombieStill.png");
    private GreenfootImage zomImg2 = new GreenfootImage("ZombieMove.png");
    
    private GreenfootImage zomLeftImg1 = new GreenfootImage("ZombieStillRotated.png");
    private GreenfootImage zomLeftImg2 = new GreenfootImage("ZombieMoveRotated.png");
    private int frame = 2;
    private int direction = 2;
    private boolean side = false; 
    
    public void act() 
    {
        movement();
        die();
        changePic();
    }
    public void changePicRight()
    {
        if (frame == 8)
        {
           setImage(zomImg1);
        }
        
        else if (frame == 16)
        {
           setImage(zomImg2);
           frame = 2;
           return;
        }
        
        frame+= 1;
    }
    public void changePicLeft()
    {
        if (frame == 8)
        {
           setImage(zomLeftImg1);
        }
        
        else if (frame == 16)
        {
           setImage(zomLeftImg2);
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
        
        if(this.getX() == 563){
           direction *= -1;
           side=true; 
        }
        
        if(this.getX() == 821){
           direction *= -1;
           side=false;
        }
        
    }
    
    public void die(){
        if(isTouching(projectile.class)){
            removeTouching(projectile.class);
            getWorld().removeObject(this);
        }
    }
}
