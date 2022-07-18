import java.util.Scanner;
public class multiplication_table {
       public static void main(String[] args)
       {
              int x,i;
              Scanner sc =new Scanner(System.in);
              System.out.println("enter a number which is want to print table");
              x = sc.nextInt();
              sc.close();
              for(i=0;i<=10;i++)
              System.out.println(x+"*"+ i +"=" +x*i);
              
              
       }          
}