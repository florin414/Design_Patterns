package Behavioral.Memento;

public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString(){
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    // Restore into its earlier state
    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.getFileName();
        this.content = memento.getContent();
    }
}
