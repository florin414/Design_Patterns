package Behavioral.Memento;

import groovy.transform.ToString;

import java.util.ArrayList;
import java.util.List;

public class FileWriterCareTaker {
    private List<Memento> mementoList = new ArrayList<>();
    private static int curr_index = -1;
    private static int max_index = -1;

    public void save(Memento state) {
        mementoList.add(state);
        max_index++;
        curr_index = max_index;
    }

    public Memento undo() {
        curr_index--;
        return mementoList.get(curr_index);
    }

    public Memento redo() {
        curr_index++;
        return mementoList.get(curr_index);
    }

    @Override
    public String toString(){
        return mementoList.get(curr_index).getContent().toString();
    }
}
