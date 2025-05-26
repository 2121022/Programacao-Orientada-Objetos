import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ButtonHelp extends Button
{
    public ButtonHelp() //DIMINUI O TAMANHO
    {
            GreenfootImage imagem = getImage();
            int y = imagem.getHeight();
            int x = imagem.getWidth();
            imagem.scale(x/4,y/4);
    }
    
    public void act()
    {
        clickSound();
    }
    
    public void clickSound()
    {
    if(Greenfoot.mouseClicked(this))
    {
    Greenfoot.setWorld(new Help()); //INSTRUCOES DO JOGO
    sound(); //SOM AO CLICAR
    }
    }
}
