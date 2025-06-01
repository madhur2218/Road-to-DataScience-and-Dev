//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        p.name = "Madhur";
        p.health=90;
        p.weapon="sword";

        int damage = 30;
        p.looseHealth(damage);

        p.health =200; //this code takes control away from player class to manage players health
        // we cannot have control since these variables are declated as public and are controlled by anyone
        //Also if in player class i change name to full_name, suddenly we will get error in main class since we were trying to access name and not fullName.
        //In this case changing name can be a small issue which can be resolved quickly but in bigger application this change cannot be found easily.
        System.out.println("Remaining health is "+ p.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("tIM");
        System.out.println("Initial health is : " + tim.healthRemaining());
    }
}