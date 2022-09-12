package net.marmo.hanoi.game;

public class Game {
	
	private static final int POLE_AMOUNT = 3;
	
	private static final int FIRST_POLE_INDEX = 0;
	private static final int SECOND_POLE_INDEX = 1;
	private static final int THRID_POLE_INDEX = 2;
	
	private Pole[] poles = new Pole[POLE_AMOUNT];
	
	private int diskAmount;
	
	public Game(int diskAmount) {
		this.diskAmount = diskAmount;
		
		for(int i = 0; i < poles.length; i++) {
			
			poles[i] = new Pole();
		}
		
		addDisks(diskAmount);
	}
	
	private void addDisks(int amount) {
		Pole pole = getFirstPole();
		
		for(int size = diskAmount; size > 0; size--) {
			
			pole.addDisk(size);
		}
	}
	
	public void solve() {
		moveDisks(diskAmount, FIRST_POLE_INDEX, THRID_POLE_INDEX);
	}
	
	public boolean isSolved() {
		Pole pole = getThirdPole();
		
		return pole.height() == diskAmount;
	}
	
	public void moveDisks(int amount, int from, int to) {
		if(amount == 1) {
			
			moveDisk(from, to);
			
			return;
		}
		
		int index = FIRST_POLE_INDEX + SECOND_POLE_INDEX + THRID_POLE_INDEX - from - to;
		
		moveDisks(amount - 1, from, index);
		moveDisk(from, to);
		moveDisks(amount - 1, index, to);
	}
	
	public void moveDisk(int from, int to) {
		System.out.println(from + " -> " + to);
		
		Pole pole1 = getPole(from);
		Pole pole2 = getPole(to);
		
		Disk disk = pole1.removeDisk();
		
		pole2.addDisk(disk);
	}
	
	public Pole getFirstPole() {
		return getPole(FIRST_POLE_INDEX);
	}
	
	public Pole getSecondPole() {
		return getPole(SECOND_POLE_INDEX);
	}
	
	public Pole getThirdPole() {
		return getPole(THRID_POLE_INDEX);
	}
	
	public Pole getPole(int index) {
		return poles[index];
	}
	
	public int getDiskAmount() {
		return diskAmount;
	}
	
}
