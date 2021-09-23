package Behavioral.Observer;

public class Customer implements Observer {

    public Customer(OnlineStore onlineStore) {
        onlineStore.addListener(this);
    }

    public void update() {
        System.out.println("Goods arrived to the store. Make your order now");
    }

}