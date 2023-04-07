package patterns.behavioral.iterator;

public class MapPointRunner {
    public static void main(String[] args) {
        String[] points = {"A", "B", "C", "D"};

        TouristMap touristMap = new TouristMap("travel_1", points);

        Iterator iterator = touristMap.getIterator();

        System.out.println("Travel: " + touristMap.getName());
        System.out.println("Points: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }

    }
}
