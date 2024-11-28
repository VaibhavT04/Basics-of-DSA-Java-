import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int length = 0;

        while(n>0){
            length++;
            n = n/10;
        }

        System.out.println(length);
        scn.close();
    }
}
