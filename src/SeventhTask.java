import java.util.Arrays;
import java.util.Scanner;

public class SeventhTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int j;
        int[][] masyvas = new int[2][3];

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Iveskite " + i + " " + j + " skaiciu");
                masyvas[i][j] = sc.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(masyvas));






        }
        }



