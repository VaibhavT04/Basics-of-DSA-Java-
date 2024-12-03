import java.util.Scanner;

public class swastik_pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){

            if(i == (n/2)+1){
                for(int j=1; j<=n; j++){
                    System.out.print("*\t");
                }
                System.out.println();
                continue;
            }

            if(i<=n/2){
                if(i==1){
                    for(int j=1; j<=n; j++){
                        if(j==1){
                            System.out.print("*\t");
                            continue;
                        }
                        if(j>=n/2+1){
                            System.out.print("*\t");
                            continue;
                        }
                        System.out.print("\t");
                    }
                }
                else{
                    for(int j=1; j<=n; j++){
                        if(j==1 || j==n/2+1){
                            System.out.print("*\t");
                        }
                        else{
                            System.out.print("\t");
                        }
                    }
                }
            }
            else{
                if(i==n){
                    for(int j=1; j<=n; j++){
                        if(j==n){
                            System.out.print("*\t");
                            continue;
                        }
                        if(j<=n/2+1){
                            System.out.print("*\t");
                            continue;
                        }
                        System.out.print("\t");
                    }
                }
                else{
                    for(int j=1; j<=n; j++){
                        if(j==n || j==(n/2)+1){
                            System.out.print("*\t");
                        }
                        else{
                            System.out.print("\t");
                        }
                    }
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
