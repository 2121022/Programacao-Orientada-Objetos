import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ButtonBarbie extends Button
{
  public ButtonBarbie() //AUMENTAR TAMANHO
    {
            GreenfootImage imagem = getImage();
            int y = imagem.getHeight();
            int x = imagem.getWidth();
            imagem.scale(x*2,y*2);
    }
    
public void act()
    {
        clickSound();
    }
    
    public void clickSound()
    {
    if(Greenfoot.mouseClicked(this))
    {
    Greenfoot.setWorld(new StartMenu()); //DPS DE CLICAR NO BOTAO BARBIE VAI PARA O START MENU
    sound(); //SOM AO CLICAR
    }
}
}
