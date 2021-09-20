package Creational.Singleton;

public class SingletonDemo {

	/**
	 * Singleton ensures that a class has only one instance and provides a global
	 * point of access to it
	 */
	public static void main(String[] args) {
		OrderManagementService orderManagementService1 = OrderManagementService.getInstance();
		OrderManagementService orderManagementService2 = OrderManagementService.getInstance();

		// OrderManagementService orderManagementService = new OrderManagementService();

		// The output is true, since the the references pointed to the same object
		System.out.println(orderManagementService1 == orderManagementService2);

		orderManagementService1.placeOrder();
	}
}
