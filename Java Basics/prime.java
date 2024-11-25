import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i=0; i<t; i++){
            int n = scn.nextInt();
            int count = 0;

            for(int d=2; d*d<=n; d++){
                if(n%d == 0){
                    count++;
                    break;
                }
            }

            if(count > 0)
                { System.out.println("not prime"); }
            else
                { System.out.println("prime"); }
        }

        scn.close();
    }
}
