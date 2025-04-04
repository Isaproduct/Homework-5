package Proxy_Pattern;

public class ProtectionProxy implements Image {
    private ProxyImage proxyImage;
    private String imagePath;
    private String thumbnailPath;
    private boolean isLoggedIn;

    public ProtectionProxy(String imagePath, String thumbnailPath, boolean isLoggedIn) {
        this.imagePath = imagePath;
        this.thumbnailPath = thumbnailPath;
        this.isLoggedIn = isLoggedIn;
        this.proxyImage = new ProxyImage(imagePath, thumbnailPath);
    }

    @Override
    public void display() {
        if (!isLoggedIn) {
            System.out.println("Access Denied: Only logged-in users can display images.");
            return;
        }
        proxyImage.display();
    }

    public void uploadImage() {
        if (!isLoggedIn) {
            System.out.println("Access Denied: Only logged-in users can upload images.");
            return;
        }
        System.out.println("Uploading image: " + imagePath);
    }

    public void replaceImage() {
        if (!isLoggedIn) {
            System.out.println("Access Denied: Only logged-in users can replace images.");
            return;
        }
        System.out.println("Replacing image: " + imagePath);
    }
}
