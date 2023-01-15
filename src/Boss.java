public class Boss {
    private int health;
    private int damage;
    private String defends;

    public Boss(int health, int damage, String defends) {
        this.health = health;
        this.damage = damage;
        this.defends = defends;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefends() {
        return defends;
    }

    public void setDefends(String defends) {
        this.defends = defends;
    }
}
