import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== PETUALANGAN DI GUA TERKUTUK ===");
        System.out.println("Ketik 'INFO' kapan saja untuk melihat status karakter\n");
        play();
    }

    public void play() {
        Scene currentScene = startScene;
        
        while (currentScene != null && player.getHealth() > 0) {
            currentScene.displayScene();
            String choice = scanner.nextLine();
            currentScene = currentScene.makeChoice(choice, player);
            
            if (player.getHealth() <= 0) {
                System.out.println("\n====================================");
                System.out.println("GAME OVER! Karakter Anda telah kehabisan health.");
                System.out.println("Total XP yang didapat: " + player.getXP());
                System.out.println("====================================\n");
                break;
            }
        }
        
        if (player.getHealth() > 0) {
            System.out.println("\n====================================");
            System.out.println("SELAMAT! Anda telah menyelesaikan petualangan ini!");
            System.out.println("Total XP yang didapat: " + player.getXP());
            System.out.println("====================================\n");
        }
        scanner.close();
    }
}