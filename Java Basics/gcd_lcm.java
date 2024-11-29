import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int x,y;
        if(a > b){
            x = b;
            y = a;
        }
        else{
            x=a;
            y=b;
        }
        
        while(y % x!=0){
            int rem = y%x;
            y = x;
            x = rem;
        }

        int gcd = x;
        int lcm = (a*b)/gcd;
        System.out.println("The GCD is: " + gcd + "\nThe LCM is: " + lcm);

        scn.close();
    }
}
