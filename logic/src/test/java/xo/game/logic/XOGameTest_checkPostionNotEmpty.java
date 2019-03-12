package xo.game.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class XOGameTest_checkPostionNotEmpty implements XOGameConstant {
	XOGame game;
	
	@Before
	public void begin() {
		game = new XOGame();
	}

	@Test
	public void checkPostionNotEmpty_returnSuccess() {
		// Prepare
		game.inputTo("X", 2, 2);
		
		// Execute
		String retMsg = game.checkPostionNotEmpty(1, 2);
		
		// Expect
		assertEquals(SUCCESS, retMsg);
	}

	@Test
	public void checkPostionNotEmpty_returnError() {
		// Prepare
		game.inputTo("X", 2, 2);
		
		// Execute
		String retMsg = game.checkPostionNotEmpty(2, 2);
		
		// Expect
		assertEquals(ERR_POSITION_NOT_EMPTY, retMsg);
	}
}
