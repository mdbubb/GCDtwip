import java.util.Scanner;

/**
 * Created by mb977 on 2/23/17.
 */
public class rec {
    public void solve(int a, int b) {
        Scanner input = new Scanner(System.in);

        //System.out.println(rem);
        if (b == 0) {
            System.out.println("Your GCD is: " + a);
        } else if(a==0){
            System.out.println("Your GCD is: " + b);
        }
        else if(b==1){
            System.out.println("No GCD");

        }
        else if (a==1){
            System.out.println("No GCD");
        }
        else {
            int rem = a % b;
            a=b;
            b=rem;
            solve(a, b);
        }
    }
}
