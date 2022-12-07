import java.util.*;

public class Snail {
    static double exit;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,h;
        double sum;
        //Start Data
        System.out.print("Висота підйома в футах (a): ");
        a = scan.nextInt();
        System.out.print("Висота спуску в футах (b): ");
        b = scan.nextInt();
        System.out.print("Висота дерева в футах (h): ");
        h = scan.nextInt();
        
        sum = a-b;
        exit = h/sum;
        
        if(exit <= 0 & sum != 0) {
            System.out.println("Impossible");
        }else {
            System.out.println("Він буде підніматися " + exit +" днів");
        }
    }
}