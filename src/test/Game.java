package test;
public class Game {
    public static void main(String[] args) {
        int turn = 0; //if turn is even then attacker will throw the die or else defender will throw the die.
        Dice d = new Dice();

        Player A = new Player(150, 15, 10); //object creation of player a.
        Player B = new Player(150,15,10); //object creation of player b

        if(A.getAttack() <= 0 || A.getHealth() <= 0 || A.getStrength() <= 0 || 
            B.getAttack() <= 0 || B.getHealth() <= 0 || B.getStrength() <= 0) {
                System.out.println("Players attributes should be greater than zero");
                return;
        }

        System.out.println(); 
        System.out.println("----------------   Match Started   ----------------");
        System.out.println();
        System.out.println("Players initial status : ");
        status(A, B); //status method will return each player attributes
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
                    status(A, B);
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
                    status(A, B);
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
                    status(A, B);
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
                    status(A, B);
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
    public static void status(Player P1, Player P2) {
        System.out.println("Player A : " + "Health : " + P1.getHealth()+", Strength : " + P1.getStrength()+", Attack : " + P1.getAttack());
        System.out.println("Player B : " + "Health : " + P2.getHealth()+", Strength : " + P2.getStrength()+", Attack : " + P2.getAttack());
    }
}