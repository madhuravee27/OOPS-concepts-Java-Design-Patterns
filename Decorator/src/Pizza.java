public interface Pizza {
    public String getDescription();
    public double getCost();
}

class PlainPizza implements Pizza{
    private String description = "Thin dough ";
    private double cost = 3.00;

    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

class ThreeCheese implements Pizza{
    private String description = "Provolone, Cheddar, Pepperjack ";
    private double cost = 4.00;

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

}


class Topping implements Pizza{
    Pizza pizza;
    Topping(Pizza newPizza){
        pizza = newPizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}

class Mozarella extends Topping{
    Mozarella(Pizza newpizza){
        super(newpizza);
        System.out.println("Adding Mozarella");
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.34;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ " Mozarella";
    }

}

class TomatoSauce extends Topping{
    TomatoSauce(Pizza newpizza){
        super(newpizza);
        System.out.println("Adding tomato sauce");
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ " Tomato Sauce";
    }

}