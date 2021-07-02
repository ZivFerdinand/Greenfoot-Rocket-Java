 import greenfoot.*;   
 import java.applet.*;
 import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
   Font font1 = new Font("Helvetica",true, false,35);  // Font Declaration
   public Score(String text)  
   {  
    GreenfootImage img_field = new GreenfootImage(170,50);  
    img_field.setFont(font1);  
    img_field.setColor(greenfoot.Color.BLACK);
    img_field.drawString(text, 0, 45);  
    setImage(img_field);  
   }  
   public void setText(String text)  
   {  
     GreenfootImage img_field = getImage();  
     img_field.clear();  
     img_field.drawString(text, 0, 45);  
   }  
}
