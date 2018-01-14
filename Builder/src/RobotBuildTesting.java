public class RobotBuildTesting {
    public static void main(String[] args) {
        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

        robotEngineer.makeRobot();

        System.out.println(robotEngineer.getRobot().getHead());
        System.out.println(robotEngineer.getRobot().getArms());
        System.out.println(robotEngineer.getRobot().getTorso());
        System.out.println(robotEngineer.getRobot().getLegs());
    }
}
