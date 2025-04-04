package Flyweight_Pattern;
public class main {
    public static void main(String[] args) {
        Marker marker1 = new Marker("Location 1", "restaurant");
        Marker marker2 = new Marker("Location 2", "hospital");
        Marker marker3 = new Marker("Location 3", "restaurant");
        Marker marker4 = new Marker("Location 4", "gasStation");
        Marker marker5 = new Marker("Location 5", "hospital");
        marker1.display();
        marker2.display();
        marker3.display();
        marker4.display();
        marker5.display();
        System.out.println("Unique styles created: " + MarkerStyleFactory.getUniqueStylesCount());
        System.out.println("Total markers created: 5");
    }
}
