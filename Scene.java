public class Scene {
    private String description;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private Scene nextSceneA;
    private Scene nextSceneB;
    private Scene nextSceneC;
    private int damageA;
    private int damageB;
    private int damageC;
    private int XPA;
    private int XPB;
    private int XPC;
    private String itemA;
    private String itemB;
    private String itemC;

    public Scene(String description, 
                String choiceA, Scene nextSceneA, int damageA, int XPA, String itemA,
                String choiceB, Scene nextSceneB, int damageB, int XPB, String itemB,
                String choiceC, Scene nextSceneC, int damageC, int XPC, String itemC) {
        this.description = description;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.nextSceneA = nextSceneA;
        this.nextSceneB = nextSceneB;
        this.nextSceneC = nextSceneC;
        this.damageA = damageA;
        this.damageB = damageB;
        this.damageC = damageC;
        this.XPA = XPA;
        this.XPB = XPB;
        this.XPC = XPC;
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
    }

    public void displayScene() {
        System.out.println("\n====================================");
        System.out.println(description);
        System.out.println("====================================");
        System.out.println("A. " + choiceA);
        System.out.println("B. " + choiceB);
        System.out.println("C. " + choiceC);
        System.out.println("====================================");
        System.out.print("Pilihan Anda (A/B/C) atau ketik 'INFO' untuk melihat status: ");
    }

    public Scene makeChoice(String choice, Character player) {
        switch (choice.toUpperCase()) {
            case "A":
                player.takeDamage(damageA);
                player.addXP(XPA);
                if (itemA != null) player.setItem(itemA);
                return nextSceneA;
            case "B":
                player.takeDamage(damageB);
                player.addXP(XPB);
                if (itemB != null) player.setItem(itemB);
                return nextSceneB;
            case "C":
                player.takeDamage(damageC);
                player.addXP(XPC);
                if (itemC != null) player.setItem(itemC);
                return nextSceneC;
            case "INFO":
                player.displayInfo();
                return this;
            default:
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                return this;
        }
    }
}