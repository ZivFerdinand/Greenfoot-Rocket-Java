    import greenfoot.*; 
    public class Menus extends World
{
    public static GreenfootSound titleSound;
    Title gameTitle = new Title();
   public Menus()  
   {    
       
     super(1152, 648, 1); 
     if (this.getClass().getName().equalsIgnoreCase("ScreenMenu"))  
     {  
         
       addObject(new PlayBtn(), 576, 324);  
       addObject(new StoryBtn(), 466, 450); 
       
       CrdtBtn myCrdtBtn = new CrdtBtn();
       
       // Polymorphism
       myCrdtBtn.ImageResizeMinus(250, 180); // Resize Credits Button (Smaller)
       
       addObject(myCrdtBtn, 720, 445);
       
       addObject(new HelpBtn(), 50, 600);
       addObject(gameTitle, 576, 50);
         titleSound = new GreenfootSound("bgm.mp3");
             titleSound.setVolume(70);  
             titleSound.playLoop();  
     }
       
    if (this.getClass().getName().equalsIgnoreCase("GameOver1"))  
     { 
         Greenfoot.delay(50);
         Greenfoot.setWorld(new ScreenMenu());
     }
   }  
}
