import java.util.Scanner;
public class Maximun2 {
       public static void main(String[] args)
       {
              int x,y;
              Scanner sc =new Scanner(System.in);
              System.out.println("Enter two numbers");
              x = sc.nextInt();
              y = sc.nextInt();
              sc.close();
              if(x>y)
              {
                     System.out.println(x + "is greater");
              }
              else
              {
                      System.out.println(y +"is greater");
              }


       }


       }
