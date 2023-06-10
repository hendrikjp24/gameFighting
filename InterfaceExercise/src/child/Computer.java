package child;
import interfaces.RulesComputer;

public class Computer implements RulesComputer{
	private int hpComputer;
	private int defendPoint;
	
	public Computer() {
		this.hpComputer = MAX_HP_COMPUTER;
		this.defendPoint = DEFEND_COMPUTER;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Computer attacking player with " + ATTACK_COMPUTER + " attack point.\n");
		
	}

	@Override
	public void takenDamage(int damage) {
		if(this.hpComputer > MIN_HP_COMPUTER) {
			if(damage > this.defendPoint) {
				this.hpComputer= this.hpComputer - (damage - this.defendPoint);
				System.out.println("Computer taken damage " + damage + " point.\n");
				this.defendPoint = 0;
			}else {
				this.defendPoint -= damage;
				System.out.println("The damage has been blocked by the armor.");
				System.out.println("Defend point armor reduced to " + this.defendPoint + " point.");
			}
		}else {
			System.out.println("Player Win the game!!");
		}
		
	}

	@Override
	public int getAttackPoint() {
		// TODO Auto-generated method stub
		return ATTACK_COMPUTER;
	}

	@Override
	public int getDefendPoint() {
		// TODO Auto-generated method stub
		return this.defendPoint;
	}

	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return this.hpComputer;
	}
	
	
	
	
}
