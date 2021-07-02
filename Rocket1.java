import greenfoot.*; 

public class Rocket1 extends BaseTab // Get Functions From BaseTab (Inheritance)
{
    int counter = 0;
    public void act() 
    {
        if(counter++ == 0)
            ImageResizeMinus(100,50);
        setLocation(getX() - 2, getY());  
        if (getX() <= 0)  
        {  
            setLocation(getWorld().getWidth() + getX() , getY());  
        }  
    }    
    
}
