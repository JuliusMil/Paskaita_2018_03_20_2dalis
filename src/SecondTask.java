import java.util.Scanner;

public class SecondTask {
    private static final int MAX_NUMB = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu noresite uzpildyti");
        int kiek = sc.nextInt();
        int[] masyvas = new int[kiek];
        for (int i = 0; i < kiek; i++) {
            System.out.println("Iveskite " + i + " skaiciu");
            masyvas[i] = sc.nextInt();
        }

        PrintMas(masyvas);
    }

    private static void PrintMas(int[] skMasyvas) {
        for (Integer sk : skMasyvas) {
            if (sk >= MAX_NUMB) {
                System.out.println(sk); // "println" spausdina viena eilute ir soka i nauja. "print" spausdina viska vienoje eiluteje

            }

        }

    }
}
