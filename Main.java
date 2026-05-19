import java.math.*;


public class Main
{
    public static void main(String args[])
    {
        int summe =20;
        for(int i = 1;i<=20;i++)
        {
            summe +=i;
            
        }
        int mult= 1;
        for(int i =1;i<=10;i++)
        {
            BigInteger temp = new BigInteger(String.valueOf(i));
            mult*=i;
        }
        System.out.println("Summe: " +summe);
        System.out.println("Mult= " +mult);

        System.out.println("Summe wurde berechnet");

        System.out.println("Multiplikation wurde berechnet");

        
        
    }
}
