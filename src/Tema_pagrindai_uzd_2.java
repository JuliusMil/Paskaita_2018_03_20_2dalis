import java.util.Scanner;

public class Tema_pagrindai_uzd_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Iveskite zodi arba sakini");
        String zodis= sc.nextLine();
       tikrinaArPolindromas(zodis);

    }
    public static void tikrinaArPolindromas(String zodis){
        zodis= zodis.replaceAll(" ","");
        for (int i=0; i<zodis.length(); i++){
            char pradzia=zodis.charAt(i);
            char galas = zodis.charAt(zodis.length()-1);
            if (pradzia!=galas){
                System.out.println("Zodis nera polindromas");
                break;
            }
            else if (i==zodis.length()-1){
                System.out.println("Zodis yra polindromas");

            }
        }
    }
}
