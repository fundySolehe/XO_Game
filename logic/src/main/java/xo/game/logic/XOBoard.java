package xo.game.logic;

public class XOBoard {
	private String lastOnBoard;
	private String [][] board;
	
	public XOBoard() {
		this.board = new String[3][3];
	}

	public String getLastOnBoard() {
		return lastOnBoard;
	}
	
	public void setLastOnBoard(String lastOnBoard) {
		this.lastOnBoard = lastOnBoard;
	}

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}
	
	public void inputTo(String str, int row, int col) {
		board[row][col] = str;
	}
}
