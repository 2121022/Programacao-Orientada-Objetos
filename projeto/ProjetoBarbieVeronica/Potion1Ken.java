import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Potion1Ken extends Actor
{
    public void act() // SE 0 KEN TOCA NA SUA POCAO A MESMA E REMOVIDA E POTION1KEN E TRUE
    {
        if (isTouching(Ken.class)){ 
            getWorldOfType(Game.class).potion1Ken(); 
            getWorldOfType(Game.class).removeObject(this);
        }
    }
}
