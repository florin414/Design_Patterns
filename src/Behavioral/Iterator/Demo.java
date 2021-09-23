package Behavioral.Iterator;

public class Demo {

    /**
     * This pattern allows us to iterate through collections of items.
     *
     * Checklist:
     *
     * 1. Define iterator interface with at least hasNext() and next() methods
     * 2. In your object that serves as a container declare a method to return an iterator
     * 3. Create implementation of iterator interface for collection that you need to iterate over
     * 4. Client requests iterator and uses it for iteration over elements in container
     */

    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        notificationCollection.addItem("Notification 1");
        notificationCollection.addItem("Notification 2");

        NotificationBar notificationBar = new NotificationBar(notificationCollection);

        notificationBar.printNotifications();
    }
}
