package xo.game.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class XOGameTest_clearBoard implements XOGameConstant {
	XOGame game;
	
	@Before
	public void begin() {
		game = new XOGame();
	}

	@Test
	public void clearBoard_returnSuccess() {
		assertEquals(SUCCESS, game.clearBoard());
	}
}
