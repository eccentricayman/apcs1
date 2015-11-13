//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-Me
//APCS1 pd5
//HW29 -- Ye Olde Role Playing Game, Improved
//2015-11-11

public class Character {

    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;
    protected String name;

    public boolean isAlive() {
        return health > 0;
    }

    public int getDefense() {
	return defense;
    }

    public String getName() {
	return name;
    }

    public void lowerHP(int damage) {
	health -= damage;
    }

    public int attack(Character character) {
	int damage = (int) ((strength * attack) - character.getDefense());
	if (damage < 0) {
	    damage = 0;
	}
	character.lowerHP(damage);
	return damage;
    }

    public void normalize() {
	defense = 50;
	attack = 0.5;
    }

    public void specialize() {
	defense /= 4;
	attack *= 2;
    }

}