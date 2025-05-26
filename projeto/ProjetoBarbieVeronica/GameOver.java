import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{
    public GameOver()
    {    
        super(1300, 700, 1); 
        Greenfoot.playSound("gameover.mp3"); // SOM GAME OVER
        addObject(new ButtonBack(),720,564);
        addObject(new ButtonPlayAgain(),711,478);
        //ADICIONAR BOTOES BACK E PLAY AGAIN 
    }
}
