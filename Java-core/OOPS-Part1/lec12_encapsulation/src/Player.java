public class Player {

    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health = this.health-damage;

        if(this.health<=0){
            System.out.println("Player knocked out of the game !!");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extrahealth){
        health = health+extrahealth;

        if(health>=100){
            System.out.println("Full health !");
            health = 100;
        }
    }

}
