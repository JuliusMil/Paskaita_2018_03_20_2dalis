import java.util.Scanner;

public class FistTask {
    // ctrl+ aslt+l -> formatuoja koda
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " yra lyginis");
        } else {
            System.out.println(number + " yra nelyginis");
        }
    }
}
