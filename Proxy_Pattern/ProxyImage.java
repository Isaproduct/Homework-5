public class ProxyImage implements Image {
    private RealImage realImage;
    private String imagePath;
    private String thumbnailPath;
    private boolean isImageLoaded;
    public ProxyImage(String imagePath, String thumbnailPath) {
        this.imagePath = imagePath;
        this.thumbnailPath = thumbnailPath;
        this.isImageLoaded = false;
    }
    @Override
    public void display() {
        if (!isImageLoaded) {
            showThumbnail();
            realImage = new RealImage(imagePath);
            isImageLoaded = true;
        }
        realImage.display();
    }
    private void showThumbnail() {
        System.out.println("Displaying thumbnail: " + thumbnailPath);
    }
}
