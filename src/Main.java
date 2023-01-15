public class Main {
    public static void main(String[] args) {
        Boss angryBoss = new Boss(1000, 50, "Kinetik");
        System.out.println("Boss health: " + angryBoss.getHealth() + " Boss damage: " + angryBoss.getDamage() + " Boss defends: " + angryBoss.getDefends());
        
    }
}