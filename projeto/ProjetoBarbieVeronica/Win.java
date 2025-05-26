import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Win extends World
{
    public Win(int Score)
    {    
        super(1300, 700, 1); 
        showText("SCORE: "+ Score,665,450); //DA O SCORE FINAL
        GreenfootSound sound = new GreenfootSound("barbieWin.mp3");
        sound.play(); //SOM QUANDO GANHA
        addObject(new ButtonMainMenu(),100, 600); //BOTAO PARA VOLTAR AO MAINMENU
        addObject(new ButtonPlayAgain(), 654, 526); //OPCAO DE SAIR OU JOGAR DE NOVO
    }
}
