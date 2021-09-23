package Behavioral.ChainOfResponsibility;

public class DispenserChain {

    private final DispenseChain dispenseChain1;

    public DispenserChain() {
        // Initialize the chain
        this.dispenseChain1 = new Dollar50Dispenser();
        DispenseChain dispenseChain2 = new Dollar20Dispenser();
        DispenseChain dispenseChain3 = new Dollar10Dispenser();

        // Set the chain of responsibility
        dispenseChain1.setNextLink(dispenseChain2);
        dispenseChain2.setNextLink(dispenseChain3);
    }

    public void dispense(Currency currency) {
        this.dispenseChain1.dispense(currency);
    }
}
