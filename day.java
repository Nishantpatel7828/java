import java.util.Scanner;
public class day
 {
       public static void main(String[] args)
       {
              int n;
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter  number 1to 7 where you want to print a day");
              n=sc.nextInt();
              sc.close();
              switch(n)
              {
                  case 1:System.out.println("Monday");
                  break;
                  case 2:System.out.println("Tuesday");
                  break;
                  case 3:System.out.println("wednesday");
                  break;
                  case 4:System.out.println("Thusday");
                  break;
                  case 5:System.out.println("friday");
                  break;
                  case 6:System.out.println("sturday");
                  break;
                  case 7:System.out.println("sunday");
                  break;
                  default:System.out.println("number is not correct");
                  break;
              }

       }
 }