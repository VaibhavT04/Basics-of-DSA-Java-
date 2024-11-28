import java.util.Scanner;

public class print_digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int length = 0;
        int temp = n;
        while(temp != 0){
            length++;
            temp = temp/10;
        }

        int div = (int)(Math.pow(10, length-1));

        while (n!=0) {
            int x = n/div;
            System.out.println(x);
            n = n%div;
            div = div/10;
        }

        // System.out.println(length);
        scn.close();
    }
}
