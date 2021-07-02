import greenfoot.*; 

public class Heart extends BaseTab // Get Functions From BaseTab (Inheritance)
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    public void act() 
    {
        if(counter++ == 0)
            ImageResizeDivide(12,12);
    }    
    
}
