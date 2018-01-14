public abstract class EntertainmentDevice {
    protected int deviceState;
    protected int maxSetting;

    private int volumeLevel = 5;

    public abstract void leftButton();
    public abstract void rightButton();

    public void deviceFeedback(){
        if((deviceState > maxSetting) || (deviceState < 0))
            deviceState = 0;
        System.out.println("The device is in channel "+deviceState);
    }

    public void topButton(){
        volumeLevel ++;
        System.out.println("Volume is raise "+volumeLevel);
    }

    public void bottomButton(){
        volumeLevel --;
        System.out.println("Volume is decreased "+volumeLevel);
    }
}

class Television extends EntertainmentDevice{
    public Television(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void leftButton() {
        deviceState--;
        System.out.println("The device is in channel "+deviceState);
    }

    @Override
    public void rightButton() {
        deviceState++;
        System.out.println("The device is in channel "+deviceState);
    }
}

abstract class Remote{
    EntertainmentDevice entertainmentDevice;
    Remote(EntertainmentDevice newEntertainmentDevice){
        entertainmentDevice = newEntertainmentDevice;
    }

    public void topButton(){
        entertainmentDevice.topButton();
    }
    public void bottomButton(){
        entertainmentDevice.bottomButton();
    }

    public void leftButton(){
        entertainmentDevice.leftButton();
    }

    public void rightButton(){
        entertainmentDevice.rightButton();
    }

    public abstract void centerButton();
}

class Remote1 extends Remote{
    Remote1(EntertainmentDevice newEntertainmentDevice){
        super (newEntertainmentDevice);
    }

    @Override
    public void centerButton() {
        System.out.println("The TV is muted");
    }
}

class Remote2 extends Remote{
    Remote2(EntertainmentDevice newEntertainmentDevice){
        super(newEntertainmentDevice);
    }

    @Override
    public void centerButton() {
        System.out.println("Screen paused");
    }
}