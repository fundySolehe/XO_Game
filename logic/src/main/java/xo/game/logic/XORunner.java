package xo.game.logic;

import java.util.Scanner;

public class XORunner {

	static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String input = null;
		int col = 0, row = 0;
		
		XOGame game = new XOGame();
		do {
			do {
				System.out.print("TICK : ");
				input = in.nextLine();
				if(!"X".equals(input) && !"O".equals(input)) {
					System.out.println("PLZ input \"X\" or \"O\"");
					continue;
				}
				if(!"SUCCESS".equals(game.checkWrongTurn(input))) {
					System.out.println("Not your turn");
					continue;
				}
				break;
			} while(true);
			
			
			do {
				try {
					System.out.print("COL : ");
					col = Integer.parseInt(in.nextLine());
					System.out.print("ROW : ");
					row = Integer.parseInt(in.nextLine());
				} catch(Exception e) {
					System.out.println("PLZ input 0 1 2");
					continue;
				}
				if(!"SUCCESS".equals(game.checkPostionNotEmpty(col, row))) {
					System.out.println("Cannot tick in this position");
					continue;
				}
				break;
			} while(true);
			
			game.inputTo(input, col, row);
			game.displayGame();
		} while(!game.isWinner());
		
	}

}
