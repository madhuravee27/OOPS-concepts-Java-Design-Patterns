public interface GetATMData {
    public ATMState getATMState();
    public int getCashInMachine();
}

class ATMMachine implements GetATMData{


    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

    // NEW STUFF

    public ATMState getATMState() { return atmState; }
    public int getCashInMachine() { return cashInMachine; }
}

class ATMProxy implements GetATMData {

    // Allows the user to access getATMState in the
    // Object ATMMachine

    public ATMState getATMState() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getATMState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine

    public int getCashInMachine() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getCashInMachine();

    }

}

interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);

}