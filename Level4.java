import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends GeneralWorld
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {
        addObject(getMc(),13,695);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lvl4Pf lvl4Pf = new Lvl4Pf();
        addObject(lvl4Pf,126,760);
        Lvl4Pf lvl4Pf2 = new Lvl4Pf();
        addObject(lvl4Pf2,380,760);
        Lvl4Pf lvl4Pf3 = new Lvl4Pf();
        addObject(lvl4Pf3,635,758);
        Lvl4Pf lvl4Pf4 = new Lvl4Pf();
        addObject(lvl4Pf4,886,757);
        Lvl4Pf lvl4Pf5 = new Lvl4Pf();
        addObject(lvl4Pf5,1137,756);
        Lvl4Pf lvl4Pf6 = new Lvl4Pf();
        addObject(lvl4Pf6,1389,753);
        Lvl4Pf lvl4Pf7 = new Lvl4Pf();
        addObject(lvl4Pf7,1574,751);
    }
}
