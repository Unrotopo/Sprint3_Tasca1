package Nivell1.commander;

import Nivell1.undo.Undo;

import java.util.Scanner;

import static Nivell1.undo.Undo.getUndo;

public class Commander {

    private static Scanner scanner = new Scanner(System.in);

    public void command() {
        int option;

        do {
            System.out.println("""
                    \n
                    ---- Select an option -----
                    1. Write command
                    2. Remove command from history
                    3. Undo command
                    4. Show command history
                    0. Exit
                    """);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print(">");
                    addCommand(scanner.nextLine());
                    break;
                case 2:
                    System.out.print(">");
                    removeCommand(scanner.nextLine());
                    break;
                case 3:
                    removeLastCommand();
                    break;
                case 4:
                    showCommands();
                    break;
            }
        } while (option != 0);
    }

    private void addCommand(String command) {
        Undo undo = getUndo();
        undo.addCommand(command);
    }

    private void removeCommand(String command) {
        Undo undo = getUndo();
        undo.removeCommand(command);
    }

    private void removeLastCommand() {
        Undo undo = getUndo();
        undo.removeLastCommand();
    }

    private void showCommands() {
        Undo undo = getUndo();
        System.out.println(undo);
    }
}
