import greenfoot.*;  

public class ButtonPlay extends Button
{
    public ButtonPlay() //DIMINUIR TAMANHO
    {
            GreenfootImage imagem = getImage();
            int y = imagem.getHeight();
            int x = imagem.getWidth();
            imagem.scale(x/4,y/4);
    }
}
