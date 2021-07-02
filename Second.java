import greenfoot.*;  

public class Second extends GamePlay
{
    int counter = 0;
    public Second()
    {
        super();
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
        
        int space = 240;// Left Image Space (Non-GamePlay Area)
        
        // OBJECTS
        // Instantiate Player, Rockets, and Coins
        MyPlayer ninja = new MyPlayer();
        addObject(ninja, 330 + space, 324);
        
        Rocket1 rightToLeftRocket = new Rocket1();
        addObject(rightToLeftRocket, getWidth(), ValueNFunction.Function.getRandomNumber(20,614));
        
        Rocket2 leftToRightRocket = new Rocket2();
        addObject(leftToRightRocket, 0, ValueNFunction.Function.getRandomNumber(20,614));
        
        Rocket2 leftToRightRocket1 = new Rocket2();
        addObject(leftToRightRocket1, 0, ValueNFunction.Function.getRandomNumber(20,614));
        
        Rocket2 leftToRightRocket2 = new Rocket2();
        addObject(leftToRightRocket2, 0, ValueNFunction.Function.getRandomNumber(20,614));
        
        Rocket1 rightTLRocket3 = new Rocket1();
        addObject(rightTLRocket3, 0, ValueNFunction.Function.getRandomNumber(20,614));
        
        Rocket2 leftToRightRocket4 = new Rocket2();
        addObject(leftToRightRocket4, 0, ValueNFunction.Function.getRandomNumber(20,614));
        
        Rocket2 leftToRightRocket5 = new Rocket2();
        addObject(leftToRightRocket5, 0, 400);
        
        Rocket1 rightToLeftRocket6 = new Rocket1();
        addObject(rightToLeftRocket6, getWidth(), 450);
        
        Rocket1 rightToLeftRocket7 = new Rocket1();
        addObject(rightToLeftRocket7, getWidth(), 270);
        
        Coin bottomToUpCoin8 = new Coin();
        addObject(bottomToUpCoin8, 130+ space, 504);
        
        Coin bottomToUpCoin9 = new Coin();
        addObject(bottomToUpCoin9, 330+ space, 0);
        
        Coin bottomToUpCoin10000 = new Coin();
        addObject(bottomToUpCoin10000, 530+ space, 624);
        
        Coin bottomToUpCoin1999990 = new Coin();
        addObject(bottomToUpCoin1999990, 180+ space, 624);
        
        Coin bottomToUpCoin678901234 = new Coin();
        addObject(bottomToUpCoin678901234, 550+ space, 624);
        
        Coin1 upToBottom5 = new Coin1();
        addObject(upToBottom5, 570+ space, 0);
        
        Coin1 upToBottom6 = new Coin1();
        addObject(upToBottom6, 350+ space, 0);
        
        Coin1 upToBottom697 = new Coin1();
        addObject(upToBottom697, 350+ space, 0);
        
        Coin2 rightToLeft8 = new Coin2();
        addObject(rightToLeft8, 1152, 200);
        
        Coin bottomToUpCoin12345 = new Coin(); 
        addObject(bottomToUpCoin12345, 180+ space, 624);
     
        Coin2 rightToLeft9 = new Coin2();
        addObject(rightToLeft9, 1152, 400);
        
        Coin bottomToUpCoin756969 = new Coin();
        addObject(bottomToUpCoin756969, 350+ space, 624);
    }
}
