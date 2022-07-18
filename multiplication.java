import java.util.Scanner;
public class multiplication {
       public static void main(String [] args)
       {
              int a,b,mul;
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter two numbers");
              a = sc.nextInt();
              b = sc.nextInt();
              sc.close();
              mul=a*b;
              System.out.println(mul +"");
       }
}
