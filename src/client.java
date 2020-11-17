public class client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        TurnOnLight turnOnLightCommand = new TurnOnLight(light);
        TurnOffLight turnOffLightCommand = new TurnOffLight(light);
        TV tv = new TV();
        TurnOnTV turnOnTVCommand = new TurnOnTV(tv);
        TurnOffTV turnOffTVCommand = new TurnOffTV(tv);


        remoteControl.addCommand(0, turnOnLightCommand, turnOffLightCommand);
        remoteControl.addCommand(1, turnOnTVCommand, turnOffTVCommand);
        System.out.println(" Executing Commands");
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);

        remoteControl.offButtonPressed(0);
        remoteControl.offButtonPressed(1);


        System.out.println(" Undoing Commands");

        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();

    }
}


