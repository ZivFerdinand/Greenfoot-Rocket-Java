import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BaseTab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseTab extends Actor
{
    /**
     * Act - do whatever the BaseTab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }   
    public  void ImageResizeDivide(int a, int b)
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / a, image.getHeight() / b);
        setImage(image);
    }
    public  void ImageResizeMinus(int a, int b)
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - a, image.getHeight() - b);
        setImage(image);
    }
}
