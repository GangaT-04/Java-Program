Chess Format

Given the time control of a chess match as a+b, determine which format of chess out of the given 4 it belongs to.

1) Bullet if a+b<3

2) Blitz if 3≤a+b≤10

3) Rapid if 11≤a+b≤60

4) Classical if 60<a+b


Input Format

First line will contain T, number of testcases. Then the testcases follow.

Each testcase contains a single line of input, two integers a,b

Output Format

For each testcase, output in a single line, answer 1 for bullet, 2 for blitz, 3 for rapid, and 4 for classical format.

Testcase:1[Open Testcase]
Inputs:
4 ,1 0 ,4 1 ,100 0 ,20 5
Output:
1 2 4 3
Code:
import java.util.Scanner;
class Test5324694 {
  public static void main(String args[]){
    // Write code here
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    
    for(int i=0;i<t;i++)
    {
      int a=s.nextInt();
      int b=s.nextInt();
      int c=a+b;
      if(c<3)
      {
        System.out.print(" 1");
      }
      else if(3<=c && c<=10)
      {
         System.out.print(" 2");
      }
      else if(11<=c && c<=60)
      {
         System.out.print(" 3");
      }
      else
      {
         System.out.print(" 4");
      }
    }
  }
Code Output:
1 2 4 3
