import java.lang.Exception;
import java.util.Scanner;



public class CheckPwd1 {
    static void checkPwd(int pwd) {
        if (pwd!=12345){
            System.out.println("Access Denied..");
            throw new ArithmeticException("Your password is incorrect... ");
        }
        else {
            System.out.println("You are in..");
        }
    }
    public static void main(String[] args) {
        System.out.println("************* Password Program ******************");
//checkPwd(12345); // static function called without object.
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            checkPwd(x);
        }
        finally {
            System.out.println("Program end.");
        }
    }
}

