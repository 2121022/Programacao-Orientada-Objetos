import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mascara2 extends Makeup
{
    public void act(){
        rightToLeft(); //MOVEM SE DA DIREITA P ESQUERDA
    }    
    
    public void rightToLeft(){
        move(-5);
        if(getX()==0) getWorld().removeObject(this); 
        //MOVEM SE E DESAPARECEM QND CHEGAM NO LADO ESQUERDO
    }
}
