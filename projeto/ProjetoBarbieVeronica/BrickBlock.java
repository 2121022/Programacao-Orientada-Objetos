import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BrickBlock extends Actor
{
    public BrickBlock(){
        this(105,30); //TAMANHO DO BLOCO
    }
    //OVERLOADING
    public BrickBlock(int width,int height){
        GreenfootImage image = getImage();
        image.scale(width,height);
        setImage(image);
    }
    // DA A ALTURA E COMPRIMENTO
}
