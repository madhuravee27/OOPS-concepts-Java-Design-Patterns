import java.util.ArrayList;

public interface Subject {
    void registerObserver (Observer o);
    void unregisterObserver (Observer o);
    void notifyObserver();
}

class StockGrabber implements Subject{
    private int ibmPrice;
    private int aaplPrice;
    private int googPrice;
    private ArrayList<Observer> observers;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void unregisterObserver(Observer o){
        int indexOfObserver = observers.indexOf(o);
        System.out.println("Observer "+(indexOfObserver+1)+" is removed!");
        observers.remove(indexOfObserver);
    }

    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void updateIBM(int newibmPrice){
        this.ibmPrice = newibmPrice;
        notifyObserver();
    }

    public void updateAPPLE(int newaaplPrice){
        this.aaplPrice = newaaplPrice;
        notifyObserver();
    }

    public void updateGOOGLE(int newgoogPrice){
        this.googPrice = newgoogPrice;
        notifyObserver();
    }
}
