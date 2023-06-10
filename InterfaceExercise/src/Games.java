import interfaces.*;

public class Games {
	private RulesComputer computer;
	private RulesPlayer player;
	
	public Games(RulesComputer computer, RulesPlayer player) {
		this.computer = computer;
		this.player = player;
	}
	
	public void startGame() {
		this.player.startGame();
	}
	
	public int getHpPlayer() {
		return this.player.getHp();
	}
	
	public int getHpComputer() {
		return this.computer.getHp();
	}
	
	public int getAttackComputer() {
		return this.computer.getAttackPoint();
	}
	
	public int getAttackPlayer() {
		return this.player.getAttackPoint();
	}
	
	public int getDefendPlayer() {
		return this.player.getDefendPoint();
	}
	
	public int getDefendComputer() {
		return this.computer.getDefendPoint();
	}
	
	public void playerAttack() {
		this.player.attack();
		this.computer.takenDamage(this.player.getAttackPoint());
		this.computer.attack();
		this.player.takenDamage(this.computer.getAttackPoint());
	}
	
	public void playerUpgradeArmor() {
		this.player.takeVest();
		this.computer.attack();
		this.player.takenDamage(this.computer.getAttackPoint());
	}
	
	public void playerUpgradeWeapon() {
		this.player.upgradeWeapon();
		this.computer.attack();
		this.player.takenDamage(this.computer.getAttackPoint());
	}
}