import greenfoot.*; 

public class Status extends BaseTab // Get Functions From BaseTab (Inheritance)
{
    int counter = 0; 
    public void act() 
    {
        if(counter++ == 0) // Runs On First Function Calling
            ImageResizeDivide(4,4);
    }    
    
}
