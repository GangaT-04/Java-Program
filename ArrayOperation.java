import java.util.*;

public class ArrayOperation {
    public static void insertion(int a[],int n,int ind,int value)
    {
        for(int i=n;i>=ind;i--)
        {
           a[i+1]=a[i];
        }
        n++;
        a[ind]=value;
        System.out.print("After the insertion the elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    public static void deletion(int a[],int n,int in)
    {
        for(int i=in;i<n-1;i++)
        {
            a[i]=a[i+1];
            
        }
        n--;
        System.out.println("After the deletion Elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
        
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[20];
        
        System.out.print("Enter the no of elements:");
        int n=s.nextInt();
        System.out.print("\nEnter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.print("\nArray Operation:\n1.Insertion\n2.Deletion\nEnter the Choice:");
        int c=s.nextInt();
        switch(c)
        {
            case 1:System.out.println("Enter the insert element:");
                   int ins=s.nextInt();
                   System.out.println("Enter the index;");
                   int ind=s.nextInt();
                   insertion(arr,n,ind,ins);
                   break;
            case 2:System.out.print("Enter the deletion index");
                   int din=s.nextInt();
                   deletion(arr,n,din);
                   break;
        }
    }
}
