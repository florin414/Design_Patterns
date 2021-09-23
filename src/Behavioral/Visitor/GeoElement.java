package Behavioral.Visitor;


public interface GeoElement {

    void accept(Visitor visitor);
}