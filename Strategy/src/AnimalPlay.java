public class AnimalPlay {
    public static void main(String[] args) {
        Dog sparky = new Dog("Sparky");
        Bird tweety = new Bird("Tweety");
        System.out.println("Dog:"+sparky.getName());
        System.out.println(sparky.flyingAbility());
        System.out.println("Bird:"+tweety.getName());
        System.out.println(tweety.flyingAbility());
        sparky.setFlyingType(new CanFly());
        System.out.println("Now Sparky says:"+ sparky.flyingAbility());
    }

}
