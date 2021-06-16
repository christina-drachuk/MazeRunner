import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends GeneralWorld
{
    GreenfootSound backgroundMusicSix = new GreenfootSound("rickroll.mp3");
    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6()
    {
        showText("Congratulations...you made it!", 800, 450);
        
        backgroundMusicSix.playLoop();
        backgroundMusicSix.setVolume(50);
    }
}
