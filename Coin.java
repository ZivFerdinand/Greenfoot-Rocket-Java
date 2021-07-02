import greenfoot.*;  

public class Coin extends BaseTab // Get Functions From BaseTab (Inheritance)
{
    
    int counter = 0;
    public void act() 
    {
        if(counter++ == 0)
            ImageResizeMinus(150,150);
        
        setLocation(getX(), getY() - 2);  
        if (getY() <= 0)  
        {  
            setLocation(getX() , getWorld().getHeight() - getY());  
        }  
    }    
}
