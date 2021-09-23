package Behavioral.TemplateMethod;

public abstract class CrossCompiler {

    public final void compile() {
        collectSources();
        reserveRam();
        compileToTarget();
        compilationStatusNotification();
    }

    private void compilationStatusNotification() {
        System.out.println("Compilation is successful");
    }

    protected abstract void reserveRam();

    protected abstract void collectSources();

    protected abstract void compileToTarget();



}