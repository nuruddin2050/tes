public class Character {
    private String name;
    private int health;
    private int XP;
    private String item;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.XP = 0;
        this.item = "Tidak ada";
    }

    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getXP() { return XP; }
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public void displayInfo() {
        System.out.println("\n=== INFO KARAKTER ===");
        System.out.println("Nama: " + name);
        System.out.println("Health: " + health);
        System.out.println("XP: " + XP);
        System.out.println("Item: " + item);
        System.out.println("====================");
    }
}