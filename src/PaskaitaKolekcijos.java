import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PaskaitaKolekcijos {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        names.add("Julius");
        names.add("Petras");
        names.add("Julius");
        names.add("Petras");

        names.add(2,"Jonas_2");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.get(1)); // atspausdina pirma saraso reiksme

        numbers.add(12);
        numbers.add(11);
        numbers.add(3);
        numbers.add(5);


        Collections.sort(numbers);// surusiuoja pagal dydi arba abacele jei zodziai
        Collections.reverse(numbers); // surusiuoja atvirkscia tvarka nei collection.sort
        numbers.forEach(System.out::println);
        names.forEach(a -> System.out.println("index" + names.indexOf(a) + "reiksmes" + a));
    }
}
