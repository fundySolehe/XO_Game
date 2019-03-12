package xo.game.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class XOGameTest_checkWrongTurn implements XOGameConstant {
	XOGame game;
	
	@Before
	public void begin() {
		game = new XOGame();
	}

	@Test
	public void checkWrongTurn_returnSuccess() {
		// Prepare
		game.inputTo("X", 1, 2);
		game.inputTo("O", 2, 2);
		
		// Execute
		String retMsg = game.checkWrongTurn("X");
		
		// Expect
		assertEquals(SUCCESS, retMsg);
	}

	@Test
	public void checkWrongTurn_returnNotXTurn() {
		// Prepare
		game.inputTo("O", 2, 2);
		game.inputTo("X", 1, 2);
		
		// Execute
		String retMsg = game.checkWrongTurn("X");
		
		// Expect
		assertEquals(ERR_NOT_X_TURN, retMsg);
	}

	@Test
	public void checkWrongTurn_returnNotOTurn() {
		// Prepare
		game.inputTo("X", 1, 2);
		game.inputTo("O", 2, 2);
		
		// Execute
		String retMsg = game.checkWrongTurn("O");
		
		// Expect
		assertEquals(ERR_NOT_O_TURN, retMsg);
	}
}
