import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends GeneralWorld
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootSound backgroundMusicOne = new GreenfootSound("bensound-thelounge.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
        addObject(getMc(),35,666);
        prepare();
        if (lives != 0)
            drawLives();
        backgroundMusicOne.playLoop();
        backgroundMusicOne.setVolume(40);
    }

    
    public void act()
    {
        showCoins(); 
        if (getMc().getX() >= getWidth()) {
            backgroundMusicOne.pause();
            Greenfoot.setWorld(new Level2());}
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        getBackground().drawImage(new GreenfootImage("Use arrow keys to move", 45, null, null), 490, 610);
        getBackground().drawImage(new GreenfootImage("Throughout this game, items will boost your reload speed and give you special powers", 45, Color.YELLOW, null), 100, 70);
        getBackground().drawImage(new GreenfootImage("Press f to shoot ->", 20, null, null), 250, 575);
        getBackground().drawImage(new GreenfootImage("Shields give an extra heart->", 20, null, null), 840, 500);
        Platform platform = new Platform();
        addObject(platform,259,645);
        Platform platform2 = new Platform();
        addObject(platform2,413,646);
        Platform platform3 = new Platform();
        addObject(platform3,563,571);
        Platform platform4 = new Platform();
        addObject(platform4,631,572);
        Platform platform7 = new Platform();
        addObject(platform7,821,573);
        Platform platform8 = new Platform();
        addObject(platform8,945,635);
        Platform platform9 = new Platform();
        addObject(platform9,1078,575);
        Platform platform10 = new Platform();
        addObject(platform10,1204,493);
        Platform platform11 = new Platform();
        addObject(platform11,1373,487);
        Platform platform12 = new Platform();
        addObject(platform12,1640,485);
        Platform platform13 = new Platform();
        addObject(platform13,1447,488);
        Platform platform14 = new Platform();
        addObject(platform14,1503,452);
        Platform platform15 = new Platform();
        addObject(platform15,1640,362);
        removeObject(platform12);

        Platform platform16 = new Platform();
        addObject(platform16,25,753);
        platform16.setLocation(70,751);
        Platform platform17 = new Platform();
        addObject(platform17,70,751);
        platform17.setLocation(115,757);
        Platform platform18 = new Platform();
        addObject(platform18,115,757);
        platform17.setLocation(102,793);
        Platform platform19 = new Platform();
        addObject(platform19,102,793);
        platform16.setLocation(61,794);
        Platform platform20 = new Platform();
        addObject(platform20,61,794);
        platform16.setLocation(12,779);
        Platform platform21 = new Platform();
        addObject(platform21,12,779);
        platform16.setLocation(44,756);
        Platform platform22 = new Platform();
        addObject(platform22,44,756);
        platform16.setLocation(12,757);
        Platform platform23 = new Platform();
        addObject(platform23,12,757);
        platform16.setLocation(26,783);
        Platform platform24 = new Platform();
        addObject(platform24,26,783);
        shield shield = new shield();
        addObject(shield,1079,507);
        laser laser = new laser();
        addObject(laser,418,583);
        Platform platform5 = new Platform();
        addObject(platform5,753,572);
        Platform platform6 = new Platform();
        addObject(platform6,692,573);
        Enemy enemy = new Enemy();
        addObject(enemy,733,511);
        coin coin = new coin();
        addObject(coin,124,687);
        coin coin2 = new coin();
        addObject(coin2,555,510);
        coin coin3 = new coin();
        addObject(coin3,783,509);
        coin coin4 = new coin();
        addObject(coin4,945,575);
        coin coin5 = new coin();
        addObject(coin5,1506,392);
        coin coin6 = new coin();
        addObject(coin6,1639,299);
    }
    
}
