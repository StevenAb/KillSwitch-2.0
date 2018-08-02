
public abstract class Character {
	//private integer agi, str, int
	private int agi;
	private int str;
	private int intl;

	//private integer hp, mana
	private int hp;
	private int mana;
	//private type skills
	private Skill[] skills;
	
	public int getAgi() {
		return this.agi;
	}
	
	public int getStr() {
		return this.str;
	}
	
	public int getIntl() {
		return this.intl;
	}
	
	public Skill[] getSkills() {
		return this.skills;
	} 
	
	public int getHP() {
		return this.hp;
	}
	
	public int getMana() {
		return this.mana;
	}
}
