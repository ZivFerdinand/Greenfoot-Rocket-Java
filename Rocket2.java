import greenfoot.*; 
public class Rocket2 extends BaseTab // Get Functions From BaseTab (Inheritance)
{
    // Local Variables
    int counter = 0;
    public void act() 
    {
        if(counter++ == 0) // Runs On First Function Calling
            ImageResizeMinus(50,40);
            
        setLocation(getX() + 2, getY());  
        
        if (getX() >= 1150)  
        {  
            setLocation(0 , getY());  
        }  
    }  
    
}
