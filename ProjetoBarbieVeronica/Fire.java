import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fire extends Actor
{
    //DECLARACAO DE VARIAVEIS PARA FOGO ESPELHADO
    private GreenfootImage Fire1;
    private GreenfootImage Fire2;
    private int contador;
    private boolean FireBarbie;
    private boolean FireKen;
    
    public Fire()
    {
    Fire1 = new GreenfootImage("portal.png");
    Fire2 = new GreenfootImage("portalBack.png");
    setImage(Fire2); //PRIMEIRA IMAGEM
    }
    public void act()
    {
    moveFire();
    fireDeathBarbie();
    fireDeathKen(); 
    }
    //ANIMACAO DO FOGO COM AS IMAGENS ESPELHADAS
    public void moveFire(){
        contador++;
        if(contador==10){ // QND CHEGA A 10, FREQUENCIA COM QUE TROCA
            if(getImage() == Fire1) setImage(Fire2); //MUDA
            else setImage(Fire1);
            contador=0;
        }
    }
    //SE A BARBIE CAI NO FOGO OU TOCA NO FOGO MORRE INSTANTANEAMENTE
    public void fireDeathBarbie(){
        if(isTouching(Barbie.class)){ //SE HA INTERACAO
            if(FireBarbie ==false){ //REMOVE PONTOS APENAS UMA VEZ
                removeTouching(Barbie.class); //REMOVE CLASSE
                getWorldOfType(Game.class).setBarbieHP(0); 
            }
            FireBarbie = true;
        }
        else FireBarbie=false;
    }
    //SE O KEN CAI NO FOGO OU TOCA NO FOGO MORRE INSTANTANEAMENTE
    public void fireDeathKen(){
        if(isTouching(Ken.class)){  
            if(FireKen == false){ 
                removeTouching(Ken.class); //REMOVE CLASSE
                getWorldOfType(Game.class).setKenHP(0); 
            }
            FireKen=true;
        }
        else FireKen=false;
    }
}
