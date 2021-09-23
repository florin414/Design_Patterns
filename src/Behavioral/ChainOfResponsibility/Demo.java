package Behavioral.ChainOfResponsibility;

import java.util.Scanner;

public class Demo {

    /**
     * This design pattern allows us to process an input by passing it to the correct executor class.
     * The request is passed initially to the first executor, but it can forward it to the next executor.
     *
     * Checklist:
     *
     * 1. Create interface of event handler and declare method of event handling
     * 2. Make sure that each implementation of the chain interface may contain the reference to
     * the next link in the chain
     * 3. Each chain interface implementation contributes to the event handling
     * 4. If the request is needed to be passed forward, link object calls the method on the next
     * element in the chain
     * 5. Client creates chain depending on the business logic and launches chain from the root
     */

    public static void main(final String[] args) {
        DispenserChain atmDispenser = new DispenserChain();

        int amount;
        System.out.print("Enter amount to dispense as multiple of 10: ");

        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
            return;
        }
        // Process the request
        atmDispenser.dispense(new Currency(amount));

        input.close();
    }
}