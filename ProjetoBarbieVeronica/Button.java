import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    public void act()
    {
        clickSound();
    }
    
    public void clickSound()
    {
    if(Greenfoot.mouseClicked(this))
    {
    Greenfoot.setWorld(new Game()); //COMECA O JOGO CASO SEJA CLICADO NO BOTAO. VAI SER HERDADO PELO PLAY 
    sound();
    }
    }

    public void sound ()
    {
    Greenfoot.playSound("ButtonSound.mp3");
    }
}
