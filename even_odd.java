import java.util.Scanner;
public class even_odd {
       public static void main(String[] args)
       {
              int x;
              Scanner sc =new Scanner(System.in);
              System.out.println("enter a number which is want to cheak it is even or odd");
              x = sc.nextInt();
              sc.close();
              if(x%2==0)
              {
                     System.out.println(x +"number is even");
              }
              else
              {
                     System.out.println(x + "number is odd");
              }

       }
}