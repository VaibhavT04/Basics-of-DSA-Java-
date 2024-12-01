import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int m = -1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=1; j<=m; j++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }

            if(i<=n/2){
                sp--;
                m+=2;
            }
            else{
                sp++;
                m-=2;
            }
            System.out.println();
        }
        scn.close();
    }
}
