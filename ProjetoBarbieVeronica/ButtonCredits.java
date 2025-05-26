import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ButtonCredits extends Button
{
    public ButtonCredits() //DIMINUI O TAMANHO
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
    Greenfoot.setWorld(new Credits()); // DA-NOS OS AUTORES
    sound(); //SOM AO CLICAR
    }
    }
}
