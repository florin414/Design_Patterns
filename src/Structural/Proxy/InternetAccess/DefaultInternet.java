package Structural.Proxy.InternetAccess;

public class DefaultInternet implements Internet {

    @Override
    public void connectTo(String url) {
        System.out.println("Connecting to " + url);
    }
}
