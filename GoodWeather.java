import java.util.Scanner;


class Test5324694 {
  public static void main(String args[]){
    // Write code here
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    for(int i=0;i<t;i++)
    {
      int c1=0,c2=0;
      
      int a[]=new int[20];
      for(int j=0;j<7;j++)
      {
        a[j]=s.nextInt();
      }
      for(int k=0;k<7;k++)
      {
        if(a[k]==1)
        {
          c1++;
        }
        else
        {
          c2++;
        }
      }
      if(c1>c2)
      {
        System.out.print(" YES");
      }
      else
      {
        System.out.print(" NO");
      }
    }
  }
}
