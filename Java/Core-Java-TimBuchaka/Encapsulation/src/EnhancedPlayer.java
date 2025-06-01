public class EnhancedPlayer {

    public String name;
    public int health;
    public String weapon;

    public EnhancedPlayer(String name_full) {
        this(100,name_full,"Sword");
    }

    public EnhancedPlayer(int health, String name_full, String weapon) {
        if(health <=0){
            this.health=1;
        } else if (health>100) {
            this.health =100;
        }
        else{
            this.health = health;
        }

        this.name = name_full;
        this.weapon = weapon;
    }

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
