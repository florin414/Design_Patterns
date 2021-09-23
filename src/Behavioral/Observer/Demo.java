package Behavioral.Observer;

import java.util.Scanner;

public class Demo {

    /**
     * This pattern defines a one-to-many dependency between objects, so when one object
     * changes its state, all of its dependents are notified and updated automatically.
     *
     * Checklist:
     *
     * 1. Separate dependent and independent behaviour. Dependent behaviour should be executed
     * in case when some event happens.
     * 2. When you separated these types of behaviour, make sure you have separate hierarchy
     * for your subject with independent behaviour and hierarchy of observers with dependent
     * behaviour.
     * 3. Make sure that in Observer interface you have method for notification
     * 4. Subject may store references to observers.
     * 5. Observers should register themselves in subject object.
     * 6. Subject notifies all observers about event when it happens.
     * 7. Subject may 'push' information to observers, or let observers 'pull' needed information
     * from subject object.
     */

    public static void main( String[] args ) {
        OnlineStore store = new OnlineStore();

        new Customer(store);
        new Customer(store);
        new Customer(store);

        Scanner sc = new Scanner(System.in);
        boolean isArrived = false;
        while (!isArrived) {
            System.out.print("Are goods arrived to the store? ");
            isArrived = sc.nextBoolean();
        }
        store.setState(isArrived);
    }
}