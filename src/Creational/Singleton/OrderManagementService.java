package Creational.Singleton;

public class OrderManagementService {
	private static OrderManagementService instance;

	private OrderManagementService() {

	}

	/**
	 * Method used to create an object of type OrderManagementService
	 * 
	 * @return
	 * A pointer to the global OrderManagementService
	 */
	public static synchronized OrderManagementService getInstance() {
		if (instance == null) {
			instance = new OrderManagementService();
		}

		return instance;
	}

	public void placeOrder() {
		System.out.println("Place order method is invoked");
	}
}
