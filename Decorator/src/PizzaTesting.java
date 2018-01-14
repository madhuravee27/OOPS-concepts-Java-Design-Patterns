public class PizzaTesting {
    public static void main(String[] args) {
        Pizza testPizza = new TomatoSauce(new Mozarella(new ThreeCheese()));
        System.out.println(testPizza.getDescription());
        System.out.println(testPizza.getCost());
    }
}
