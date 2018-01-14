public interface Flys {
    String fly();
}

class CantFly implements Flys{
    public String fly(){
        return "I can't fly";
    }
}

class CanFly implements Flys{
    public String fly(){
        return "I can fly";
    }
}