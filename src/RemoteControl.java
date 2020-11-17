import java.util.LinkedList;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    private LinkedList<Command> history;

    private final int SLOTS = 4;

    public RemoteControl() {
        onCommands = new Command[SLOTS];
        offCommands = new Command[SLOTS];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < SLOTS; i++) {
            onCommands[i] =noCommand;
            offCommands[i] =noCommand;
        }

        history = new LinkedList<>();
    }


    public void addCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        history.push(onCommands[slot]);
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        history.push(offCommands[slot]);
    }

    public void undoButtonPressed() {
        if (history.peek() != null) {
            history.poll().undo();
        }else {
            System.out.println("No more history");
        }
    }


}