public class RobotTest {
    public static void main(String[] args) {
        RobotEnemy marc = new RobotEnemy();
        RobotAttackerInterface paul = new RobotAdapter(marc);
        RobotAttacker tank = new RobotAttacker();

        tank.assignDriver("tank");
        tank.movement();
        tank.weaponDamage();

        marc.reactHuman("Marc");
        marc.roller();
        marc.smashHands();

        paul.assignDriver("Marc Adapter");
        paul.movement();
        paul.weaponDamage();

    }
}
