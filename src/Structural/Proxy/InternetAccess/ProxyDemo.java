package Structural.Proxy.InternetAccess;

public class ProxyDemo {

    /**
     * This pattern allows us to create a real object only when necessary.
     * The creation of the real object is done by dynamically binding the real
     * object to the reference inside the proxy. It may look like a singleton in this
     * example, but the proxy just calls the methods of the real object after its
     * initialization.
     *
     * Checklist:
     *
     * 1. Declare interface for wrapper and for original type
     * 2. Create proxy type that implements current interface
     * 3. Aggregate object that you want to wrap in your proxy type
     * 4. Implement logic with interaction with the original object
     */

    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        internet.connectTo("google.com");
        internet.connectTo("facebook.com");
    }
}
