import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("mesarti");
        cars.add("Audi");
        cars.add("Rolls");
        for (String i : cars) {
            System.out.println(i);
        }

        cars.remove("Volvo");
        cars.remove("Volvo");
        cars.size();


        System.out.println(cars);
    }
}