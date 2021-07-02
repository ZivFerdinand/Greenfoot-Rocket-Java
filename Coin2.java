import greenfoot.*; 

public class Coin2 extends BaseTab// Get Functions From BaseTab (Inheritance)
{
    /**
     * Act - do whatever the Coin2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    public void act() 
    {
        if(counter++ == 0)
            ImageResizeMinus(150,150);
        
        setLocation(getX() - 7, getY());  
        if (getX() <=0)  
        {  
            setLocation(getWorld().getWidth() + getX() , getY());   
        }  
        
        Actor MyPlayer;
        MyPlayer = getOneObjectAtOffset(10, 10, MyPlayer.class);
        if(MyPlayer != null)
        {
            World Space;
            Space = getWorld();
            ValueNFunction.Score.myScore++;
            Space.removeObject(this);
            
        }
    }    
}
