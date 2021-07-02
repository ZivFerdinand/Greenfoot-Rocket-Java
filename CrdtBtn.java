import greenfoot.*;  

public class CrdtBtn extends Buttons
{
    public void act() 
    {
        super.act(this.getClass().getName()); //Returns Class Name
    }    
    
    public void ImageResizeMinus(int a, int b)
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - a, image.getHeight() - b);
        setImage(image);
    }
}
