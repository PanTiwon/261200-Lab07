public class Main {
    public static void main(String[] args) {
        Character myHero = new Character(100, 50);

        System.out.println("||--- Testing Stamina ---||");
        for (int i = 0; i < 5; i++) {
            myHero.swingSword();
        }

        System.out.println("\n||--- Testing Health ---||");

        myHero.takeDamage(30);
        myHero.takeDamage(50);
        myHero.takeDamage(20);

        System.out.println("\n||--- Testing Rest ---||");

        myHero.rest();

        System.out.println("Character's health: " + myHero.getHealth() + ", stamina: " + myHero.getStamina());
    }
}