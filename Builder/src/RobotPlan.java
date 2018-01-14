public interface RobotPlan {
    public void setHead(String head);
    public void setArms(String arms);
    public void setTorso(String torso);
    public void setLegs(String legs);

}

class Robot implements RobotPlan{
    private String head;
    private String arms;
    private String torso;
    private String legs;

    @Override
    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getArms() {
        return arms;
    }

    @Override
    public void setHead(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    @Override
    public void setTorso(String torso) {
        this.torso = torso;
    }

    public String getTorso() {
        return torso;
    }

    @Override
    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getLegs() {
        return legs;
    }
}