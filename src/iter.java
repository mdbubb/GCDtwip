import java.util.Scanner;

/**
 * Created by mb977 on 2/23/17.
 */
public class iter {
    public void nextSolve(int a, int b) {
        while (a != 0 || b != 0) {
            if (b == 0) {
                System.out.println("Your GCD is: " + a);
                break;
            } else if (a == 0) {
                System.out.println("Your GCD is: " + b);
                break;
            } if(a==1){
                System.out.println("No GCD");
                break;
            }
            else if(b==1){
                System.out.println("No GCD");
                break;
            }
            else {
                int rem = a % b;
                a = b;
                b = rem;


            }

        }
       }
}