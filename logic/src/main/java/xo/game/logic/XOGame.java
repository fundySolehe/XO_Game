package xo.game.logic;

public class XOGame implements XOGameConstant {
	private String [][] board;
	
	public XOGame() {
		this.board = new String[3][3];
	}
	
	// Clearing the board
	public int clearBoard() {
		this.board = new String[3][3];
		return SUCCESS;
	}
	
	// Input by position
	
	
	// Check winner
	
}
