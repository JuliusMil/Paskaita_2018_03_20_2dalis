import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] masyvas = new int[5];
        int suma = 0;

        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite " + i + " skaiciu");
            masyvas[i] = sc.nextInt();
        }
        for (Integer i : masyvas) {
            suma += i;

        }
        System.out.println("Suma: " + suma);

        for (Integer i:masyvas){
            System.out.println(i);
        }

    }
}

