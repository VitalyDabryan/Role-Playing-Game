public abstract class Person {
    String name;
    int health, dexterity, experience, gold, power;
    public Person(String name, int health, int dexterity, int experience, int gold, int power) {
        this.name = name;
        this.health = health;
        this.dexterity = dexterity;
        this.experience = experience;
        this.gold = gold;
        this.power = power;
    }

    public Person() {

    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", dexterity=" + dexterity +
                ", experience=" + experience +
                ", gold=" + gold +
                ", power=" + power +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
