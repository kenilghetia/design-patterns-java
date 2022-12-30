package commandPattern;

public class SetTopBoxOnCommand implements Command {

    SetTopBox setTopBox;

    public SetTopBoxOnCommand(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    public void execute() {
        setTopBox.ON();
        setTopBox.setChannel(134);
        setTopBox.setVolume(52);
    }
}
