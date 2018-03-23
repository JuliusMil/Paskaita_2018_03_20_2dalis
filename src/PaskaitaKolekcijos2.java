import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PaskaitaKolekcijos2 {
    public static void main(String[] args) {
        Set<Integer> skaiciai = new TreeSet<>();


        skaiciai.add(123);
        skaiciai.add(3);
        skaiciai.add(9);
        skaiciai.add(12);
        skaiciai.add(9);
        skaiciai.forEach(System.out::println);

        Set<Person> persons = new LinkedHashSet<>(); // iraso informacija apie zmogu. "Person" konstruktorius sukuria objekta su keliais informacijos vienetais

        persons.add(new Person("Julius", "Milasius"));
        Person p= new Person("Petras", "Petraitis");
        persons.add(p);
        persons.add(new Person("Julius", "Milasius"));
        persons.forEach(pp->{
            System.out.println("Vardas "+pp.getName()+" Pavarde "+pp.getSurname() );
        });


    }
}
