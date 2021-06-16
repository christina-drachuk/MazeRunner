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
    GreenfootSound backgroundMusicFour = new GreenfootSound("BOSS FIGHT.mp3");
    public Level4()
    {
        addObject(getMc(),30,690);
        prepare();
        backgroundMusicFour.playLoop();
        backgroundMusicFour.setVolume(30);
        
    }

    public void act()
    {
        if (lives == 0)
        {
            backgroundMusicFour.stop();
        }
        
        if(Boss.health <= 0){
           backgroundMusicFour.stop(); 
        }
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
        shield shield = new shield();
        addObject(shield,19,704);
        shield shield2 = new shield();
        addObject(shield2,37,703);
        laser3 laser3 = new laser3();
        addObject(laser3,48,701);
        laser4 laser4 = new laser4();
        addObject(laser4,505,456);
        Lvl2Pf lvl2Pf = new Lvl2Pf();
        addObject(lvl2Pf,498,362);
        Lvl2Pf lvl2Pf2 = new Lvl2Pf();
        addObject(lvl2Pf2,501,496);
        Lvl2Pf lvl2Pf3 = new Lvl2Pf();
        addObject(lvl2Pf3,366,443);
        Lvl2Pf lvl2Pf4 = new Lvl2Pf();
        addObject(lvl2Pf4,270,513);
        Lvl2Pf lvl2Pf5 = new Lvl2Pf();
        addObject(lvl2Pf5,178,592);
        Lvl2Pf lvl2Pf6 = new Lvl2Pf();
        addObject(lvl2Pf6,102,675);
        removeObject(laser3);
        addObject(laser3,501,307);
        laser2 laser2 = new laser2();
        addObject(laser2,37,709);
        Boss boss = new Boss();
        addObject(boss,1396,466);
        boss.setLocation(1411,458);
        boss.setLocation(1411,479);
        shield shield3 = new shield();
        addObject(shield3,40,700);
        shield shield4 = new shield();
        addObject(shield4,15,697);
        shield shield5 = new shield();
        addObject(shield5,488,708);
        shield shield6 = new shield();
        addObject(shield6,1029,703);
        coin coin = new coin();
        addObject(coin,109,632);
        coin coin2 = new coin();
        addObject(coin2,187,544);
        coin coin3 = new coin();
        addObject(coin3,265,470);
        coin coin4 = new coin();
        addObject(coin4,375,391);
        coin coin5 = new coin();
        addObject(coin5,498,320);
        laser4.setLocation(501,446);
        coin coin6 = new coin();
        addObject(coin6,501,446);
        coin coin7 = new coin();
        addObject(coin7,642,700);
        coin coin8 = new coin();
        addObject(coin8,859,698);
        boss.setLocation(1180,692);
        coin coin9 = new coin();
        addObject(coin9,1180,692);
        boss.setLocation(1420,699);
        coin coin10 = new coin();
        addObject(coin10,1420,699);
        boss.setLocation(1611,699);
        coin coin11 = new coin();
        addObject(coin11,1611,699);
    }
}
