package Behavioral.TemplateMethod;

public class AndroidCompiler extends CrossCompiler {

    @Override
    protected void reserveRam() {
        System.out.println("Android: Ram is reserved for compilation process");
    }

    protected void collectSources() {
        System.out.println("Collect Android specific sources");
    }

    protected void compileToTarget() {
        System.out.println("Android compilation");
    }
}