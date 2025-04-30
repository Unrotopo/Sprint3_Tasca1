package Nivell3.parkingBusiness;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParkingValet {

    private List<Command> parkingTasks = new ArrayList<>();

    public void getTask(Command command) {
        parkingTasks.add(command);
    }

    public void completeTask(int actions) {
        int executed = 0;
        Iterator<Command> iterator = parkingTasks.iterator();

        while (iterator.hasNext() && executed < actions) {
            Command command = iterator.next();
            command.execute();
            iterator.remove();
            executed++;
        }
        System.out.println(" -- The parking guy is taking a break -- ");
    }
}
