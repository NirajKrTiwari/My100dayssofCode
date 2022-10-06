<<<<<<< HEAD
import java.util.Scanner;
public class PalindromeGeek {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter any String: ");
            String S=in.nextLine();
            String s1 = "";
            for (int i = S.length() - 1; i >= 0; i--) {
                s1 = s1 + S.charAt(i);
            }
            if (S.equals(s1)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

        }
    }
=======
import java.util.Scanner;
public class PalindromeGeek {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter any String: ");
            String S=in.nextLine();
            String s1 = "";
            for (int i = S.length() - 1; i >= 0; i--) {
                s1 = s1 + S.charAt(i);
            }
            if (S.equals(s1)) {
                System.out.println("S is Palindrome");
            } else {
                System.out.println("S is not Palindrome");
            }

        }
    }
>>>>>>> f867c881cc166f3eb14d6706dbc8aca8fd1573d7
