import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ButtonBack extends Button
{
      public ButtonBack() //DIMINUR TAMANHO
    {
            GreenfootImage imagem = getImage();
            int y = imagem.getHeight();
            int x = imagem.getWidth();
            imagem.scale(x/6,y/6);
    }
    
    public void act() 
    {
        clickSound();
    }
    
    public void clickSound()
    {
    if(Greenfoot.mouseClicked(this))
    {
    Greenfoot.setWorld(new StartMenu()); //VAI PARA O STARTMENU
    sound(); //SOM AO CLICAR
    }
}
}
