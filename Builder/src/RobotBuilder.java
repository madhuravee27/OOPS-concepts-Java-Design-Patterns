public interface RobotBuilder {
    public void buildhead();
    public void buildarms();
    public void buildlegs();
    public void buildtorso();
    public Robot getRobot();
}

class OldRobotBuilder implements RobotBuilder{
    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }
    @Override
    public void buildarms() {
        this.robot.setArms("Torch arms");
    }

    @Override
    public void buildhead() {
        this.robot.setHead("Tin head");
    }

    @Override
    public void buildlegs() {
        this.robot.setLegs("Roller legs");
    }

    @Override
    public void buildtorso() {
        this.robot.setTorso("Metal Torso");
    }

    public Robot getRobot(){
        return robot;
    }
}