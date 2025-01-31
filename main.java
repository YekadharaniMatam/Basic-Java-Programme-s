import java.util.*;
class shapes
{
    int getarea(int l,int b)
    {
        System.out.println("shapes");
        return 0;
    }
}
    class rectangle extends shapes{
        int getarea(int l,int b)
        {
            int area=l*b;
            return area;
        }
    }
    public class main{
        public static void main (String[]args)
        {
            int l,b;
            Scanner Scnr=new Scanner(System.in);
            System.out.println("enter the length");
            l=Scnr.nextInt();
            System.out.println("enter breadth");
            b=Scnr.nextInt();
            rectangle rect=new rectangle();
            int area=rect.getarea(l,b);
            System.out.println("the area is" + area);
        }
    }
