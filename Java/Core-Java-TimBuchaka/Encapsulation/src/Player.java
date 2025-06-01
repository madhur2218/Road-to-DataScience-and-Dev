public class Player {

    public String name_full;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        health = health-damage;
        if(health<=0){
            System.out.println("Player knocked out of the game !");
        }

    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extrHealth){
        health = health+ extrHealth;

        if(health > 100){
            System.out.println("Restored to full health");
            health = 100;
        }
    }
}
