package xo.game.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class XOGameTest_isWinner implements XOGameConstant {
	XOGame game;
	
	@Before
	public void begin() {
		game = new XOGame();
	}
	
	@Test
	public void isWinner_winCase1() {
		// Prepare
		game.inputTo("X", 0, 0);
		game.inputTo("X", 0, 1);
		game.inputTo("X", 0, 2);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}
	
	@Test
	public void isWinner_winCase2() {
		// Prepare
		game.inputTo("X", 1, 0);
		game.inputTo("X", 1, 1);
		game.inputTo("X", 1, 2);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}
	
	@Test
	public void isWinner_winCase3() {
		// Prepare
		game.inputTo("X", 2, 0);
		game.inputTo("X", 2, 1);
		game.inputTo("X", 2, 2);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}
	
	@Test
	public void isWinner_winCase4() {
		// Prepare
		game.inputTo("X", 0, 0);
		game.inputTo("X", 1, 0);
		game.inputTo("X", 2, 0);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}
	
	@Test
	public void isWinner_winCase5() {
		// Prepare
		game.inputTo("X", 0, 1);
		game.inputTo("X", 1, 1);
		game.inputTo("X", 2, 1);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}
	
	@Test
	public void isWinner_winCase6() {
		// Prepare
		game.inputTo("X", 0, 2);
		game.inputTo("X", 1, 2);
		game.inputTo("X", 2, 2);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}
	
	@Test
	public void isWinner_winCase7() {
		// Prepare
		game.inputTo("X", 0, 0);
		game.inputTo("X", 1, 1);
		game.inputTo("X", 2, 2);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}
	
	@Test
	public void isWinner_winCase8() {
		// Prepare
		game.inputTo("X", 0, 2);
		game.inputTo("X", 1, 1);
		game.inputTo("X", 2, 0);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(true,isWin);
	}

	@Test
	public void isWinner_notWinCase1() {
		// Prepare
		game.inputTo("X", 0, 0);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(false, isWin);
	}

	@Test
	public void isWinner_notWinCase2() {
		// Prepare
		game.inputTo("X", 0, 0);
		game.inputTo("X", 1, 1);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(false, isWin);
	}

	@Test
	public void isWinner_notWinCase3() {
		// Prepare
		game.inputTo("X", 0, 0);
		game.inputTo("X", 1, 1);
		game.inputTo("X", 2, 1);
		
		// Execute
		boolean isWin = game.isWinner();
		
		// Expect
		assertEquals(false, isWin);
	}
}
