import java.util.Scanner;

public class vovel_consonent {

       public static void main(String[] args)
       {
              
              char x;
              Scanner sc = new Scanner(System.in);
              System.out.println("enter a alphabet");
              x = sc.next().charAt(0);
              sc.close();
              switch(x)
              {
                     case 'a':
                     case 'e':
                     case 'i':
                     case 'o':
                     case 'u':
                     case 'A':
                     case 'E':
                     case 'I':
                     case 'O':
                     case 'U': 
                     System.out.println("character is vovel");
                     break;
                     case 'b':
                     case 'B':
                     case 'c':
                     case 'C':
                     case 'd':
                     case 'D':
                     case 'f':
                     case 'F':
                     case 'g':
                     case 'G':
                     case 'h':
                     case 'H':
                     case 'j':
                     case 'J':
                     case 'k':
                     case 'K':
                     case 'l':
                     case 'L':
                     case 'm':
                     case 'M':
                     case 'n':
                     case 'N':
                     case 'p':
                     case 'P':
                     case 'q':
                     case 'Q':
                     case 'r':
                     case 'R':
                     case 's':
                     case 'S':
                     case 't':
                     case 'T':
                     case 'v':
                     case 'V':
                     case 'w':
                     case 'W':
                     case 'x':
                     case 'X':
                     case 'y':
                     case 'Y':
                     case 'z':
                     case 'Z':
                     System.out.println("Character is consonent");
                     break;
                     default:System.out.println("it is not a  alphabet");
              }
       }
}
