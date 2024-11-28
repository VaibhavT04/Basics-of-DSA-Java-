import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        int prev = 0;
        int curr = 1;
        
        for(int i=0; i<n; i++){
            System.out.println(prev);
            int x = curr+prev;
            prev = curr;
            curr = x;
        }
        scn.close();
    }
}
