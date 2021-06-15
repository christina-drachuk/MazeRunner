import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class megaLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class megaLaser extends Actor
{
    /**
     * Act - do whatever the megaLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0; 
    public void act() 
    {
        setLocation(getX()+30, (getY()));
        rightScreen();
        timer++; // Add your action code here.
    } 
    
    public void rightScreen(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
