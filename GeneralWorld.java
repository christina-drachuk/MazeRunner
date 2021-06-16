import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GeneralWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneralWorld extends World
{
    private Mc mc;
    //MyWorld myWorld = getWorld();
    public static int lives;
    public static int coins;
    /**
     * Constructor for objects of class GeneralWorld.
     * 
     */
    public GeneralWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1700, 800, 1, false);
        this.mc = new Mc();
        lives = 3;
        coins = 0;
        showCoins();
    }
    
    public Mc getMc()
    {
        return mc;
    }

    public void lostLife()
    {
        lives--;
        drawLives();
        if (lives == 0)
        {
            GreenfootImage image = new GreenfootImage("GAME OVER", 120, Color.RED, null);
            getBackground().drawImage(image, 850-image.getWidth()/2, 400-image.getHeight()/2);
            //removeObjects(getObjects(Mc.class));
            Greenfoot.stop();
        }
    }
    
    public void lifeGain()
    {
        lives++;
        drawLives();
    }
    
    public void drawLives()
    {
        removeObjects(getObjects(Heart.class));
        for (int i = 0; i != lives; i++)
        {
            Heart heart = new Heart();
            addObject(heart, 20 + 25 * i, 20);
        }
    }
    
    public void addCoins(int score){
        coins += score;
    }
    
    public void showCoins(){
        showText("Score: " + coins, 50, 70);
    }
}
