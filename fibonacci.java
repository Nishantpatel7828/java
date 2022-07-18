import java.util.Scanner;

public class fibonacci {
       public static void main(String[] args) {
              int i,n,a=0,b=1,temp=0;
              Scanner sc= new Scanner(System.in);
              System.out.println("enter a number where you want to print series ");
              n=sc.nextInt();
              sc.close();
              System.out.println("Fibonacci series is:");
              System.out.print(a + "\t" + b);
              for(i=2;i<n;i++)
              {
                     temp=a+b;
                     a=b;
                     b=temp;
                     System.out.print("\t"+temp);
              }

       }
}
