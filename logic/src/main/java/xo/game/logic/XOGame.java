package xo.game.logic;

public class XOGame implements XOGameConstant {
	
	XOBoard xoBoard;
	
	public XOGame() {
		this.xoBoard = new XOBoard();
	}

	public XOBoard getXoBoard() {
		return xoBoard;
	}

	public void setXoBoard(XOBoard xoBoard) {
		this.xoBoard = xoBoard;
	}

	// Input by position
	public String inputTo(String str, int row, int col) {
		// Input
		this.xoBoard.inputTo(str, row, col);
		this.xoBoard.setLastOnBoard(str);
			
		return SUCCESS;
	}
	
	// Check position not allowed
	public String checkPostionNotEmpty(int row, int col) {
		// Query board
		String[][] board = this.xoBoard.getBoard();
		
		if(board[row][col] != null) {
			return ERR_POSITION_NOT_EMPTY;
		}
		
		return SUCCESS;
	}
	
	// Check wrong turn
	public String checkWrongTurn(String str) {
		// Query board
		String lastOnBoard = this.xoBoard.getLastOnBoard();
		
		if(str.equals(lastOnBoard)) {
			if(str.equals("X")) {
				return ERR_NOT_X_TURN;
			}
			if(str.equals("O")) {
				return ERR_NOT_O_TURN;
			}
		}
		
		return SUCCESS;
	}
	
	// Check winner
	
}
