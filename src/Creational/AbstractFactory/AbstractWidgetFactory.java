package Creational.AbstractFactory;

public interface AbstractWidgetFactory {

    Window createWindow();

    Scroll createScroll();

    Button[] createNavigationButtons();
}
