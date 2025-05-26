import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        randomTurn();
        turnAtEdge();
        lookForCrab();
        avoidRock();
    }
    
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100)<10)
        {
        turn(Greenfoot.getRandomNumber(81)-40);
    }
    
    }
    
    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(20);
        }
    }
    
    public void lookForCrab()
    {
        if (isTouching(Crab.class))
        {
        removeTouching(Crab.class);
        Greenfoot.playSound("au.wav");
        Greenfoot.stop();
        }
    }
    
    public void avoidRock()
    {
        if (isTouching(Rock.class))
        {
            turn(20);
        }
    }
}
