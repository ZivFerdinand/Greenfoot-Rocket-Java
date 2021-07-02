import greenfoot.*;

public class ValueNFunction
{
    public static class Score // Static Class
    {
        public static int myScore; // Static Variable
    }
    public static class Function // Static Class
    {
       public static int getRandomNumber(int start,int end) // Static Function
       {
           int normal = Greenfoot.getRandomNumber(end-start+1);
           return normal+start;
       }
        
    }
}
