import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Potion2Barbie extends Actor
{
    public void act() // SE A BARBIE TOCA NA SUA POCAO A MESMA E REMOVIDA E POTION2BARBIE E TRUE
    {
        if (isTouching(Barbie.class)){ 
            getWorldOfType(Game.class).potion2Barbie(); 
            getWorldOfType(Game.class).removeObject(this);
        }
    }
}
