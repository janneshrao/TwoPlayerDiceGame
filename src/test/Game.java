package test;
public class Game {
    public static void main(String[] args) {
        int turn = 0;
        Dice d = new Dice();
        Player A = new Player(150, 15, 10);
        Player B = new Player(150,15,10);
        System.out.println();
        System.out.println("----------------   Match Started   ----------------");
        System.out.println();
        System.out.println("Players initial status : ");
        System.out.println("Player A : " + status(A));
        System.out.println("Player B : " + status(B));
        System.out.println();
        if(A.getHealth()<B.getHealth()) { //A will start the match
            System.out.println("A will start the match..!!");
            System.out.println();
            while(A.getHealth()>0 && B.getHealth()>0) {
                if(turn%2==0) {
                    System.out.println("Current attacker : A");
                    System.out.println("Current defender : B");
                    System.out.println();
                    int attackerDie = d.throwDice();
                    int defenderDie = d.throwDice();
                    System.out.println("Attacker Die : " + attackerDie);
                    System.out.println("Defender Die : " + defenderDie);
                    System.out.println();
                    int attackingDamage = A.getAttack() * attackerDie;
                    int defendingStrength = B.getStrength() * defenderDie;
                    int netDamage = attackingDamage - defendingStrength;
                    if(netDamage>0) B.setHealth(B.getHealth()-netDamage);
                    System.out.println("Players status : ");
                    System.out.println("A Player : " + status(A));
                    System.out.println("Player B : " + status(B));
                    System.out.println();
                    System.out.println("------------------------------------------------");
                } else {
                    System.out.println("Current attacker : B");
                    System.out.println("Current defender : A");
                    System.out.println();
                    int attackerDie = d.throwDice();
                    int defenderDie = d.throwDice();
                    System.out.println("Attacker Die : " + attackerDie);
                    System.out.println("Defender Die : " + defenderDie);
                    System.out.println();
                    int attackingDamage = B.getAttack() * attackerDie;
                    int defendingStrength = A.getStrength() * defenderDie;
                    int netDamage = attackingDamage - defendingStrength;
                    if(netDamage>0) A.setHealth(A.getHealth()-netDamage);
                    System.out.println("Players status : ");
                    System.out.println("A Player : " + status(A));
                    System.out.println("Player B : " + status(B));
                    System.out.println();
                    System.out.println("------------------------------------------------");
                }
                turn++;
            }
            
        } else { //B will start the match
            System.out.println("B will start the match..!!");
            System.out.println();
            while(A.getHealth()>0 && B.getHealth()>0) {
                if(turn%2==0) {
                    System.out.println("Current attacker : B");
                    System.out.println("Current defender : A");
                    System.out.println();
                    int attackerDie = d.throwDice();
                    int defenderDie = d.throwDice();
                    System.out.println("Attacker Die : " + attackerDie);
                    System.out.println("Defender Die : " + defenderDie);
                    System.out.println();
                    int attackingDamage = B.getAttack() * attackerDie;
                    int defendingStrength = A.getStrength() * defenderDie;
                    int netDamage = attackingDamage - defendingStrength;
                    if(netDamage>0) A.setHealth(A.getHealth()-netDamage);
                    System.out.println("Players status : ");
                    System.out.println("A Player : " + status(A));
                    System.out.println("Player B : " + status(B));
                    System.out.println();
                    System.out.println("------------------------------------------------");
                } else {
                    System.out.println("Current attacker : A");
                    System.out.println("Current defender : B");
                    System.out.println();
                    int attackerDie = d.throwDice();
                    int defenderDie = d.throwDice();
                    System.out.println("Attacker Die : " + attackerDie);
                    System.out.println("Defender Die : " + defenderDie);
                    System.out.println();
                    int attackingDamage = A.getAttack() * attackerDie;
                    int defendingStrength = B.getStrength() * defenderDie;
                    int netDamage = attackingDamage - defendingStrength;
                    if(netDamage>0) B.setHealth(B.getHealth()-netDamage);
                    System.out.println("Players status : ");
                    System.out.println("A Player : " + status(A));
                    System.out.println("Player B : " + status(B));
                    System.out.println();
                    System.out.println("------------------------------------------------");
                }
                turn++;
            }
        }

        if(A.getHealth()<=0) System.out.println("WINNER OF THE MATCH : Player B");
        else System.out.println("Winner of the match : Player A");
        System.out.println("------------------------------------------------");
        /*System.out.println("Players final status : ");
        System.out.println("Player A : " + status(A));
        System.out.println("Player B : " + status(B));*/

    }
    public static String status(Player P) {
        return("Health : " + P.getHealth()+", Strength : " + P.getStrength()+", Attack : " + P.getAttack());
    }
}