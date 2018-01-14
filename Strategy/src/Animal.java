public class Animal {
    private String name;

    private Flys flyingType;

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setFlyingType(Flys newFlyingType){
        this.flyingType = newFlyingType;
    }

    public String flyingAbility(){
        return flyingType.fly();
    }
}
