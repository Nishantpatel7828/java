import java.util.Scanner;

public class factorial
 {
       public static void main(String[] args) {
              int i,n,fact=1;
              Scanner sc = new Scanner(System.in);
              System.out.println("enter a number whose factorial you want to find");
              n=sc.nextInt();
              sc.close();
              for(i=1;i<=n;i++)

              {
                     fact = fact*i;
              }
              System.out.println("factorial is :" + fact );


       }
       
}
