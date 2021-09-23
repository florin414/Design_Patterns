package Behavioral.Memento;

public class Demo {

    /**
     * This pattern allows us to capture and store previous states of an object.
     *
     * Checklist:
     *
     * 1. Identify and split roles of originator and caretaker between classes.
     * 2. Create memento type that contains enough information to restore originator object.
     * 3. Originator object may create memento objects.
     * 4. Originator may re-instantiate itself using saved state in memento object
     */

    public static void main(String[] args) {
        FileWriterCareTaker careTaker = new FileWriterCareTaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

        // Writing to the editor
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.write("3\n");

        System.out.print(fileWriter);
        System.out.println("---------------------");

        // Saving a snapshot
        careTaker.save(fileWriter.save());

        // Writing again to the editor
        fileWriter.write("2\n");
        System.out.print(fileWriter);
        careTaker.save(fileWriter.save());
        System.out.println("---------------------");

        // Restore the previous snapshot
        careTaker.undo();
        System.out.print(careTaker);
        System.out.println("---------------------");

        // Redo the previous snapshot
        careTaker.redo();
        System.out.print(careTaker);
    }
}
