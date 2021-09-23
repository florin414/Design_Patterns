package Structural.Proxy.InternetAccess;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {

    private Internet internet = new DefaultInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");
    }

    @Override
    public void connectTo(String url) {
        if(bannedSites.contains(url)) {
            System.err.println("Access denied: connecting to " + url);
            return;
        }

        internet.connectTo(url);
    }
}
