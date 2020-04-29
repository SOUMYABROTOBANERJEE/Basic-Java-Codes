import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTest {

    public static void main(String[] args) 
    {
        int arr[]=new int[10];
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number for finding factorial");
        int a = reader.nextInt();
        for(int number=1;number<=a;number++)
        {
            System.out.println(number+"!=");
            String str=factorial(number).toString();
            /*for(int i=0;i<str.length();i++)
            {
            char ch=str.charAt(i);
            for(int j=0;j<=9;j++)
            {
            if((ch-48)==j)
            arr[j]++;
            }
            }*/
            System.out.println(str);
            /*System.out.println("No. of digits:"+str.length());
            for(int i=0;i<10;i++)
            System.out.println((i)+": "+arr[i]);
             */
        }
    }

    /**
     * Obtaining the factorial of a given number
     */
    public static BigInteger factorial(int number){
        BigInteger factValue = BigInteger.ONE;
        for ( int i = 2; i <= number; i++){
            factValue = factValue.multiply(BigInteger.valueOf(i));
        }
        return factValue;
    }

}