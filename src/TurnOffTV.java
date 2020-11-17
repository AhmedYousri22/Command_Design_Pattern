public class TurnOffTV implements Command {

    private TV tv;

    public TurnOffTV(TV light) {
        this.tv = light;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }

    @Override
    public void undo() {
        this.tv.turnOn();
    }
}