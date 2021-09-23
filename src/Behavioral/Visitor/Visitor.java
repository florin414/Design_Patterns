package Behavioral.Visitor;

public interface Visitor {

    void visit(IndustrialBuilding ib);

    void visit(Park park);

    void visit(PrivateBuilding pb);

    void visit(ShoppingCenter sc);

}