
import greenfoot.*; 
public class First extends GamePlay
{
    int counter = 0;
    public First()
    {
        if(counter++ ==0) // Resize Image On Function Calling
            ImageResize();
        prepare();
    }
    private void ImageResize()
    {
        GreenfootImage image = getBackground();
        image.scale(image.getWidth() -530, image.getHeight() -300);
        setBackground(image);
    }
    public void prepare()
    {
        // Prepare Everything (Instantiate)
        // AddObject to Instantiate
        
        int space = 240; // Left Image Space (Non-GamePlay Area)
        
        // OBJECTS
        // Instantiate Player
        MyPlayer ninja = new MyPlayer();
        addObject(ninja, 330 + space, 324);
        
        // Instantiate Rocket(s)
        Rocket1 rightToLeftRocket = new Rocket1();
        addObject(rightToLeftRocket, 1152, ValueNFunction.Function.getRandomNumber(20, 620));
        
        Rocket2 leftToRightRocket = new Rocket2();
        addObject(leftToRightRocket, 0, ValueNFunction.Function.getRandomNumber(20, 620));
        
        Rocket2 leftToRightRocket1 = new Rocket2();
        addObject(leftToRightRocket1, 0, ValueNFunction.Function.getRandomNumber(20, 620));
        
        Rocket2 leftToRightRocket2 = new Rocket2();
        addObject(leftToRightRocket2, 0, ValueNFunction.Function.getRandomNumber(20, 620));
        
        Rocket2 leftToRightRocket3 = new Rocket2();
        addObject(leftToRightRocket3, 0, ValueNFunction.Function.getRandomNumber(20, 620));
        
        // Instantiate Coin(s)
        Coin bottomToUpCoin = new Coin();
        addObject(bottomToUpCoin, 130+ space, 624);
        
        Coin1 upToBottomCoin1 = new Coin1();
        addObject(upToBottomCoin1, 330+ space, 0);
        
        Coin1 upToBottomCoin12 = new Coin1();
        addObject(upToBottomCoin12, 160+ space, 0);
        
        Coin1 upToBottomCoin60 = new Coin1();
        addObject(upToBottomCoin60, 150+ space, 0);
        
        Coin2 lToR20110 = new Coin2();
        addObject(lToR20110, 1152, 304);
        
        Coin2 bottomToUpCoin220110 = new Coin2();
        addObject(bottomToUpCoin220110, 1152, 104);
        
        Coin bottomToUpCoin200 = new Coin();
        addObject(bottomToUpCoin200, 320+ space, 624);
        
        Coin bottomToUpCoin2020 = new Coin();
        addObject(bottomToUpCoin2020, 120+ space, 624);
        
        Coin bottomToUpCoin300 = new Coin();
        addObject(bottomToUpCoin300, 560+ space, 624);
        
        Coin bottomToUpCoin430 = new Coin();
        addObject(bottomToUpCoin430, 540+ space, 624);
    }
}
