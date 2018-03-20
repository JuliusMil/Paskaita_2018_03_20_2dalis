public class MyFirstClass {
// psvm sukuria public static void main
    public static void main(String[] args) {
        // sout (enter) atspausdinimui
        System.out.println("Hello world");

        int a = 10;
        // suskurtas objektasd
        MyFirstClass myFirstClass= new MyFirstClass();
// ne statinis metodas kvieciamas statiniame per klases objekta
        myFirstClass.myNotStaticMethod(a);
        // tiesiog per varda toje pacioje klaseje
        myStaticMethod();

        float b= 4.6f;
        double c=2.4;

        boolean d =true; // arba false (default reiksme)

        char e= 'A';

        String f = " This is string!!";

    }

    private void myNotStaticMethod(int numb){
        System.out.println("Jusu skaicius "+ numb);
    }

    private static void myStaticMethod(){
        System.out.println("Cia yra statinis metodas");
    }
}
