public interface Observer {
    void update(int ibmPrice, int aaplPrice, int googPrice);
}

class StockObserver implements Observer{
    private int ibmPrice;
    private int aaplPrice;
    private int googPrice;

    Subject stockGrabber;

    private static int observerID=0;

    public StockObserver(StockGrabber stockGrabber){
        System.out.println("New observer:"+(observerID + 1));
        stockGrabber.registerObserver(this);
        observerID++;
    }

    public void update (int newibmPrice, int newaaplPrice, int newgoogPrice){
        ibmPrice = newibmPrice;
        aaplPrice = newaaplPrice;
        googPrice = newgoogPrice;
        System.out.println("IBM = "+ibmPrice+"\nAPPLE = "+aaplPrice+"\nGOOGLE = "+googPrice);
    }
}
