public class Character {
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    public Character(int maxHealth, int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        // Initialize current stats to maximums
        this.health = maxHealth;
        this.stamina = maxStamina;

        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    // แสดงเลือด
    public int getHealth() {
        return health;
    }

    // แสดงสเตมิน่า
    public int getStamina() {
        return stamina;
    }

    //Actions ฟัน
    public void swingSword() {
        int staminaCost = 10;

        //แรงหมด
        if (stamina <= 0) {
            System.out.println("Your character needs to cool down.");
            return;
        }

        stamina -= staminaCost;

        //paramitor กันน้อยกว่า 0
        if (stamina < 0) {
            stamina = 0;
        }

        System.out.println("Character swings the sword. Stamina is now " + stamina + ".");

        //Trigger
        if (stamina == 0) {
            System.out.println("Your character needs to cool down.");
        }
    }

    //Actions เสียดเลือด
    public void takeDamage(int damageAmount) {
        if (health <= 0) {
            System.out.println("Character is already dead.");
            return;
        }

        health -= damageAmount;

        //paramitor กันน้อยกว่า 0
        if (health < 0) {
            health = 0;
        }

        System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");

        //Trigger
        if (health == 0) {
            System.out.println("Character is dead.");
        }
    }
    //Actions นอน
    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
