import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ButtonMainMenu extends Button
{
    public ButtonMainMenu() //DIMINUI TAMANHO
    {
            GreenfootImage imagem = getImage();
            int y = imagem.getHeight();
            int x = imagem.getWidth();
            imagem.scale(x/3,y/3);
    }

    public void act()
    {
        clickSound();
    }

    public void clickSound(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Background()); //VAI PARA O BACKGROUND INICIAL
            sound(); //SOM AO CLICAR
        }
    } 
}
