    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


    public class Barbie extends Players
    {
    private int speed = 6;
    private GreenfootImage image1, image2;

    private boolean jumping;
    private int jumpStrenght = 20;

    private int verticalSpeed;
    private int gravity = 2;
    //SO PRIMEIRA INTERSECAO
    private boolean checkMakeup; 
    private boolean sound;

    public Barbie() //BARBIE ESPELHADA
    {
        image1 = new GreenfootImage("barbie1back.png");  
        image2 = new GreenfootImage("barbie1.png");
    }

    public void act()
    {
        checkFall();
        checkKeys();
        checkRightWall();
        checkLeftWall();
        checkCeiling();
        catchDiamonds();
        makeupHit();
        hitAudio();
    }
    
    public int getHP() {  //VIDA QUE BARBIE TEM
        return getWorldOfType(Game.class).getBarbieHP();
    }
    
    public void hitAudio(){ //OVERRIDE
        if(isTouching(Makeup.class)){
            if (sound==false){
                Greenfoot.playSound("hitSound2.mp3"); 
            }
            sound=true;
        }
        else sound=false;
    }
    
    private void checkKeys(){ //DEFINIR COMANDOS
        if(Greenfoot.isKeyDown("w") && jumping == false)
        {
            jump();
            Greenfoot.playSound("Jump.mp3");
        }

        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
            setImage(image2);
        }

        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
            setImage(image1);
        }
    }
    
    private void checkFall(){ //SE TA NO CHAO NAO HA VERTICALSPEED, CASO CONTRARIO CAI.
        if (onGround() == true)
            verticalSpeed = 0;
        else
            fall();
    }

    private void fall(){ 
        setLocation(getX(), getY() + verticalSpeed); 
        if(verticalSpeed <= 12)
        verticalSpeed = verticalSpeed + gravity; //NAO TAR A ACELERAR PARA SEMPRE
        jumping = true;
    }
    
    private boolean onGround(){ //
        int spriteHeight = getImage().getHeight();
        int lookForGround = spriteHeight/2;
        Actor ground = getOneObjectAtOffset(0, lookForGround, BrickBlock.class);
        if(ground == null)
        {
            jumping = true; //SE N TA NO CHAO TA A SALTAR
            return false; //N TA NO CHAO
        }
        else{
            moveToGround(ground);
            return true;
        }
    }

    private void moveToGround(Actor ground){ //PARA NAO FICAR DENTRO DO CHAO
        int groundHeight = ground.getImage().getHeight(); //TAMANHO ESPECIFICO DO CHAO
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2; //PQ O GREENFOOT MEDE PELA METADE  
        setLocation(getX(), newY);
        jumping = false;
        //NEWY E PARA ONDE QUEREMOS MOVER A BARBIE 
    }
    
    private boolean checkCeiling(){ //
        int spriteHeight = getImage().getHeight();
        int lookForCeiling = spriteHeight/2;

        Actor ceiling = getOneObjectAtOffset(0, -lookForCeiling, BrickBlock.class);
        if(ceiling != null)
        {
            bopHead(ceiling); // BATE COM A CABECA SE TIVER UM TETO
            return true;
        }
        else{
            return false;
        }
    }

    private void bopHead(Actor ceiling){ //BATE COM A CABECA NO LIMITE DO BLOCO E NAO A MEIO DELE
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;

        setLocation(getX(), newY);
        jumping = false;
        verticalSpeed = 2; 
    }

    private boolean checkRightWall(){ //CASO TENHA BLOCO A DIREITA, PARA.
        int spriteWidth = getImage().getWidth();
        int lookForRightWalls = spriteWidth/2;

        Actor rightWall = getOneObjectAtOffset(lookForRightWalls, 0, BrickBlock.class); //Y=0 POIS QUEREMOS ESQUERDA E DIREITA (X)
        if(rightWall == null)
        {
            return false;
        }
        else{
            stopByrightWall(rightWall);//PARA QUANDO TOCA NO BLOCO. NAO PASSA SEMPRE
            return true;
        }
    }

    private void stopByrightWall(Actor rightWall){ //PARA NAO FICAR BUGADO, METADE DENTRO
        int wallWidth = rightWall.getImage().getWidth(); //VE LARGURA DO BLOCO
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2; 
        //MOVE LO PARA A ESQUERDA
        setLocation(newX, getY());
    }

    private boolean checkLeftWall(){ //CASO TENHA BLOCO A ESQUERDA, PARA.
        int spriteWidth = getImage().getWidth();
        int lookForLeftWalls = -spriteWidth/2;

        Actor leftWall = getOneObjectAtOffset(lookForLeftWalls, 0, BrickBlock.class); //Y=0 POIS QUEREMOS ESQUERDA E DIREITA (X)
        if(leftWall == null)
        {
            return false;
        }
        else{
            stopByLeftWall(leftWall); //PARA QUANDO TOCA NO BLOCO. NAO PASSA SEMPRE
            return true;
        }
    }
    
    private void stopByLeftWall(Actor leftWall){ //PARA NAO FICAR BUGADO, METADE DENTRO
        int wallWidth = leftWall.getImage().getWidth();//VE LARGURA DO BLOCO
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        //MOVE LO PARA A DIREITA
        setLocation(newX, getY());
    }

    private void jump(){ // SOBE E NEGATIVO 
        verticalSpeed = verticalSpeed - jumpStrenght;
        jumping = true;
        fall();
    }
    //SE A BARBIE TOCA NO SEU DIAMANTE ELE DESAPARECE E E ADICIONADO 10 PONTOS AO SCORE
    public void catchDiamonds(){ 
        if(isTouching(DiamondBarbie.class)) { 
        getWorldOfType(Game.class).addPointsScore(10); 
        removeTouching(DiamondBarbie.class);}
    }
    //SE A BARBIE E ATINGIDA SAO RETIRADOS 10 PONTOS NA VIDA DELA
    public void makeupHit(){ 
        if(isTouching(Makeup.class)){
            if(checkMakeup==false){ 
                getWorldOfType(Game.class).removeLifeBarbie(-10);
            }
            checkMakeup=true;
        }
        else checkMakeup =false;
    }
    }
