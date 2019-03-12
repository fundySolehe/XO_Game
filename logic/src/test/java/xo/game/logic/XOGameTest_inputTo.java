package xo.game.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class XOGameTest_inputTo implements XOGameConstant {
	XOGame game;
	
	@Before
	public void begin() {
		game = new XOGame();
	}

	@Test
	public void inputTo_success() {
		// Prepare
		
		// Execute
		String retMsg = game.inputTo("X", 1, 2);
		
		// Expect
		XOBoard xoBoard = game.getXoBoard();
		String[][] board = xoBoard.getBoard();
		String lastOnBoard = xoBoard.getLastOnBoard();
		
		assertEquals(SUCCESS, retMsg);
		assertEquals("X", board[1][2]);
		assertEquals("X", lastOnBoard);
	}
}
