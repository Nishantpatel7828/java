       import java.util.Scanner;
       public class divisable
 {
       public static void main(String[] args)
       {
              int x;
              Scanner sc =new Scanner(System.in);
              System.out.println("enter a number which is want to cheak it is divisable or not");
              x = sc.nextInt();
              sc.close();
              if(x%5==0&&x%11==0)
              {
                     System.out.println(x +"number is divisable");
              }
              else
              {
                     System.out.println(x + "number is not divisable");
              }

       }
}


