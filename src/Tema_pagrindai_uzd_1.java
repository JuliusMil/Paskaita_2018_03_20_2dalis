import java.util.Scanner;

public class Tema_pagrindai_uzd_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Iveskite zodi. Jei norite baigti iveskite pabaiga");
            String zodis= sc.nextLine();
            if (zodis.toLowerCase().equals("pabaiga")){
                break;
            }

            if (zodis.length() %2==0){
                System.out.println("Ivestas zodis"+ zodis+"yra lyginis, jo ilgis "+zodis.length());
            }else{
                System.out.println("Ivestas zodis"+ zodis+ "yra nelyginis, jo ilgis "+zodis.length());
            }
            char letter='a';
            System.out.println("Radome " + letter+ " raidziu"+ countHowLetterHaveWord(zodis,letter));

        }
    }
    private static int countHowLetterHaveWord(String word, char letter){
        int count = 0;

        for (int i= 0; i<word.length(); i++){
            if (word.charAt(i)==letter){ // ima kiekviena raide zodyje ir tikrine ar ji yra tokia pati kaip musu duota raide ir skaiciuoja j
                count++;
            }
        }

        return count;
    }
}
