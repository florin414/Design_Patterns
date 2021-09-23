package Behavioral.Iterator;

public class NotificationCollection implements Collection {

    public final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection() {
        this.notificationList = new Notification[MAX_ITEMS];
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);

        if(numberOfItems >= MAX_ITEMS) {
            System.out.println("FULL");
        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
