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
    public void act() 
    {
        checkKeys();
        checkFall();
        jump();
    }  

    public void checkKeys()
    {
        if( Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("up")) 
        {
            jump();
        }

    }
    
    public void jump()  
    {  
        if (Greenfoot.isKeyDown("space") && onPlatform())

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
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, Platform.class);  
        return under != null;  
    }  
    
    public boolean onGround()  
    {  
       Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, ground.class);  
        return under != null;  
    }  

    public void checkFall()  
    {  
       if (onPlatform())  
        {  
            vSpeed = 0;  
        }  
        else  
        {  
            fall();  
        }  
    }
}
