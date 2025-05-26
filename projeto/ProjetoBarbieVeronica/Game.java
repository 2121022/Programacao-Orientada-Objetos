import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Game extends World
{
    private GreenfootSound gameMusic = new GreenfootSound("GameTheme.mp3");
    //VARIAVEIS
    private int score=0;
    private int lifeBarbie=100;
    private int lifeKen=100;
    
    private boolean getPotion1Barbie=false;
    private boolean getPotion2Barbie=false;
    private boolean getPotion1Ken=false;
    private boolean getPotion2Ken=false;

    public Game()
    {    
        super(1300, 700, 1); 
        
        gameDesign();
        addRightHeel();
        addRightMascara();
        addLeftHeel();
        addLeftMascara();
        
        score=0; //COMECA A 0
        playersScore();
        //MOSTRA O HP DA BARBIE E DO KEN
        showText("BARBIE'S HP: 100 ",getWidth()/4,50);
        showText("KEN'S HP: 100 ",getWidth()/2 + 350,50);
        
    }
    
    public void act(){
       gameMusic.play();
        addRightHeel();
        addRightMascara();
        addLeftHeel();
        addLeftMascara();
        barbieHP();
        kenHP();
        playersScore();
        lose();
        win();
    }
    
    public void lose() //SE A VIDA DA BARBIE OU A DO KEN FOR MENOR OU IGUAL A 0 DA GAMEOVER
    {
        if (lifeBarbie<=0 || lifeKen<=0)
        {
            Greenfoot.setWorld(new GameOver());
            gameMusic.stop();
        }
    }
    
    public void win(){ //SE APANHAM AS POCOES TODAS GANHAM
        if(getPotion1Barbie==true && getPotion2Barbie==true && getPotion1Ken==true && getPotion2Ken==true ){ 
            Greenfoot.setWorld(new Win(score)); 
            gameMusic.stop(); 
        }
    }
    //APARECEM ALEATORIO NO GAME. OBSTACULO HEEL E MASCARA PODEM VIR DA ESQUERDA E DA DIREITA
    public void addRightHeel()
    {
        if (Greenfoot.getRandomNumber(400)<1)
        {
            int x = 0;
            int y = Greenfoot.getRandomNumber(getHeight()-50);
            addObject(new Heel1(), x, y);
        }
    }

      public void addRightMascara()
    {
        if (Greenfoot.getRandomNumber(400)<1)
        {
            int x = 0;
            int y = Greenfoot.getRandomNumber(getHeight()-50);
            addObject(new Mascara1(), x, y);
        }
    }
    
      public void addLeftHeel(){
        if(Greenfoot.getRandomNumber(400)<1) { 
            int x = getWidth()-10;
            int y = Greenfoot.getRandomNumber(getHeight()-50);
            addObject(new Heel2(), x, y);
        }
    }
    
      public void addLeftMascara(){
        if(Greenfoot.getRandomNumber(400)<1) { 
            int x = getWidth()-10;
            int y = Greenfoot.getRandomNumber(getHeight()-50);
            addObject(new Mascara2(), x, y);
        }
    }
    //PONTUACAO
    public void playersScore(){
        showText("SCORE: " + score,getWidth()/2,50);
    }
    //ADICIONAR PONTOS AO SCORE 
    public void addPointsScore(int points){
        score= score + points;
    }
    //A BARBIE E O KEN PERDEM VIDA
    public void removeLifeBarbie(int healthPoints){
        lifeBarbie=lifeBarbie + healthPoints;
    }
    public void removeLifeKen(int healthPoints){
        lifeKen=lifeKen + healthPoints;
    }
    //DEFINIR AS VIDAS DOS PERSONAGENS 
    public void barbieHP(){
        showText("BARBIE'S HP: " + getBarbieHP(),getWidth()/4,50);
    }
    
    public int getBarbieHP(){
        return lifeBarbie;
    }
    
    public void setBarbieHP(int life){
        lifeBarbie = life;
    }
    
    public void kenHP(){
        showText("KEN'S HP: " + getKenHP(),getWidth()/2 + 350,50);
    }
    
    public int getKenHP(){
        return lifeKen;
    }
    
    public void setKenHP(int life){
        lifeKen = life;
    }
    
    //VAO SER USADAS NA FUNCAO WIN
    public void potion1Barbie(){
        getPotion1Barbie=true; 
    }                      
    
    public void potion2Barbie(){
        getPotion2Barbie=true;
    }
    
    public void potion1Ken(){
        getPotion1Ken=true; 
    }                 
    
    public void potion2Ken(){
        getPotion2Ken=true;
    }
    
    
    private void gameDesign() //LAYOUT DO JOGO
    {
        addObject(new BrickBlock(),0,685);
        addObject(new BrickBlock(),80,685);
        addObject(new BrickBlock(),160,685);
        addObject(new BrickBlock(),240,685);
        addObject(new BrickBlock(),320,685);
        addObject(new BrickBlock(),400,685);
        addObject(new BrickBlock(),480,685);
        addObject(new BrickBlock(),560,685);
        addObject(new BrickBlock(),640,685);
        addObject(new BrickBlock(),720,685);
        addObject(new BrickBlock(),800,685);
        addObject(new BrickBlock(),880,685);
        addObject(new BrickBlock(),960,685);
        addObject(new BrickBlock(),1040,685);
        addObject(new BrickBlock(),1120,685);
        addObject(new BrickBlock(),1200,685);
        addObject(new BrickBlock(),1280,685);
        
        addObject(new BrickBlock(),79,121);
        addObject(new BrickBlock(),237,187);
        addObject(new BrickBlock(),522,159);
        addObject(new BrickBlock(),394,238);
        addObject(new BrickBlock(),78,283);
        addObject(new BrickBlock(),255,333);
        addObject(new BrickBlock(),390,539);
        addObject(new BrickBlock(),253,601);
        addObject(new BrickBlock(),81,541);
        addObject(new BrickBlock(),81,406);
        addObject(new BrickBlock(),251,457);
        
        addObject(new BrickBlock(),1221,121);
        addObject(new BrickBlock(),1063,187);
        addObject(new BrickBlock(),778,159);
        addObject(new BrickBlock(),906,238);
        addObject(new BrickBlock(),1222,283);
        addObject(new BrickBlock(),1045,333);
        addObject(new BrickBlock(),910,539);
        addObject(new BrickBlock(),1047,601);
        addObject(new BrickBlock(),1219,541);
        addObject(new BrickBlock(),1219,406);
        addObject(new BrickBlock(),1049,457);
        addObject(new BrickBlock(),776,473);
        addObject(new BrickBlock(),524,473);
        addObject(new BrickBlock(),651,307);

        addObject(new LifeHeartBarbie(),205,50);
        addObject(new LifeHeartKen(),896,50);
        
        addObject(new Potion1Barbie(),810,652);
        addObject(new Potion1Ken(),71,81);
        addObject(new Potion2Barbie(),1214,81);
        addObject(new Potion2Ken(),490,652);
        
        addObject(new DiamondBarbie(),238,156);
        addObject(new DiamondBarbie(),520,130);
        addObject(new DiamondBarbie(),252,302);
        addObject(new DiamondBarbie(),1223,252);
        addObject(new DiamondBarbie(),1217,508);
        addObject(new DiamondBarbie(),1046,568);
        addObject(new DiamondBarbie(),908,507);
        addObject(new DiamondBarbie(),775,443);
        addObject(new DiamondBarbie(),907,206);
        
        addObject(new DiamondKen(),1061,156);
        addObject(new DiamondKen(),1051,427);
        addObject(new DiamondKen(),779,128);
        addObject(new DiamondKen(),396,207);
        addObject(new DiamondKen(),524,442);
        addObject(new DiamondKen(),250,424);
        addObject(new DiamondKen(),78,251);
        addObject(new DiamondKen(),79,510);
        addObject(new DiamondKen(),253,569);
        
        addObject(new Ken(),1223,643);
        addObject(new Barbie(),78,643);
        
        addObject(new Fire(),650,590);

    }
}
