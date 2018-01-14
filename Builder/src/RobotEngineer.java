public class RobotEngineer {
    private RobotBuilder robotbuilder;

    public RobotEngineer(RobotBuilder robotbuilder){
        this.robotbuilder = robotbuilder;
    }

    public Robot getRobot(){
       return robotbuilder.getRobot();
    }

    public void makeRobot(){
        robotbuilder.buildhead();
        robotbuilder.buildarms();
        robotbuilder.buildlegs();
        robotbuilder.buildtorso();
    }

}
