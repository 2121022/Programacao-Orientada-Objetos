import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Heel1 extends Makeup
{
    public void act()
    {
       leftToRight(); //MOVEM SE DA ESQUERDA P DIREITA
    }
    
    public void leftToRight(){
        move(5);
        if(getX()==getWorld().getWidth()-10)  getWorld().removeObject(this);
        //MOVEM SE E DESAPARECEM QND CHEGAM NO LADO DIREITO
    }
}
