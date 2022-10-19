package Rotate_Number;
import java.util.*;
public class Rotate_Number {
    public static void main(String[] args)
    {
        System.out.print("Enter number: ");
        Scanner scn = new Scanner(System.in);
        int i,n = scn.nextInt();
        System.out.print("Enter total roration: ");
        int rotate = scn.nextInt();
        int total_digit = 0;
        int remainder = 0;
        int number = n;
        while(number > 0)
        {
            number = number / 10;
            total_digit++;
        }
        rotate = rotate % total_digit;
        if(rotate < 0)
        {
            for(i = 0;i > rotate;i--)
            {
                remainder = n % (int)Math.pow(10,total_digit-1);
                n = n / (int)Math.pow(10,total_digit-1);
                n = (remainder * 10) + n;
            }
        }
        else
        {
            for(i = 0;i < rotate;i++)
            {
                remainder = n % 10;
                remainder = remainder * (int)Math.pow(10,total_digit-1);
                n = (n / 10) + remainder;
            }
        }
        System.out.print("After rotation: " + n);
    }
}
