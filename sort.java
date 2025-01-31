import java.util.ArrayList;
import java.util.Scanner;
class sort
{
    public static void main(String[] args) {
        {
            Scanner scnr=new Scanner(System.in);
            ArrayList<Integer> a=new ArrayList<>();
            System.out.println("enter the size");
            int n= scnr.nextInt();
            System.out.println("enter the values");
            for(int i=0;i<n;i++)
            {
                a.add(scnr.nextInt());
            }
            int temp;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-1;j++)
                {
                    if(a.get(j)>a.get(j+1))
                    {
                        temp=a.get(j);
                        a.set(j,a.get(j+1));
                        a.set(j+1,temp);
                    }
                }
            }
            System.out.println("the sorted list is");
            for(int i=0;i<n;i++)
            {
                System.out.println(a.get(i) + " ");
            }
        }
    }
}