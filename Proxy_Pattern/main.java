package Proxy_Pattern;
public class main {
    public static void main(String[] args) {
        ProtectionProxy loggedInAgent = new ProtectionProxy("high_res_image1.jpg", "thumb1.jpg", true);
        loggedInAgent.display();
        loggedInAgent.uploadImage();
        loggedInAgent.replaceImage();
        System.out.println();
        ProtectionProxy nonLoggedInAgent = new ProtectionProxy("high_res_image2.jpg", "thumb2.jpg", false);
        nonLoggedInAgent.display();
        nonLoggedInAgent.uploadImage();
        nonLoggedInAgent.replaceImage();
    }
}
