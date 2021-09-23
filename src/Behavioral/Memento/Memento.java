package Behavioral.Memento;

public class Memento {
    private String fileName;
    private StringBuilder content;

    public Memento(String fileName, StringBuilder content) {
        this.fileName = fileName;
        this.content = new StringBuilder(content);
    }

    public String getFileName() {
        return fileName;
    }

    public StringBuilder getContent() {
        return content;
    }
}
