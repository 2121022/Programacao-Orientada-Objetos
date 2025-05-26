import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Potion2Ken extends Actor
{
    public void act() // SE 0 KEN TOCA NA SUA POCAO A MESMA E REMOVIDA E POTION2KEN E TRUE
    {
        if (isTouching(Ken.class)){ 
            getWorldOfType(Game.class).potion2Ken(); 
            getWorldOfType(Game.class).removeObject(this);
        }
    }
}
