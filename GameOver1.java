import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver1 extends Menus
{

    /**
     * Constructor for objects of class GameOver1.
     * 
     */
    public GameOver1()
    {
        WorldChange();
        ImageResizePlus(4052,950);
      Greenfoot.setWorld(new ScreenMenu());
      
    }   
    public static void WorldChange()
    {
      Greenfoot.setWorld(new ScreenMenu());
    }
    public  void ImageResizePlus(int a, int b)
    {
        GreenfootImage image = getBackground();
        image.scale(image.getWidth() + a, image.getHeight() + b);
        setBackground(image);
    }
}
