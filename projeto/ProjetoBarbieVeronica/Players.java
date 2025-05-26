import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Players extends Actor
{
    private Boolean sound; 
    //SOM PARA QUANDO SAO ATINGIDOS COMECA A FALSE E SO HA SOM NA PRIMEIRA QUE TOCA
    public void hitAudio()
    {
        if(isTouching(Makeup.class)){
            if (sound==false){ 
                Greenfoot.playSound("hitSound1.mp3");
            }
            sound=true;
        }
        else sound=false;
    }
}
