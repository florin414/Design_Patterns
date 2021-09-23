package Behavioral.TemplateMethod;

public class Demo {

    /**
     * This pattern allows us to define skeletons of the algorithms and lets subclasses define
     * the specific steps of this algorithm. For example, if we want to create a document reader,
     * the abstraction can be done for each document. Each document is read in a specific way, but
     * the operations of reading, editing etc. are the same.
     *
     * Checklist:
     *
     * 1. Examine the algorithm and think how to split the algorithm into different steps
     * 2. Create an abstract class and define template method there
     * 3. Put each step of the algorithm in the separate method. Describe method invocation sequence
     * in template method
     * 4. Identify places for hooks in your algorithm
     * 5. Create concrete classes that implement the required steps in the algorithm
     */

    public static void main(String[] args) {

        CrossCompiler iosCompiler = new IOSCompiler();
        iosCompiler.compile();

        System.out.println("=============================");

        CrossCompiler androidCompiler = new AndroidCompiler();
        androidCompiler.compile();
    }
}
