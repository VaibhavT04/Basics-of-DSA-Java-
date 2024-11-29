import java.util.Scanner;

public class inverse_number {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int inv = 0;
        int i = 1;

        while(n!=0){
            int x = n%10;
            inv += i * (int)Math.pow(10, x-1);
            n = n/10;
            i++;
        }
        
        System.out.println("The inverse is : ");
        System.out.println(inv);

        scn.close();
    }
}
