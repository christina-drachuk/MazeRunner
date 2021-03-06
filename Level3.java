import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends GeneralWorld
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    GreenfootSound backgroundMusicThree = new GreenfootSound("level3.mp3");
    public Level3()
    {
        backgroundMusicThree.playLoop();
        backgroundMusicThree.setVolume(30);
        prepare();
        addObject(getMc(),13,695);
    }
    
    public void act()
    {
        showCoins(); 
        if (getMc().getX() >= getWidth()) {
            backgroundMusicThree.stop();
            Greenfoot.setWorld(new Level4());}
        if (lives == 0)
        {
            backgroundMusicThree.stop();
        }    
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        getBackground().drawImage(new GreenfootImage("G", 45, Color.RED, null), 120, 260);
        Lvl3Pf lvl3Pf = new Lvl3Pf();
        addObject(lvl3Pf,24,735);
        Lvl3Pf lvl3Pf2 = new Lvl3Pf();
        addObject(lvl3Pf2,71,734);
        Lvl3Pf lvl3Pf3 = new Lvl3Pf();
        addObject(lvl3Pf3,71,765);
        lvl3Pf3.setLocation(72,784);
        Lvl3Pf lvl3Pf4 = new Lvl3Pf();
        addObject(lvl3Pf4,72,784);
        Lvl3Pf lvl3Pf5 = new Lvl3Pf();
        addObject(lvl3Pf5,23,792);
        Lvl3Pf lvl3Pf6 = new Lvl3Pf();
        addObject(lvl3Pf6,21,765);
        Lvl3Pf lvl3Pf7 = new Lvl3Pf();
        addObject(lvl3Pf7,234,725);
        Lvl3Pf lvl3Pf8 = new Lvl3Pf();
        addObject(lvl3Pf8,282,725);
        Lvl3Pf lvl3Pf9 = new Lvl3Pf();
        addObject(lvl3Pf9,357,643);
        Lvl3Pf lvl3Pf10 = new Lvl3Pf();
        addObject(lvl3Pf10,438,555);
        Lvl3Pf lvl3Pf11 = new Lvl3Pf();
        addObject(lvl3Pf11,484,555);
        Lvl3Pf lvl3Pf12 = new Lvl3Pf();
        addObject(lvl3Pf12,597,780);
        Lvl3Pf lvl3Pf13 = new Lvl3Pf();
        addObject(lvl3Pf13,645,779);
        Lvl3Pf lvl3Pf14 = new Lvl3Pf();
        addObject(lvl3Pf14,689,778);
        Lvl3Pf lvl3Pf15 = new Lvl3Pf();
        addObject(lvl3Pf15,731,777);
        Lvl3Pf lvl3Pf16 = new Lvl3Pf();
        addObject(lvl3Pf16,800,717);
        Lvl3Pf lvl3Pf17 = new Lvl3Pf();
        addObject(lvl3Pf17,905,670);
        Lvl3Pf lvl3Pf18 = new Lvl3Pf();
        addObject(lvl3Pf18,1007,596);
        Lvl3Pf lvl3Pf19 = new Lvl3Pf();
        addObject(lvl3Pf19,1054,596);
        Lvl3Pf lvl3Pf20 = new Lvl3Pf();
        addObject(lvl3Pf20,933,526);
        Lvl3Pf lvl3Pf21 = new Lvl3Pf();
        addObject(lvl3Pf21,886,525);
        Lvl3Pf lvl3Pf22 = new Lvl3Pf();
        addObject(lvl3Pf22,24,378);
        Lvl3Pf lvl3Pf23 = new Lvl3Pf();
        addObject(lvl3Pf23,71,379);
        Lvl3Pf lvl3Pf24 = new Lvl3Pf();
        addObject(lvl3Pf24,24,107);
        Lvl3Pf lvl3Pf25 = new Lvl3Pf();
        addObject(lvl3Pf25,72,108);
        Lvl3Pf lvl3Pf26 = new Lvl3Pf();
        addObject(lvl3Pf26,120,109);
        Lvl3Pf lvl3Pf27 = new Lvl3Pf();
        addObject(lvl3Pf27,170,109);
        Lvl3Pf lvl3Pf28 = new Lvl3Pf();
        addObject(lvl3Pf28,824,468);
        Lvl3Pf lvl3Pf29 = new Lvl3Pf();
        addObject(lvl3Pf29,759,396);
        Lvl3Pf lvl3Pf30 = new Lvl3Pf();
        addObject(lvl3Pf30,710,393);
        Lvl3Pf lvl3Pf31 = new Lvl3Pf();
        addObject(lvl3Pf31,635,313);
        Lvl3Pf lvl3Pf32 = new Lvl3Pf();
        addObject(lvl3Pf32,849,314);
        Lvl3Pf lvl3Pf33 = new Lvl3Pf();
        addObject(lvl3Pf33,571,274);
        Lvl3Pf lvl3Pf34 = new Lvl3Pf();
        addObject(lvl3Pf34,396,280);
        Lvl3Pf lvl3Pf35 = new Lvl3Pf();
        addObject(lvl3Pf35,287,194);
        Lvl3Pf lvl3Pf36 = new Lvl3Pf();
        addObject(lvl3Pf36,238,193);
        Lvl3Pf lvl3Pf37 = new Lvl3Pf();
        addObject(lvl3Pf37,121,379);
        Lvl3Pf lvl3Pf38 = new Lvl3Pf();
        addObject(lvl3Pf38,1127,715);
        Lvl3Pf lvl3Pf39 = new Lvl3Pf();
        addObject(lvl3Pf39,1175,714);
        Lvl3Pf lvl3Pf40 = new Lvl3Pf();
        addObject(lvl3Pf40,1291,650);
        Lvl3Pf lvl3Pf41 = new Lvl3Pf();
        addObject(lvl3Pf41,1393,603);
        Lvl3Pf lvl3Pf42 = new Lvl3Pf();
        addObject(lvl3Pf42,899,314);
        Lvl3Pf lvl3Pf43 = new Lvl3Pf();
        addObject(lvl3Pf43,1015,251);
        Lvl3Pf lvl3Pf44 = new Lvl3Pf();
        addObject(lvl3Pf44,1162,250);
        Lvl3Pf lvl3Pf45 = new Lvl3Pf();
        addObject(lvl3Pf45,1301,250);
        Lvl3Pf lvl3Pf46 = new Lvl3Pf();
        addObject(lvl3Pf46,1378,192);
        Lvl3Pf lvl3Pf47 = new Lvl3Pf();
        addObject(lvl3Pf47,1426,192);
        Lvl3Pf lvl3Pf48 = new Lvl3Pf();
        addObject(lvl3Pf48,1501,272);
        Lvl3Pf lvl3Pf49 = new Lvl3Pf();
        addObject(lvl3Pf49,1550,271);
        Lvl3Pf lvl3Pf50 = new Lvl3Pf();
        addObject(lvl3Pf50,1442,603);
        Lvl3Pf lvl3Pf51 = new Lvl3Pf();
        addObject(lvl3Pf51,1546,551);
        Lvl3Pf lvl3Pf52 = new Lvl3Pf();
        addObject(lvl3Pf52,1595,553);
        Lvl3Pf lvl3Pf53 = new Lvl3Pf();
        addObject(lvl3Pf53,1643,554);
        Lvl3Pf lvl3Pf54 = new Lvl3Pf();
        addObject(lvl3Pf54,1676,553);
        Lvl3Pf lvl3Pf55 = new Lvl3Pf();
        addObject(lvl3Pf55,1679,161);
        Lvl3Pf lvl3Pf56 = new Lvl3Pf();
        addObject(lvl3Pf56,1629,160);
        shield shield = new shield();
        addObject(shield,23,64);
        shield shield2 = new shield();
        addObject(shield2,736,347);
        shield shield3 = new shield();
        addObject(shield3,68,334);
        shield shield4 = new shield();
        addObject(shield4,1522,229);
        laser2 laser2 = new laser2();
        addObject(laser2,267,680);
        lvl3Pf3.setLocation(70,765);
        Lvl3Pf lvl3Pf57 = new Lvl3Pf();
        addObject(lvl3Pf57,70,765);
        laser laser = new laser();
        addObject(laser,44,709);
        laser2 laser22 = new laser2();
        addObject(laser22,80,291);
        removeObject(laser2);
        removeObject(laser22);
        addObject(laser2,471,510);
        Lvl3Emy lvl3Emy = new Lvl3Emy();
        addObject(lvl3Emy,1641,481);
        Lvl3Emy lvl3Emy2 = new Lvl3Emy();
        addObject(lvl3Emy2,1433,538);
        Lvl3Emy lvl3Emy3 = new Lvl3Emy();
        addObject(lvl3Emy3,1161,652);
        Lvl3Emy lvl3Emy4 = new Lvl3Emy();
        addObject(lvl3Emy4,916,459);
        Lvl3Emy lvl3Emy5 = new Lvl3Emy();
        addObject(lvl3Emy5,709,710);
        laser2.setLocation(473,489);
        Lvl3Emy lvl3Emy6 = new Lvl3Emy();
        addObject(lvl3Emy6,473,489);
        lvl3Emy5.setLocation(677,700);
        Lvl3Emy lvl3Emy7 = new Lvl3Emy();
        addObject(lvl3Emy7,1398,124);
        Lvl3Emy lvl3Emy8 = new Lvl3Emy();
        addObject(lvl3Emy8,1662,99);
        Lvl3Emy lvl3Emy9 = new Lvl3Emy();
        addObject(lvl3Emy9,889,250);
        Lvl3Emy lvl3Emy10 = new Lvl3Emy();
        addObject(lvl3Emy10,271,129);
        Lvl3Emy lvl3Emy11 = new Lvl3Emy();
        addObject(lvl3Emy11,114,45);
        Lvl3Emy lvl3Emy12 = new Lvl3Emy();
        addObject(lvl3Emy12,59,311);
        Lvl3Emy lvl3Emy13 = new Lvl3Emy();
        addObject(lvl3Emy13,258,654);
        shield.setLocation(41,49);
        Lvl3Emy lvl3Emy14 = new Lvl3Emy();
        addObject(lvl3Emy14,41,49);
        laser.setLocation(36,700);
        shield shield5 = new shield();
        addObject(shield5,36,700);
        lvl3Emy4.setLocation(933,461);
        lvl3Emy9.setLocation(895,258);
        laser2.setLocation(488,473);
        lvl3Emy13.setLocation(285,641);
        lvl3Emy11.setLocation(131,48);
        shield.setLocation(45,53);
        lvl3Emy10.setLocation(272,132);
        lvl3Emy7.setLocation(1420,119);
        laser3 laser3 = new laser3();
        addObject(laser3,69,284);
        lvl3Emy11.setLocation(110,60);
        laser4 laser4 = new laser4();
        addObject(laser4,110,60);
        lvl3Emy12.setLocation(79,247);
        lvl3Emy4.setLocation(1036,524);
        lvl3Emy9.setLocation(1005,176);
        Lvl3Emy lvl3Emy15 = new Lvl3Emy();
        addObject(lvl3Emy15,1573,488);
        coin coin = new coin();
        addObject(coin,359,591);
        coin coin2 = new coin();
        addObject(coin2,569,228);
        coin coin3 = new coin();
        addObject(coin3,907,617);
        coin coin4 = new coin();
        addObject(coin4,1296,601);
        coin coin5 = new coin();
        addObject(coin5,1165,197);
        coin coin6 = new coin();
        addObject(coin6,181,62);
        coin coin7 = new coin();
        addObject(coin7,21,332);
        coin coin8 = new coin();
        addObject(coin8,1609,510);
        coin coin9 = new coin();
        addObject(coin9,1625,118);
    }
}
