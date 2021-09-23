package Behavioral.ChainOfResponsibility;

public interface DispenseChain {

    void setNextLink(DispenseChain nextChain);

    void dispense(Currency cur);
}