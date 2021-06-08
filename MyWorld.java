import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1700, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ground ground = new ground();
        addObject(ground,255,749);
        ground ground2 = new ground();
        addObject(ground2,767,743);
        ground ground3 = new ground();
        addObject(ground3,1255,746);
        ground ground4 = new ground();
        addObject(ground4,1639,746);
        Platform platform = new Platform();
        addObject(platform,259,645);
        Platform platform2 = new Platform();
        addObject(platform2,413,646);
        Platform platform3 = new Platform();
        addObject(platform3,563,571);
        Platform platform4 = new Platform();
        addObject(platform4,631,572);
        Platform platform5 = new Platform();
        addObject(platform5,687,559);
        Platform platform6 = new Platform();
        addObject(platform6,759,558);
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
        Mc mc = new Mc();
        addObject(mc,35,666);
    }
}
