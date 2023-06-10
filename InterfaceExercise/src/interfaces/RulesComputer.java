package interfaces;

public interface RulesComputer {
//	computer
	int MAX_HP_COMPUTER = 5000;
	int MIN_HP_COMPUTER = 0;
	int DEFEND_COMPUTER = 300;
	int ATTACK_COMPUTER = 300;
	
	void attack();
	void takenDamage(int damage);
	int getAttackPoint();
	int getDefendPoint();
	int getHp();

}
