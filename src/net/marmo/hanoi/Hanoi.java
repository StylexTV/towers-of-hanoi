package net.marmo.hanoi;

import net.marmo.hanoi.game.Game;

public class Hanoi {
	
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("n = " + n);
		
		Game game = new Game(n);
		
		game.solve();
		
		System.out.println("solved = " + game.isSolved());
	}
	
}
