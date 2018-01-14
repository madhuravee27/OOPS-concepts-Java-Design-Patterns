public class TVTest {
    public static void main(String[] args) {
        EntertainmentDevice entertainmentDevice = new Television(200, 400);
        entertainmentDevice.rightButton();
        entertainmentDevice.leftButton();
        entertainmentDevice.topButton();
        entertainmentDevice.bottomButton();

        Remote remote1 = new Remote1(entertainmentDevice);
        remote1.rightButton();
        remote1.leftButton();
        remote1.topButton();
        remote1.bottomButton();
        remote1.centerButton();

        Remote remote2 = new Remote2(entertainmentDevice);
        remote2.rightButton();
        remote2.leftButton();
        remote2.topButton();
        remote2.bottomButton();
        remote2.centerButton();
    }
}
