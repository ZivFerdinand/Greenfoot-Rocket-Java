import greenfoot.*;  
public class Buttons extends Actor
{
    public void act(String buttonName) 
    {
        if (Greenfoot.mousePressed(this)) {  
           getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));  
        }  
        if (Greenfoot.mouseClicked(null) || Greenfoot.mouseDragEnded(null)) {  
           if(buttonName != "CrdtBtn"  && buttonName != "BackBtn")
            setImage(buttonName + ".png");   
        }  
        if (Greenfoot.mouseClicked(this)) {  
            if(buttonName != "CrdtBtn" && buttonName != "BackBtn")
                setImage(buttonName + ".png");  
           Greenfoot.delay(5);   
           
           // Change World On Button Clicking
                 if   (buttonName.equalsIgnoreCase("PlayBtn")) 
                    Greenfoot.setWorld(new First());  
                 if   (buttonName.equalsIgnoreCase("HelpBtn")) 
                    Greenfoot.setWorld(new Help());  
                 if   (buttonName.equalsIgnoreCase("CrdtBtn")) 
                    Greenfoot.setWorld(new Credits());  
                 if   (buttonName.equalsIgnoreCase("StoryBtn")) 
                    Greenfoot.setWorld(new Story());
                 if   (buttonName.equalsIgnoreCase("BackBtn")) 
                    Greenfoot.setWorld(new ScreenMenu());
        }  
    }    
}
