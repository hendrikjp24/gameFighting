import java.util.Scanner;
import interfaces.*;
import child.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RulesComputer rulecomp = new Computer();
		RulesPlayer rulePlayer = new Player();
		
		Games player = new Games(rulecomp, rulePlayer);
		
		Scanner input = new Scanner(System.in);
		String inputan;
		int pilihan;
		boolean isLooping = true;
		
		do {
			System.out.println("=====WELCOME IN FIGHTING GAME====");
			System.out.println("Wanna playing games? (Y/N): ");
			inputan = input.nextLine();
			
			if(inputan.equalsIgnoreCase("Y")) {
				player.startGame();
				do {
					System.out.println("Status Player : ");
					System.out.println("Hp Player : " + player.getHpPlayer());
					System.out.println("Attack Point : " + player.getAttackPlayer());
					System.out.println("Defend Point : " + player.getDefendPlayer());
					System.out.println();
					
					System.out.println("Status Computer : ");
					System.out.println("Hp Computer : " + player.getHpComputer());
					System.out.println("Attack Point : " + player.getAttackComputer());
					System.out.println("Defend Point : " + player.getDefendComputer());
					
					
					System.out.println("====PILIH AKSI ANDA=====");
					System.out.println("[1] Attack");
					System.out.println("[2] Upgrade Weapon");
					System.out.println("[3] Upgrade Armor");
					System.out.println("[4] Quit");
					
					System.out.println("Masukkan Pilihan Anda : ");
					pilihan = input.nextInt();
					input.nextLine();
					
					if(pilihan == 1) {
						player.playerAttack();
						
					}else if(pilihan  == 2) {
						player.playerUpgradeWeapon();
						
					}else if(pilihan == 3) {
						player.playerUpgradeArmor();
						
					}else if(pilihan == 4) {
						isLooping = false;
						
					}else {
						System.out.println("MASUKKAN PILIHAN YANG TERSEDIA!");
						System.out.println("Masukkan Pilihan Anda : ");
						pilihan = input.nextInt();
						input.nextLine();
					}
					
					if(player.getHpPlayer() <= 0 || player.getHpComputer() <= 0) {
						if(player.getHpPlayer() <= 0) {
							System.out.println("COMPUTER WINS!!");
						}else {
							System.out.println("PLAYER WINS!!");
						}
						isLooping = false;
					}
				}while(isLooping);
				
			}else if(inputan.equalsIgnoreCase("N")) {
				
			}else {
				System.out.println("Just answer between Y/N!!!");
			}
			
		}while(! inputan.equalsIgnoreCase("Y") && ! inputan.equalsIgnoreCase("N"));
		
		input.close();
	}
}
