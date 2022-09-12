package net.marmo.hanoi;

import net.marmo.hanoi.game.Game;

public class Hanoi {
	
	public static void main(String[] args) {
		Game game = new Game(5);
		
		game.solve();
		
		System.out.println("solved = " + game.isSolved());
	}
	
}
