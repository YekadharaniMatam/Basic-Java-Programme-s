import java.util.LinkedList;
import java.util.Scanner;
public class insertfront{
    public static void main(String[]args)
    {
        Scanner Scnr=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("enter the no of elements to insert into list");
        int n=Scnr.nextInt();
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++)
        {
            int element=Scnr.nextInt();
            list.add(element);

        }
        System.out.println("Original Linked List: " + list);
        System.out.println("Enter an element to insert at the front:");
        int newElement = Scnr.nextInt();
        list.addFirst(newElement);
        System.out.println("Linked List after inserting " + newElement + " at the front: " + list);
        Scnr.close();
    }
}