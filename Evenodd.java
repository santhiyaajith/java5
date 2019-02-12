import java.util.Scanner;

public class Evenodd
{
  public static void main(String args[])
  {
    
    int num = 3;
    if ( num % 2 ==0 )
        System.out.println("even");
        else if(num < 0)
        System.out.println("Invalid");
     else
        System.out.println("odd");
  }
}