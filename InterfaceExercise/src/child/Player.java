package child;
import interfaces.RulesPlayer;

public class Player implements RulesPlayer {
	private int hpPlayer;
	private int attackPoint;
	private int defendPoint;
	private boolean isTurn;
	
	public Player() {
		this.hpPlayer = MAX_HP_PLAYER;
		this.attackPoint = 200;
		this.defendPoint = 150;
	}
	
	public int getHp() {
		return hpPlayer;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public int getDefendPoint() {
		return defendPoint;
	}
	
	
	
//	Method untuk mendapatkan point random for defend and attack when player doing upgrade weapon or take a vest
	private int vestPoint() {
		int pointAdd = (int)Math.ceil(Math.random() * 100);
		this.defendPoint += pointAdd;
		
		return pointAdd;
	}
	
	private int weaponPoint() {
		int pointAdd = (int)Math.ceil(Math.random() * 100);
		this.attackPoint += pointAdd;
		
		return pointAdd; 
	}
	
//	method starting the game
	public void startGame() {
		isTurn = true;
		System.out.println("=====Game Starting=====");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		isTurn = false;
		System.out.println("Player attacking computer with " + getAttackPoint() + " attack point.\n");
	}

	@Override
	public void takeVest() {
		// TODO Auto-generated method stub
		isTurn = false;
		System.out.println("Player upgrade armor and get " + vestPoint() + " defend point.");
		System.out.println("Total defend point player is " + this.defendPoint + ".\n");
		
	}

	@Override
	public void upgradeWeapon() {
		// TODO Auto-generated method stub
		isTurn = false;
		System.out.println("Player upgrades his weapon and get " + weaponPoint() + " attack point.");
		System.out.println("Total attack point player is " + this.attackPoint + ".\n");
	}
	
	public void takenDamage(int damage) {
		if(! isTurn) {
			if(this.hpPlayer > MIN_HP_PLAYER) {
				if(damage > this.defendPoint) {
					this.hpPlayer = this.hpPlayer - (damage - this.defendPoint);
					System.out.println("Damage cannot be held by armor. Defend point armor reduce to 0 point");
					System.out.println("Player taken damage " + (damage - this.defendPoint)+ " point.\n");
					this.defendPoint = 0;
				}else {
					this.defendPoint -= damage;
					System.out.println("The damage has been blocked by the armor.");
					System.out.println("Defend point armor reduced to " + this.defendPoint + " point.\n");
				}
				this.isTurn = true;
			}else {
				System.out.println("Computer Win the game!!");
			}
		}
	}

	
}