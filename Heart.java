import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    /**
     * Act - do whatever the heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Heart()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(myImage.getWidth()/25, myImage.getHeight()/25);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
