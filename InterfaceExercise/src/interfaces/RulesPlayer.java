package interfaces;

public interface RulesPlayer {
//	player
	int MAX_HP_PLAYER = 5000;
	int MIN_HP_PLAYER = 0;
	
	void startGame();
	void attack();
	void takeVest();
	void upgradeWeapon();
	void takenDamage(int damage);
	int getAttackPoint();
	int getDefendPoint();
	int getHp();
	
}