import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        //prepare();
        populateWorld();
        setBackground("bluerock.jpg");
    }
    
    public void populateWorld()
    {
        for (int i=0;i<6;i++)
        {
            Worm worm = new Worm();
            addObject(worm,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        addObject(new Lobster(),getWidth(),getHeight());
        addObject(new Lobster(),0,getHeight());
        addObject(new Lobster(),getWidth(),0);
        addObject(new Lobster(),0,0);
        
        addObject(new Crab(),getWidth()/2,getHeight()/2);
        
        addObject(new Rock(),200,200);
        addObject(new Rock(),400,400);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,137,197);
        Worm worm = new Worm();
        addObject(worm,376,326);
        Worm worm2 = new Worm();
        addObject(worm2,258,383);
    }
}