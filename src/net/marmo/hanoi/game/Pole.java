package net.marmo.hanoi.game;

import java.util.ArrayList;
import java.util.List;

public class Pole {
	
	private List<Disk> disks = new ArrayList<>();
	
	public void addDisk(int size) {
		Disk disk = new Disk(size);
		
		addDisk(disk);
	}
	
	public void addDisk(Disk disk) {
		if(!isEmpty()) {
			
			Disk top = getTopDisk();
			
			if(top.isSmallerThan(disk)) throw new RuntimeException("Invalid disk placement");
		}
		
		disks.add(disk);
	}
	
	public Disk removeDisk() {
		Disk disk = getTopDisk();
		
		disks.remove(disk);
		
		return disk;
	}
	
	public Disk getTopDisk() {
		int index = height() - 1;
		
		return getDisk(index);
	}
	
	public Disk getBottomDisk() {
		return getDisk(0);
	}
	
	public Disk getDisk(int index) {
		return disks.get(index);
	}
	
	public boolean isEmpty() {
		return height() == 0;
	}
	
	public int height() {
		return disks.size();
	}
	
}
