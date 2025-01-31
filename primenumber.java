import java.io.*;
import java.util.*;
public class primenumber{
    public static void main(String[]args)
    {
        int count=0,n,i=2;
        System.out.println("enter a number");
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        while(i<n)
        {
            if(n%i==0)
            {
                count=1;
                break;
            }
            i++;
        }
        if(count==0)
        {
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
