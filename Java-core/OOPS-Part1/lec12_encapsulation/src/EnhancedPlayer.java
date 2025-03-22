public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(100,name,"sword");
    }

    public EnhancedPlayer(int health, String name, String weapon) {
        if(health <0){
            this.healthPercentage =1;
        } else if (health>100) {
            this.healthPercentage =100;
        } else {
            this.healthPercentage =health;
        }
        this.fullName = name;
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        this.healthPercentage = this.healthPercentage -damage;

        if(this.healthPercentage <=0){
            System.out.println("Player knocked out of the game !!");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extrahealth){
        healthPercentage = healthPercentage +extrahealth;

        if(healthPercentage >=100){
            System.out.println("Full health !");
            healthPercentage = 100;
        }
    }
}
