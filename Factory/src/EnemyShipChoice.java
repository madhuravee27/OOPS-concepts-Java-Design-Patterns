public class EnemyShipChoice {
    EnemyShip enemy;
    private String choice;

    public void setEnemy(EnemyShip enemyShip){
        enemy = enemyShip;
    }

    public EnemyShip getEnemy() {
        return enemy;
    }

    public void setChoice(String selectedChoice) {
        this.choice = selectedChoice;
    }

    public String getChoice() {
        return choice;
    }

    public EnemyShipChoice(EnemyShip enemyShip, String selectedChoice){
        setChoice(selectedChoice);
        setEnemy(enemyShip);

        if (getChoice().equals("U")){
            setEnemy(new UFOship());
        } else if (getChoice().equals("R")) {
            setEnemy(new Rocketship());
        }else{
            setEnemy(new BigUFOship());
        }
    }

    public EnemyShip choosenEnemy(){
        return getEnemy();
    }
}
