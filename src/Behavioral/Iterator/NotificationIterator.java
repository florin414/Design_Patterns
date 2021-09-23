package Behavioral.Iterator;

public class NotificationIterator implements Iterator {

    private Notification[] notificationList;
    private int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return ((pos < notificationList.length) && (notificationList[pos] != null));
    }

    @Override
    public Object next() {

        // Return the element in the array and increment the position
        Notification notification = notificationList[pos];
        pos++;
        return notification;
    }
}
