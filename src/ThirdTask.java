import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mas={};
        int kiekis=0;
        int sk=0;
      do{
          System.out.println("Veskite skaiciu tol kol bus ivestas 0");
          try {
              sk = sc.nextInt();
              if ( mas.length<=kiekis){
                  mas = Arrays.copyOf(mas, mas.length +1);
              }
              mas[kiekis++]= sk;
          } catch (InputMismatchException e){
              System.out.println("Blogai ivestas skaicius, programa baigia darba");
              sc.nextLine();
          }


      } while (sk!=0);
        System.out.println("Suma yra: "+ masSuma(mas));
    }
    private static int masSuma(int [] mas){
        int sum=0;
        for (Integer m :mas){
            sum+=m;
        }
        return sum;
    }
}
