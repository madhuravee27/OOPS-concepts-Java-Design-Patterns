public class Bird extends Animal{
    public Bird(String newName){
        //System.out.println(super.getName());
        //System.out.println(super.flyingAbility());
        setName(newName);
        setFlyingType(new CantFly());

    }

}