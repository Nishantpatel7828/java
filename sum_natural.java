import java.util.Scanner;

public class sum_natural {
       public static void main(String[] args) {
              int n,i,sum=0;
              Scanner sc = new Scanner(System.in);
              System.out.println("enter a number as far as you want to print sum of natural numbers");
              n = sc.nextInt();
              sc.close();
              for(i=0;i<=n;i++)
              {
                     sum=sum+i;
              }
              System.out.println("sum of naturals number is "+ sum);
       }
}
