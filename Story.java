import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends Menus
{
    int counter=0;
    
    public Story()
    {
        if(counter++ == 0)
        ImageResizeMinus(50,50);
        addObject(new BackBtn(), 576, 570);
    }
    public  void ImageResizeMinus(int a, int b)
    {
        GreenfootImage image = getBackground();
        image.scale(image.getWidth() - a, image.getHeight() - b);
        setBackground(image);
    }
}
