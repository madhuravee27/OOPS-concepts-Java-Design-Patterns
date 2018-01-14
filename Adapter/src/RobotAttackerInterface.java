public interface RobotAttackerInterface {
    public void weaponDamage();
    public void movement();
    public void assignDriver(String driver);
}

class RobotAttacker implements RobotAttackerInterface{
    @Override
    public void weaponDamage() {
        System.out.println("The weapon damage is 17 points");
    }

    @Override
    public void movement() {
        System.out.println("The movement is 61 steps");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println("The driver is "+driver);
    }
}

class RobotEnemy{

    public void smashHands() {
        System.out.println("The smash hands damage is 7 points");
    }

    public void roller() {
        System.out.println("The roller movement is 6 steps");
    }

    public void reactHuman(String driver) {
        System.out.println("The human is "+driver);
    }
}


class RobotAdapter implements RobotAttackerInterface{
    RobotEnemy robotEnemy;
    RobotAdapter(RobotEnemy newRobotEnemy){
        robotEnemy = newRobotEnemy;
    }

    @Override
    public void weaponDamage() {
        robotEnemy.smashHands();
    }

    @Override
    public void movement() {
        robotEnemy.roller();
    }

    @Override
    public void assignDriver(String driver) {
        robotEnemy.reactHuman(driver);
    }
}
