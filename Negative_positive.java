import java.util.Scanner;
public class Negative_positive {
       public static void main(String[] args)
       {
              int x;
              Scanner sc =new Scanner(System.in);
              System.out.println("enter a number which is want to cheak it is positive or negative");
              x = sc.nextInt();
              sc.close();
              if(x>=0)
              {
                     System.out.println(x +"number is positive");
              }
              else
              {
                     System.out.println(x + "number is negative");
              }

       }
}
