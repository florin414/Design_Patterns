package Behavioral.Visitor;

public class XMLExportVisitor implements ExportVisitor {

    @Override
    public void visit(IndustrialBuilding ib) {
        System.out.println("XML Export for industrial building");
    }

    @Override
    public void visit(Park park) {
        System.out.println("XML Export for park");
    }

    @Override
    public void visit(PrivateBuilding pb) {
        System.out.println("XML Export for private building");
    }

    @Override
    public void visit(ShoppingCenter sc) {
        System.out.println("XML Export for shopping center");
    }
}