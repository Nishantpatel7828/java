import java.util.Scanner;
public class multiplication_tablesecond 
{    
    public static void main(String[] args)
    {
        int n,i,temp;
       Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       sc.close();
       for(i=1;i<=10;i++)
       {
           temp=n*i;
           System.out.println(n+"*"+i+"=" +temp);
       }
    }
}