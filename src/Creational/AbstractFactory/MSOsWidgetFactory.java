package Creational.AbstractFactory;

public class MSOsWidgetFactory implements AbstractWidgetFactory {

    public Window createWindow() {
        return new MSOsWindow();

    }

    @Override
    public Scroll createScroll() {
        return new MSOsScroll();
    }

    @Override
    public Button[] createNavigationButtons() {
        return new Button[]{
                new MSOsButton("close window"),
                new MSOsButton("expand window"),
                new MSOsButton("collapse window"),
                new MSOsButton("back"),
        };
    }

}