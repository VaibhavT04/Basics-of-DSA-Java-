import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int nos = 1;

        for(int i=1; i<=n; i++){
            int t = i;
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=nos; j++){
                if(j<=(nos/2)){
                    System.out.print(t + "\t");
                    t++;
                }
                else{
                    System.out.print(t + "\t");
                    t--;
                }
            }

            if(i<=n/2){
                sp--;
                nos += 2;
            }
            else{
                sp++;
                nos -= 2;
            }
            System.out.println();
        }
        scn.close();
    }
}
