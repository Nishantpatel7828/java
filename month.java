import java.util.Scanner;
public class month {
              public static void main(String[] args)
              {
                     int n;
                     Scanner sc = new Scanner(System.in);
                     System.out.println("Enter  number 1 to 12 which you want to cheak the  month");
                     n=sc.nextInt();
                     sc.close();
                     switch(n)
                    {
                     case 1:
                     case 3:
                     case 5:
                     case 7:
                     case 8:
                     case 10:
                     case 12:
                     System.out.println("31 days in this month");
                     break;
                     case 4:
                     case 6:
                     case 9:
                     case 11:
                     System.out.println("30 days in this month");
                     break;

                     case  2:
                     System.out.println(" Either 28 or 29  days in this month");
                     break;
                     default:System.out.println("please enter a valid number between 1 to 12");
                    }
       
              }
        }    

