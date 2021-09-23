package Behavioral.TemplateMethod;

public class IOSCompiler extends CrossCompiler {

    @Override
    protected void reserveRam() {
        System.out.println("IOS: Ram is reserved for compilation process");
    }

    protected void collectSources() {
        System.out.println("Collect IOS specific sources");
    }

    protected void compileToTarget() {
        System.out.println("IOS compilation");
    }
}
