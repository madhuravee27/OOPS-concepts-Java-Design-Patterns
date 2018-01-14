public abstract class Wrap {
    String[] meatUsed = {"Salami", "Chicken", "Beef"};
    String[] veggieUsed = {"Tomato", "Olives", "Onion", "Lettuce"};
    String[] cheeseUsed = {"Provolone"};
    String[] condimentUsed = {"Oil", "Vinegar"};

    boolean customerWantsMeat(){return true;}
    boolean customerWantsVeggie(){return true;}
    boolean customerWantsCheese(){return true;}
    boolean customerWantsCondiments(){return true;}

    public void addingMeat(){
        System.out.println("Adding meat");
        for(String meat : meatUsed)
            System.out.println(meat+"\n");
    }

    public void addingVeggie(){
        System.out.println("Adding veggie");
        for(String veggie : veggieUsed)
            System.out.println(veggie+"\n");
    }

    public void addingCheese(){
        System.out.println("Adding cheese");
        for(String cheese : cheeseUsed)
            System.out.println(cheese+"\n");
    }

    public void addingCondiment(){
        System.out.println("Adding condiments");
        for(String condiment : condimentUsed)
            System.out.println(condiment+"\n");
    }

    public void cutBun(){
        System.out.println("Bun has been cut");
    }

    public void wrapped(){
        System.out.println("It is wrapped!");
    }

    public void makeSandwich(){
        cutBun();

        if (customerWantsMeat()){
            addingMeat();
        }

        if (customerWantsVeggie()){
            addingVeggie();
        }

        if (customerWantsCheese()){
            addingCheese();
        }

        if (customerWantsCondiments()){
            addingCondiment();
        }

        wrapped();
    }
}

class VeggieWrap extends Wrap{
    String[] veggieUsed = {"Tomato", "Olives", "Onion", "Lettuce"};
    String[] cheeseUsed = {"Provolone"};
    String[] condimentUsed = {"Oil", "Vinegar"};

    public void addingVeggie(){
        System.out.println("Adding veggie");
        for(String veggie : veggieUsed)
            System.out.println(veggie+"\n");
    }

    public void addingCheese(){
        System.out.println("Adding cheese");
        for(String cheese : cheeseUsed)
            System.out.println(cheese+"\n");
    }

    public void addingCondiment(){
        System.out.println("Adding condiments");
        for(String condiment : condimentUsed)
            System.out.println(condiment+"\n");
    }

    boolean customerWantsMeat(){return false;}

    @Override
    public void addingMeat() {

    }
}

class ItalianWrap extends Wrap{
    String[] meatUsed = {"Salami", "Chicken", "Beef"};
    String[] cheeseUsed = {"Provolone"};
    String[] condimentUsed = {"Oil", "Vinegar"};

    public void addingMeat(){
        System.out.println("Adding meat: ");
        for(String meat : meatUsed)
            System.out.println(meat+"\n");
    }

    public void addingCheese(){
        System.out.println("Adding cheese: ");
        for(String cheese : cheeseUsed)
            System.out.println(cheese+"\n");
    }

    public void addingCondiment(){
        System.out.println("Adding condiments: ");
        for(String condiment : condimentUsed)
            System.out.println(condiment+"\n");
    }

    boolean customerWantsVeggie(){return false;}

    @Override
    public void addingVeggie() {

    }
}


