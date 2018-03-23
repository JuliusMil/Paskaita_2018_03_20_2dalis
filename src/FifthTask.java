import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] masyvas = new String[5];

        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite zodi");
            masyvas[i] = sc.next();
        }
        for (String i : masyvas) {
            System.out.print(i + " ");
        }
    }
}