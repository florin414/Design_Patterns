package Creational.Singleton;

public class SingletonDemo {

	/**
	 * Singleton ensures that a class has only one instance and provides a global
	 * point of access to it
	 *
	 * Checklist:
	 *
	 * 1. Define a private static field in the "singleton" class
	 * 2. Make the constructor private
	 * 3. Implement public accessor function
	 * 4. Implement lazy initialization - that is created in the first use - inside the accessor function
	 * 5. Make sure that accessor function is synchronized in case it is going to be used in a multithreaded environment
	 */
	public static void main(String[] args) {
		OrderManagementService orderManagementService1 = OrderManagementService.getInstance();
		OrderManagementService orderManagementService2 = OrderManagementService.getInstance();

		// OrderManagementService orderManagementService = new OrderManagementService();

		// The output is true, since the references are pointing to the same object
		System.out.println(orderManagementService1 == orderManagementService2);

		orderManagementService1.placeOrder();
	}
}
