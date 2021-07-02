import greenfoot.*;  

public class Coin1 extends BaseTab// Get Functions From BaseTab (Inheritance)
{
    /**
     * Act - do whatever the Coin1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    public void act() 
    {
        if(counter++ == 0)
            ImageResizeMinus(150,150);
        
        setLocation(getX(), getY() + 2);  
        if (getY() >= 645)  
        {  
            setLocation(getX() , getWorld().getHeight() - getY());  
        }  
    }    
}
