package Behavioral.Visitor;

public class JSONExportVisitor implements ExportVisitor {

    @Override
    public void visit(IndustrialBuilding ib) {
        System.out.println("JSON Export for industrial building");
    }

    @Override
    public void visit(Park park) {
        System.out.println("JSON Export for park");
    }

    @Override
    public void visit(PrivateBuilding pb) {
        System.out.println("JSON Export for private building");
    }

    @Override
    public void visit(ShoppingCenter sc) {
        System.out.println("JSON Export for shopping center");
    }

}