package net.marmo.hanoi.game;

public class Disk {
	
	private int size;
	
	public Disk(int size) {
		this.size = size;
	}
	
	public boolean isLargerThan(Disk disk) {
		return size > disk.getSize();
	}
	
	public boolean isSmallerThan(Disk disk) {
		return size < disk.getSize();
	}
	
	public boolean equals(Disk disk) {
		return size == disk.getSize();
	}
	
	public int getSize() {
		return size;
	}
	
}
