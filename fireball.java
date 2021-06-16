import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireball extends Actor
{
    int direction = Greenfoot.getRandomNumber(15);
    int speed = Greenfoot.getRandomNumber(35)+5;
    /**
     * Act - do whatever the fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-direction, (getY()+speed));
        rightScreen();// Add your action code here.
    } 
    
    public void rightScreen(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
