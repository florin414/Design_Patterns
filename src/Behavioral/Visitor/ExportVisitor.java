package Behavioral.Visitor;


public interface ExportVisitor extends Visitor {

    default void export(GeoElement... elements) {
        for (GeoElement geoElement : elements) {
            geoElement.accept(this);
        }
    }
}