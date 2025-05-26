import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartMenu extends World
{
    public StartMenu()
    {    
        super(1300, 700, 1); 
        addObject(new ButtonPlay(), 320, 155);
        addObject(new ButtonHelp(), 320, 255);
        addObject(new ButtonCredits(), 320, 355);
        addObject(new ButtonMainMenu(), 100, 600); 
        //ADICIONAR BOTOES PLAY HELP CREDITS E MAINMENU
    }
}
