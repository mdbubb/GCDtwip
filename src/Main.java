import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by mb977 on 2/23/17.
 */
public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to use Euclidean's algorithm recursion (R) or iteratively (I)");
        String ans = input.next();
        if(ans.equalsIgnoreCase("r")){
            rec r = new rec();
            System.out.println("Enter your first number");
            int a = input.nextInt();
            System.out.println("Enter your second nubmer");
            int b = input.nextInt();
            r.solve(a,b);
        }
        else if(ans.equalsIgnoreCase("i")){
            iter i = new iter();
            System.out.println("Enter your first number");
            int a = input.nextInt();
            System.out.println("Enter your second nubmer");
            int b = input.nextInt();
            i.nextSolve(a,b);
        }
        else{
            JFrame frame = new JFrame();
            frame.add(new JLabel(new ImageIcon("39392392.jpg")));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);

        }



    }
}
