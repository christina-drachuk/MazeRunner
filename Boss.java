import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    private GreenfootImage BossImg1 = new GreenfootImage("boss1.png");
    private GreenfootImage BossImg2 = new GreenfootImage("Boss2.png");
    private GreenfootImage BossBad = new GreenfootImage("Boss3.png");
    private int frame = 2;
    private int direction = 1;
    private int moveX = 1;
    private int moveNegX = 1; 
    private boolean side = false;
    public static int health = 200;
    private int mainATime = 1; 
    
    public void act()
    {
        movement();
        changePic();
        moveX += moveNegX;
        mainAttack();
        secondAttack();
        healthLoss();
        die();
    }
    
    public void healthLoss(){
        if(isTouching(projectile.class)){
            health -= 5;
            removeTouching(projectile.class);
        }
        
        if(isTouching(megaLaser.class)){
            health -= 20;
            removeTouching(megaLaser.class);
        }
        
        if (health < 100){
            
            mainATime = 4; 
        }
        
        if (health == 100){
           Greenfoot.playSound("bossHurt.wav");
        }
    }
    
    public void changePicRight()
    {
        if (frame == 8)
        {
           setImage(BossImg1);
        }
        
        else if (frame == 16)
        {
           setImage(BossImg2);
           frame = 2;
           return;
        }
        
        frame+= 1;
    }
    
    public void changePic(){
        if (side == false){
            changePicRight();
        }
    }
    
    public void movement(){
        setLocation(getX()-direction, getY());
        
        if(moveX == 6){  
           direction *= -1;
           side=true; 
           moveX = 1;
           moveNegX *= -1; 
        }
        
        if(moveX == -5){
           direction *= -1;
           side=false;
           moveX= 1; 
           moveNegX *= -1; 
        }
        
    }
    
    public void mainAttack(){
        if (Greenfoot.getRandomNumber(100) <= mainATime){
            getWorld().addObject(new fireball(), getX(), getY()-100);
            getWorld().addObject(new fireball(), getX(), getY()-100);
        }
    }
    
    public void secondAttack(){
        if (Greenfoot.getRandomNumber(500) < mainATime){
            
            setImage(BossBad);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            getWorld().addObject(new Acid(), Greenfoot.getRandomNumber(1100), 5);
            setImage(BossBad);
        }
    }
    
    public void die(){
        if(health <= 0){
           Greenfoot.playSound("bossDead.wav");
           getWorld().removeObject(this);
        }
    
    }
}
