import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class EnemyShipSelection{
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        EnemyShip enemy = null;
        System.out.println("Choose an alphabet U/R/B!");
        String choice = br.readLine();
        if ((choice.equals("U")) || (choice.equals("R")) || (choice.equals("B"))){
            EnemyShipChoice enemyShipChoice = new EnemyShipChoice(enemy, choice);
            EnemyShip enemyFinal = enemyShipChoice.choosenEnemy();
            enemyFinal.displayEnemy();
            enemyFinal.displayDamage();

        }
        else System.out.println("Enter a valid alphabet!");
    }
}
