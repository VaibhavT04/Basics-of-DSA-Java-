import java.util.*;

public class ipnop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int age = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();

        System.out.println("Hello " + name + ". Your age is " + age);

        scn.close();
    }
}
