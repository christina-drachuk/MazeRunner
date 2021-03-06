import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends GeneralWorld
{
    Mc mc = new Mc();
    /**
     * Constructor for objects of class Level2.
     * 
     */
    GreenfootSound backgroundMusicTwo = new GreenfootSound("bensound-dance.mp3");
    public Level2()
    {
        
        prepare();
        backgroundMusicTwo.playLoop();
        backgroundMusicTwo.setVolume(30);
        addObject(getMc(),8,702);
        if (lives != 0)
            drawLives();
    }

    public void act()
    {
        showCoins(); 
        if (getMc().getX() >= getWidth()) {
            backgroundMusicTwo.pause();
            Greenfoot.setWorld(new Level3());}
         if (lives == 0)
        {
            backgroundMusicTwo.stop();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lvl2Pf lvl2Pf = new Lvl2Pf();
        addObject(lvl2Pf,24,730);
        Lvl2Pf lvl2Pf2 = new Lvl2Pf();
        addObject(lvl2Pf2,69,723);
        Lvl2Pf lvl2Pf3 = new Lvl2Pf();
        addObject(lvl2Pf3,104,725);
        Lvl2Pf lvl2Pf4 = new Lvl2Pf();
        addObject(lvl2Pf4,209,690);
        Lvl2Pf lvl2Pf5 = new Lvl2Pf();
        addObject(lvl2Pf5,319,743);
        Lvl2Pf lvl2Pf6 = new Lvl2Pf();
        addObject(lvl2Pf6,424,693);
        Lvl2Pf lvl2Pf7 = new Lvl2Pf();
        addObject(lvl2Pf7,510,647);
        Lvl2Pf lvl2Pf8 = new Lvl2Pf();
        addObject(lvl2Pf8,586,646);
        Lvl2Pf lvl2Pf9 = new Lvl2Pf();
        addObject(lvl2Pf9,630,623);
        Lvl2Pf lvl2Pf10 = new Lvl2Pf();
        addObject(lvl2Pf10,691,573);
        Lvl2Pf lvl2Pf11 = new Lvl2Pf();
        addObject(lvl2Pf11,721,577);
        Lvl2Pf lvl2Pf12 = new Lvl2Pf();
        addObject(lvl2Pf12,758,560);
        Lvl2Pf lvl2Pf13 = new Lvl2Pf();
        addObject(lvl2Pf13,824,504);
        Lvl2Pf lvl2Pf14 = new Lvl2Pf();
        addObject(lvl2Pf14,890,549);
        Lvl2Pf lvl2Pf15 = new Lvl2Pf();
        addObject(lvl2Pf15,930,543);
        Lvl2Pf lvl2Pf16 = new Lvl2Pf();
        addObject(lvl2Pf16,1007,493);
        Lvl2Pf lvl2Pf17 = new Lvl2Pf();
        addObject(lvl2Pf17,1049,499);
        Lvl2Pf lvl2Pf18 = new Lvl2Pf();
        addObject(lvl2Pf18,1086,498);
        Lvl2Pf lvl2Pf19 = new Lvl2Pf();
        addObject(lvl2Pf19,1168,519);
        Lvl2Pf lvl2Pf20 = new Lvl2Pf();
        addObject(lvl2Pf20,1265,542);
        Lvl2Pf lvl2Pf21 = new Lvl2Pf();
        addObject(lvl2Pf21,1358,493);
        Lvl2Pf lvl2Pf22 = new Lvl2Pf();
        addObject(lvl2Pf22,1403,494);
        Lvl2Pf lvl2Pf23 = new Lvl2Pf();
        addObject(lvl2Pf23,1498,490);
        Lvl2Pf lvl2Pf24 = new Lvl2Pf();
        addObject(lvl2Pf24,1538,466);
        Lvl2Pf lvl2Pf25 = new Lvl2Pf();
        addObject(lvl2Pf25,1611,412);
        Lvl2Pf lvl2Pf26 = new Lvl2Pf();
        addObject(lvl2Pf26,1647,391);
        Lvl2Pf lvl2Pf27 = new Lvl2Pf();
        addObject(lvl2Pf27,1681,368);
        Lvl2Pf lvl2Pf28 = new Lvl2Pf();
        addObject(lvl2Pf28,745,446);
        Lvl2Pf lvl2Pf29 = new Lvl2Pf();
        addObject(lvl2Pf29,607,443);
        Lvl2Pf lvl2Pf30 = new Lvl2Pf();
        addObject(lvl2Pf30,489,441);
        Lvl2Pf lvl2Pf31 = new Lvl2Pf();
        addObject(lvl2Pf31,411,383);
        Lvl2Pf lvl2Pf32 = new Lvl2Pf();
        addObject(lvl2Pf32,362,381);
        addObject(lvl2Pf32,369,383);
        Lvl2Pf lvl2Pf33 = new Lvl2Pf();
        addObject(lvl2Pf33,321,382);
        Lvl2Pf lvl2Pf34 = new Lvl2Pf();
        addObject(lvl2Pf34,253,470);
        Lvl2Pf lvl2Pf35 = new Lvl2Pf();
        addObject(lvl2Pf35,176,429);
        Lvl2Pf lvl2Pf36 = new Lvl2Pf();
        addObject(lvl2Pf36,104,375);
        Lvl2Pf lvl2Pf37 = new Lvl2Pf();
        addObject(lvl2Pf37,18,320);

        Lvl2Emy lvl2Emy = new Lvl2Emy();
        addObject(lvl2Emy,364,333);
        Lvl2Emy lvl2Emy2 = new Lvl2Emy();
        addObject(lvl2Emy2,1381,447);
        Lvl2Emy lvl2Emy3 = new Lvl2Emy();
        addObject(lvl2Emy3,1050,454);
        removeObject(lvl2Pf20);
        addObject(lvl2Pf20,1309,493);
        lvl2Emy2.setLocation(1354,445);

        laser laser = new laser();
        addObject(laser,8,702);
        shield shield = new shield();
        addObject(shield,1168,477);
        shield shield2 = new shield();
        addObject(shield2,106,332);
        laser2 laser2 = new laser2();
        addObject(laser2,40,284);
        laser2.setLocation(25,285);
        shield shield3 = new shield();
        addObject(shield3,25,285);
        laser2.setLocation(123,279);
        removeObject(shield3);
        laser2.setLocation(31,302);
        removeObject(shield2);
        shield shield4 = new shield();
        addObject(shield4,28,698);
        coin coin = new coin();
        addObject(coin,207,640);
        coin coin2 = new coin();
        addObject(coin2,508,603);
        coin coin3 = new coin();
        addObject(coin3,608,399);
        coin coin4 = new coin();
        addObject(coin4,176,387);
        coin coin5 = new coin();
        addObject(coin5,910,496);
        coin coin6 = new coin();
        addObject(coin6,1535,418);
        coin coin7 = new coin();
        addObject(coin7,1677,325);
    }
}
