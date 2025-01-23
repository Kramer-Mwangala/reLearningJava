import java.lang.*;
import java.util.*;

class Keyboard
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a digit");
       a=sc.nextInt();
       b=sc.nextInt();

       c=a+b;

       System.out.println("sum is :"+c);
    }
}