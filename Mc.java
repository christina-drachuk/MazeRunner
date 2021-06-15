import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mc extends Actor
{
    private int speed = 2;
    private int vSpeed = 0;
    private int acceleration = 2;  
    private int jumpStrength = -25;
    private int delay = 0;
    private boolean hasGun = false;
    private int face = 1;
    private int reloadTime = 55;
    
    private GreenfootImage img1 = new GreenfootImage("MC1.png");
    private GreenfootImage img2 = new GreenfootImage("MC2.png");
    private GreenfootImage img3 = new GreenfootImage("MC3.png");
    private GreenfootImage img4 = new GreenfootImage("MC5.png");
    
    private GreenfootImage img1L = new GreenfootImage("MC1left.png");
    private GreenfootImage img2L = new GreenfootImage("MC2left.png");
    private GreenfootImage img3L = new GreenfootImage("MC3left.png");
    private GreenfootImage img4L = new GreenfootImage("MC5left.png");
    
    private int frame = 1;
    public void act() 
    {
        checkKeys();
        checkFall();
        jump();
        jump2();
        jump3();
        lasergun();
        delay++; 
        shield(); 
        life();
        die(); 
    }  
    
    public void life()
    {
        int y = getY();
        if (y > 800)
        {
            setLocation(35, 666);
            ((GeneralWorld)getWorld()).lostLife();
        }
    }

    public void checkKeys()
    {
        if( Greenfoot.isKeyDown("left"))
        {
            moveLeftSwitch();
            move(-5);
            face = 2;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            moveRightSwitch();
            move(5);
            face = 1; 
        }
        if(Greenfoot.isKeyDown("up")) 
        {
            jump();
        }

    }
    
    public void jump()  
    {  
        if (Greenfoot.isKeyDown("up") && onPlatform())

        {  
            vSpeed = jumpStrength;  
            fall();  
        }  
    } 
    
    public void jump2()  
    {  
        if (Greenfoot.isKeyDown("up") && onPlatform2())

        {  
            vSpeed = jumpStrength;  
            fall();  
        }  
    } 
    
    public void jump3()  
    {  
        if (Greenfoot.isKeyDown("up") && onPlatform3())

        {  
            vSpeed = jumpStrength;  
            fall();  
        }  
    } 
    
    public void fall()  
    {  
        setLocation(getX(), getY()+vSpeed);  
        vSpeed = vSpeed + acceleration;  
    }  

    public boolean onPlatform()  
    {  
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/4, Platform.class);  
        return under != null;  
    }  
    
    public boolean onPlatform2()  
    {  
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, Lvl2Pf.class);  
        return under != null;  
    }  
    
    public boolean onPlatform3()  
    {  
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, Lvl3Pf.class);  
        return under != null;  
    }  

    public void checkFall()  
    {  
       if (onPlatform() || onPlatform2() || onPlatform3())  
        {  
            vSpeed = 0;  
        }  
        else  
        {  
            fall();  
        }  
    }
    
    public void moveRightSwitch()
    {
        if (frame == 1)
        {
           setImage(img1);
        }
        
        else if (frame == 2)
        {
           setImage(img2); 
        }
        
        else if (frame == 3)
        {
           setImage(img3); 
        }
        
        else if (frame == 4)
        {
           setImage(img4);
           frame = 1;
           return;
        }
        
        frame++;
    }
    
    public void moveLeftSwitch()
    {
        if (frame == 1)
        {
           setImage(img1L);
        }
        
        else if (frame == 2)
        {
           setImage(img2L); 
        }
        
        else if (frame == 3)
        {
           setImage(img3L); 
        }
        
        else if (frame == 4)
        {
           setImage(img4L);
           frame = 1;
           return;
        }
        
        frame++;
    }
    
    public void lasergun(){
        if (isTouching(laser.class)){
            hasGun = true;
            removeTouching(laser.class);
            Greenfoot.playSound("up.wav");
        }
        
        if (isTouching(laser2.class)){
            hasGun = true;
            reloadTime = 35;
            removeTouching(laser2.class);
            Greenfoot.playSound("up.wav");
        }
        
        if (hasGun){
            shoot(); 
        }
    }
    
    public void shoot(){
        if( Greenfoot.isKeyDown("f"))
        {
            if (delay >= reloadTime){
                if(face == 1){
                    getWorld().addObject(new projectile(), getX(), getY());
                    delay = 0; 
                }
                if(face == 2){
                    getWorld().addObject(new projectileL(), getX(), getY());
                    delay = 0; 
                }
            }
        }
    }
    
    public void shield(){
        if (isTouching(shield.class)){
            removeTouching(shield.class);
            Greenfoot.playSound("up.wav");
            ((GeneralWorld)getWorld()).lifeGain();
        }
    }
    
    public void die(){
        if(isTouching(Enemy.class) || (isTouching(Lvl2Emy.class))){
            setLocation(35, 666);
            ((GeneralWorld)getWorld()).lostLife();;
        }
    }
}
