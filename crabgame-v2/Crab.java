import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private int contador;

    public Crab()
    {
        contador=0; //inicializar a 0
    }
    
    public void act()
    {
        move(5);
        //turnAtEdge();
        //lookForWorm();
        checkKeyPress();
        lookForWorm();
    }
     
    public void checkKeyPress()
    { 
        if (Greenfoot.isKeyDown("A"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("L"))
        {
            turn(5);
        }
        
    }
    
    /**
     * This method is used for the the crab to eat a worm if it sees one
     */
    public void lookForWorm()
    {
        if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            contador++; //incrementar
        }
        
        if (contador == 6)
        {
              Greenfoot.playSound("fanfare.wav");
              Greenfoot.stop();
        }
    }
     /**
     * This method is used for the the crab to turn when at the edge of the world
     */
    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn (17);
        }
    }
}


