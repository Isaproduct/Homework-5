public class RealImage implements Image {
    private String imagePath;

    public RealImage(String imagePath) {
        this.imagePath = imagePath;
        loadHighResolutionImage();
    }

    private void loadHighResolutionImage() {
        System.out.println("Loading high-resolution image: " + imagePath);
    }

    @Override
    public void display() {
        System.out.println("Displaying full-resolution image: " + imagePath);
    }
}
