package commandPattern;

public class SetTopBoxOffCommand implements Command {
    SetTopBox setTopBox;

    public SetTopBoxOffCommand(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    public void execute() {
        setTopBox.OFF();
    }
}
