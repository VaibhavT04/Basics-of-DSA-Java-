import java.util.Scanner;

public class rotate_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        System.out.println("How much to rotate: ");
        int r = scn.nextInt();

        int length =0;
        int temp = n;
        while(temp!=0){
            length++;
            temp= temp/10;
        }

        if(r<0){
            r = length+r;
        }

        int first = n/(int)Math.pow(10, r);
        int last = n%(int)Math.pow(10, r);

        int rotated_number = (last * (int)Math.pow(10, length-r)) + first;

        System.out.println("The rotated number is: " + rotated_number);

        scn.close();
    }
}
