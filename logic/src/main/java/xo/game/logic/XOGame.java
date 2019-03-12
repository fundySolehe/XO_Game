package xo.game.logic;

import java.util.ArrayList;
import java.util.List;

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
	public String inputTo(String str, int col, int row) {
		// Input
		this.xoBoard.inputTo(str, col, row);
		this.xoBoard.setLastOnBoard(str);
			
		return SUCCESS;
	}
	
	// Check position not allowed
	public String checkPostionNotEmpty(int col, int row) {
		// Query board
		String[][] board = this.xoBoard.getBoard();
		
		if(board[col][row] != null) {
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
	public boolean isWinner() {
		// Query board
		String[][] board = this.xoBoard.getBoard();
		
		// Check
		List<String> temp = new ArrayList<String>();
		
		temp.add(board[0][0] + board[0][1] + board[0][2]);
		temp.add(board[1][0] + board[1][1] + board[1][2]);
		temp.add(board[2][0] + board[2][1] + board[2][2]);
		
		temp.add(board[0][0] + board[1][0] + board[2][0]);
		temp.add(board[0][1] + board[1][1] + board[2][1]);
		temp.add(board[0][2] + board[1][2] + board[2][2]);

		temp.add(board[0][0] + board[1][1] + board[2][2]);
		temp.add(board[0][2] + board[1][1] + board[2][0]);
		
		for (String winCase : temp) {
			if("XXX".equals(winCase) || "OOO".equals(winCase)) {
				return true;
			}
		}
		return false;
	}
	
}
