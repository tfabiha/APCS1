//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game
//2017-11-08   
public class Protagonist{
	//Attributes
	private String name;
	private int HP;
	private int strength;
	private int defense;
	private int defenseStor;
	private double attackRate;
	private double attackStor;
	
	//Constructors
	public Protagonist(){
		HP = 100;
		strength = 50;
		defense = 50;
		attackRate = 0.5;
		defenseStor = defense;
		attackStor = attackRate;
	}
	public Protagonist (String newName){
		this();
		name = newName; 
	}
	
	//Methods
	public boolean isAlive(){
		return HP > 0;
	}
	public int getDefense(){
		return defense;
	}
	public String getName(){
		return name;
	}
	public void lowerHP(int lostHP){
		if (HP < lostHP){
			HP = 0;
		}
		else{
			HP -= lostHP;
		}	
	} 
	public int attack(Monster monster){
		int damage = (int)(strength * attackRate) - monster.getDefense();
		monster.lowerHP(damage);
		return damage;
	}
	public void specialize(){
		defense = (int)(defense / 2);
		attackRate *= 2;
	}
	public void normalize(){
		defense = defenseStor;
		attackRate = attackStor;
	}
	//start of main method
	public static void main(String [] args){
		System.out.println(" This works");
	}//end of the main method
}