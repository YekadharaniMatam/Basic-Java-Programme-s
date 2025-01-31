import java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        String s;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s=scnr.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            r=s.charAt(i)+r;
        }
        System.out.println("reverse string is: "+r);
    }
}