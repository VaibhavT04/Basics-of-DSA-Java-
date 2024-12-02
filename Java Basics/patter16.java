import java.util.Scanner;

public class patter16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 2*n - 3;
        int val = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(val + "\t");
                val++;
            }
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=i; j++){
                val--;
                if(i==n && j==1){
                    continue;
                }
                System.out.print(val + "\t");
            }
            sp-=2;
            val = 1;
            System.out.println();
        }
        scn.close();
    }
}
