import greenfoot.*; 

public class MyPlayer extends BaseTab // Get Functions From BaseTab (Inheritance)
{
    // Local Variables
    int dead = 0;
    int counter = 0;
    int timer = 60;
    
    // Constructor
    Score score_field = new Score("Score:" + ValueNFunction.Score.myScore); 
    Heart loveImage = new Heart();
    Heart loveImage1 = new Heart();
    Heart loveImage2 = new Heart();
    Heart loveImage3 = new Heart();
    Heart loveImage4 = new Heart();
    
    public void act() 
    {
        timer--;
        if(counter++ == 0) // Runs on First Function Calling
        {
            ValueNFunction.Score.myScore = 0;
            ImageResizeMinus(50,50);
            
            Status leftStat = new Status();
            Status rightStat = new Status();
            
            getWorld().addObject(leftStat, 385, 70);
            getWorld().addObject(rightStat, 780, 70);
        }
        HealthUpdate();
        touch();
        keyBoardControl();
        
        // Score Checking
        if(dead>=5)
            gameOverScreen();
        if(ValueNFunction.Score.myScore>=10)
            goToNextLevel();
    }    
    private void HealthUpdate(){
        int lives = 5-dead;
        
        if(lives <= 0)
        {
            getWorld().removeObject(loveImage);
        }
        else if(lives <= 1)
        {
            getWorld().removeObject(loveImage1);
        }
        else if(lives <=2)
        {
            getWorld().removeObject(loveImage2);
        }
        else if(lives <=3)
        {
            getWorld().removeObject(loveImage3);
        }
        else if(lives <=4)
        {
            getWorld().removeObject(loveImage4);
        }
        else
        {
            getWorld().addObject(loveImage, 720, 73);
            getWorld().addObject(loveImage1, 750, 73);
            getWorld().addObject(loveImage2, 780, 73);
            getWorld().addObject(loveImage3, 810, 73);
            getWorld().addObject(loveImage4, 840, 73);
        }
    }
    private void gameOverScreen()
    {
        GameOver looseAlert = new GameOver();
        getWorld().addObject(looseAlert, 540, 324); 
        getWorld().removeObject(loveImage);
        Greenfoot.playSound("BOOM-SWOOSH.mp3");
        Greenfoot.setWorld(new GameOver1()); 
    }
    private void goToNextLevel()
    {
        
        NextLevel winAlert = new NextLevel();
        getWorld().addObject(winAlert, 540, 324); 
        
        Greenfoot.playSound("VICTORY.mp3");  
        Greenfoot.delay(200);
        
        if(getWorld().getClass().getName() == "First")
        {
            Greenfoot.setWorld(new Second());
        }
        else
            Greenfoot.setWorld(new ScreenMenu()); 
    }
    
    public void keyBoardControl()
    {
       int delayTime;
       delayTime = 2;
       if (Greenfoot.isKeyDown("left") )  
       {       
           if(getX() >= 540)
           {
               setLocation​(getX() - 200, getY()) ;
               Greenfoot.delay(delayTime); 
               Greenfoot.playSound("SLIP.mp3");
           }
       }     
       else if (Greenfoot.isKeyDown("right") )  
       {       
           if(getX() <= 600)
           {
               setLocation​(getX() + 200, getY()) ;
               Greenfoot.delay(delayTime); 
               Greenfoot.playSound("SLIP.mp3");
           }
       }  
       else if (Greenfoot.isKeyDown("up") )  
       {       
           if(getY() >= 300)
           {
               setLocation​(getX(), getY() - 200) ;
               Greenfoot.delay(delayTime); 
               Greenfoot.playSound("SLIP.mp3");
           }
       }   
       else if (Greenfoot.isKeyDown("down") )  
       {       
           if(getY() <= 330)
           {
               setLocation​(getX(), getY() + 200) ;
               Greenfoot.delay(delayTime); 
               Greenfoot.playSound("SLIP.mp3");
           }
       }  
    }
    public void touch()
    {
        Actor Score; 
        getWorld().addObject(score_field, 400, 65);  
        
        // Collide Checking
        Actor Rocket1;
        Rocket1 = getOneObjectAtOffset(20, 20, Rocket1.class); 
        if(Rocket1 != null && timer<=0)
        {
            dead++;
            getWorld().removeObject(Rocket1);
            timer=60;
            setLocation(570, 324);
            Greenfoot.playSound("SWOOSH-#3.mp3");
        }
        Actor Rocket2;
        Rocket2 = getOneObjectAtOffset(20, 20, Rocket2.class);
        if(Rocket2 != null && timer<=0)
        {
            dead++; 
            getWorld().removeObject(Rocket2);
            setLocation(570, 324);
            timer=60;
            Greenfoot.playSound("SWOOSH-#3.mp3");
            
        }
        Actor myCoin;
        myCoin = getOneObjectAtOffset(20, 20, Coin.class);
        if(myCoin != null)
        {
            ValueNFunction.Score.myScore++;
            World Space;
            Space = getWorld();
            Space.removeObject(myCoin);
            
            Greenfoot.playSound("getcoin.mp3");
            score_field.setText("Score: " + ValueNFunction.Score.myScore);  
        }
        Actor myCoin1;
        myCoin1 = getOneObjectAtOffset(20, 20, Coin1.class);
        if(myCoin1 != null)
        {
            ValueNFunction.Score.myScore++;
            World Space;
            Space = getWorld();
            Space.removeObject(myCoin1);
            
            Greenfoot.playSound("getcoin.mp3");
            score_field.setText("Score: " + ValueNFunction.Score.myScore);  
        }
        Actor myCoin10;
        myCoin10 = getOneObjectAtOffset(20, 20, Coin1.class);
        if(myCoin10 != null)
        {
            ValueNFunction.Score.myScore++;
            World Space;
            Space = getWorld();
            Space.removeObject(myCoin10);
            
            Greenfoot.playSound("getcoin.mp3");
            score_field.setText("Score: " + ValueNFunction.Score.myScore);  
        }
        Actor myCoin2;
        myCoin2 = getOneObjectAtOffset(20, 20, Coin2.class);
        if(myCoin2 != null)
        {
            ValueNFunction.Score.myScore++;
            World Space;
            Space = getWorld();
            Space.removeObject(myCoin2);
            
            Greenfoot.playSound("getcoin.mp3");
            score_field.setText("Score: " + ValueNFunction.Score.myScore);  
        }
    }
}
