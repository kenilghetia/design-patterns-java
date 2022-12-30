package commandPattern;

public class SetTopBox {

    public void ON()
    {
        System.out.println("SetTopBox is ON");
    }

    public void OFF()
    {
        System.out.println("SetTopBox is OFF");
    }
    public void setChannel(int defaultChannel)
    {
        System.out.println("SetTopBox is set to Channel:" +defaultChannel);
    }
    public void setVolume(int volume)
    {
        System.out.println("SetTopBox volume is set to:" +volume);
    }
}
