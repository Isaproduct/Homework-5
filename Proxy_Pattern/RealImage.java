package Proxy_Pattern;
public class RealImage implements Image {
    private String imagePath;
    private boolean isLoaded;
    public RealImage(String imagePath) {
        this.imagePath = imagePath;
        this.isLoaded = false;
    }
    private void loadHighResolutionImage() {
        if (!isLoaded) {
            System.out.println("Loading high-resolution image: " + imagePath);
            isLoaded = true;
        }
    }
    @Override
    public void display() {
        loadHighResolutionImage();
        System.out.println("Displaying full-resolution image: " + imagePath);
    }
}
