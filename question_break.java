
import java.util.Scanner;

public class question_break {
    public static void main(String[] args) {
        // int n;

        Scanner sc = new Scanner(System.in);
        int n;
        do { 
  System.out.print("enter your no : ");
            n = sc.nextInt();
          
            if(n % 10==0){
                System.out.println("i found the multiple of 10");
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
