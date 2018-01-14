public class Dog extends Animal{
    public Dog(String newName){
        setName(newName);
        setFlyingType(new CantFly());

    }

}
