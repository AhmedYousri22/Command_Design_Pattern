public class TurnOnTV implements Command {

    private TV tv;

    public TurnOnTV(TV light) {
        this.tv = light;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }

    @Override
    public void undo() {
        this.tv.turnOff();
    }
}