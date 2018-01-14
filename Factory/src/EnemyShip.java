public abstract class EnemyShip {
    private String name;
    private int damage;

    public void setName(String newname) {
        name = newname;
    }

    public String getName() {
        return name;
    }

    public void setDamage(int newdamage) {
        damage = newdamage;
    }

    public int getDamage() {
        return damage;
    }

    public void displayEnemy(){
        System.out.println("The enemy ship is: "+getName());
    }

    public void displayDamage(){
        System.out.println("The enemy ship can cause damage of: "+getDamage());
    }
}

class UFOship extends EnemyShip{
    public UFOship(){
        setName("UFOship");
        setDamage(21);
    }
}

class Rocketship extends EnemyShip {
    public Rocketship() {
        setName("Rocketship");
        setDamage(45);
    }
}

class BigUFOship extends EnemyShip {
    public BigUFOship() {
        setName("BigUFOship");
        setDamage(95);
    }
}