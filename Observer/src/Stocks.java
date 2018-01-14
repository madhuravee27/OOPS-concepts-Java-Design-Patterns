public class Stocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        stockGrabber.updateIBM(123);
        stockGrabber.updateAPPLE(145);
        stockGrabber.updateGOOGLE(56);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.updateIBM(23);
        stockGrabber.updateAPPLE(245);
        stockGrabber.updateGOOGLE(156);

        stockGrabber.unregisterObserver(stockObserver2);

        stockGrabber.updateIBM(523);
        stockGrabber.updateAPPLE(45);
        stockGrabber.updateGOOGLE(15);



    }
}
