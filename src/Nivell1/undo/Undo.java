package Nivell1.undo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Undo {

    private static Undo undo;
    private static final List<String> undoList = new ArrayList<>();

    private Undo() {}

    public static Undo getUndo() {
        if (undo == null) {
            undo = new Undo();
        }
        return undo;
    }

    public List<String> getUndoList() {
        return undoList;
    }

    public void addCommand(String command) {
        undoList.add(command);
    }

    public void removeCommand(String command) {
        undoList.remove(command);
    }

    public void removeLastCommand() {
        undoList.removeLast();
    }

    @Override
    public String toString() {
        return undoList.stream().map(command -> "\t -" + command).collect(Collectors.joining("\n"));
    }
}
