public class Marker {
    private MarkerStyle style;
    private String location;

    public Marker(String location, String styleType) {
        this.location = location;
        this.style = MarkerStyleFactory.getMarkerStyle(styleType);
    }

    public void display() {
        System.out.println("Marker at: " + location);
        style.display();
    }
}
