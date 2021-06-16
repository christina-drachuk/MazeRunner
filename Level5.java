import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends GeneralWorld
{
    GreenfootSound backgroundMusicFive = new GreenfootSound("StairwayToHeaven.mp3");
    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
    {
        addObject(getMc(),30,690);
        backgroundMusicFive.playLoop();
        backgroundMusicFive.setVolume(30);
        prepare();
    }
    
    public void act()
    {
       if (getMc().getX() >= getWidth()) {
            backgroundMusicFive.stop();
            Greenfoot.setWorld(new Level6());} 
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        W5Platform w5Platform = new W5Platform();
        addObject(w5Platform,64,756);
        W5Platform w5Platform2 = new W5Platform();
        addObject(w5Platform2,187,711);
        W5Platform w5Platform3 = new W5Platform();
        addObject(w5Platform3,346,666);
        W5Platform w5Platform4 = new W5Platform();
        addObject(w5Platform4,527,590);
        W5Platform w5Platform5 = new W5Platform();
        addObject(w5Platform5,703,508);
        W5Platform w5Platform6 = new W5Platform();
        addObject(w5Platform6,881,461);
        W5Platform w5Platform7 = new W5Platform();
        addObject(w5Platform7,1053,419);
        W5Platform w5Platform8 = new W5Platform();
        addObject(w5Platform8,1224,375);
        W5Platform w5Platform9 = new W5Platform();
        addObject(w5Platform9,1291,375);
        w5Platform9.setLocation(1375,374);
        W5Platform w5Platform10 = new W5Platform();
        addObject(w5Platform10,1375,374);
        W5Platform w5Platform11 = new W5Platform();
        addObject(w5Platform11,1512,334);
        W5Platform w5Platform12 = new W5Platform();
        addObject(w5Platform12,1623,295);
    }
}
