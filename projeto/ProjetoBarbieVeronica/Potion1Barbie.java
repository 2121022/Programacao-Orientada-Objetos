import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Potion1Barbie extends Actor
{
    public void act() // SE A BARBIE TOCA NA SUA POCAO A MESMA E REMOVIDA E POTION1BARBIE E TRUE
    {
        if (isTouching(Barbie.class)){ 
            getWorldOfType(Game.class).potion1Barbie(); 
            getWorldOfType(Game.class).removeObject(this);
        }
    }
}
