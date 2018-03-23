import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema_pagrindai_uzd_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkite kieno plota norite skaiciuoti: \n1: Staciojo trikampio. \n2: Staciakampio. \n3: Kvadrato. \n4: Apskritimo. ");
        int pasirinkimas = sc.nextInt();
        switch (pasirinkimas) {
            case 1:
                System.out.println("Skaiciuojame staciojo trikampio plota:Iveskite statinius a ir b.");
                double trik_a = getCorrectNumber();
                double trik_b =getCorrectNumber();
                System.out.println("Plotas: " + statusisTrikampis(trik_a, trik_b));
                break;
            case 2:
                System.out.println("Skaiciuojame staciakampio plota: Iveskita statinius a ir b");
                double stac_a = getCorrectNumber();
                double stac_b = getCorrectNumber();
                System.out.println("Plotas: " + Staciakampis(stac_a, stac_b));
                break;
            case 3:
                System.out.println("Skaiciuojame kvadrato plota: Iveskita statini a:");
                double kvad_a = getCorrectNumber();
                System.out.println("Plotas: " + Kvadratas(kvad_a));
                break;
            case 4:
                System.out.println("Skaiciuojame apskritimo plota: Iveskita skersmeni a:");
                double apskrit_a = getCorrectNumber();
                System.out.println("Plotas: " + Apskritimas(apskrit_a));
                break;
            default:
                System.out.println("Blogas pasirinkimas:");
                break;
        }

    }

    private static double statusisTrikampis(double a, double b) {

        double plotas = (a * b) / 2;
        return plotas;
    }

    private static double Staciakampis(double a, double b) {
        double plotas = a * b;
        return plotas;
    }

    private static double Kvadratas(double a) {
        double plotas = a * a;
        return plotas;

    }

    private static double Apskritimas(double a) {

        double plotas = Math.PI * (Math.pow(a, 2));
        return plotas;
    }
    private static double getCorrectNumber(){
        double result= 0.0;
        Scanner sc= new Scanner(System.in);
        while (true){
            try{
                result=sc.nextDouble();
                break;
            } catch (InputMismatchException e){
                System.out.println("blogas skaicius bandykite dar karta");
                sc.nextInt();
            }
        }
        return result;
    }
}
