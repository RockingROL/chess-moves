package test.java;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;

import main.java.chessMove.Board;

public class BoardTest {

	@Test()
	public void getPieceAndMoveNullTest() {
		Board bd = new Board();
		Assert.assertArrayEquals(null,bd.getPieceAndMove(null));
	}
	
	@Test()
	public void getPieceAndMoveEmptyTest() {
		Board bd = new Board();
		Assert.assertArrayEquals(null,bd.getPieceAndMove(""));
	}
	
	@Test()
	public void getPieceAndMovePositiveTest() {
		Board bd = new Board();
		String[] pam = {"King","D5"};
		Assert.assertArrayEquals(pam,bd.getPieceAndMove("King D5"));
	}
	
	@Test()
	public void getPieceAndMoveNegativeTest() {
		Board bd = new Board();
		String[] pam = {"Ki","ngD5"};
		Assert.assertThat(pam,IsNot.not(IsEqual.equalTo(bd.getPieceAndMove("King D5"))));
	}
	
	@Test()
	public void checkPieceNullTest() {
		Board bd = new Board();
		Assert.assertEquals(false,bd.checkPiece(null));
	}
	
	@Test()
	public void checkPieceEmptyTest() {
		Board bd = new Board();
		Assert.assertEquals(false,bd.checkPiece(""));
	}
	
	@Test()
	public void checkPiecePositiveTest() {
		Board bd = new Board();
		Assert.assertEquals(true,bd.checkPiece("Rook"));
	}
	
	@Test()
	public void checkPieceNegativeTest() {
		Board bd = new Board();
		Assert.assertNotEquals(true,bd.checkPiece("roOk"));
	}
	
	@Test()
	public void getRowAndColNullTest() {
		Board bd = new Board();
		Assert.assertEquals(null,bd.getRowAndCol(null));
	}
	
	@Test()
	public void getRowAndColEmptyTest() {
		Board bd = new Board();
		Assert.assertEquals(null,bd.getRowAndCol(""));
	}
	
	@Test()
	public void findAllPossibleMovesNullTest() {
		Board bd = new Board();
		Assert.assertEquals(null,bd.findAllPossibleMoves(null,null));
	}
	
	@Test()
	public void findAllPossibleMovesEmptyTest() {
		Board bd = new Board();
		Assert.assertEquals(null,bd.findAllPossibleMoves("",null));
	}
	
}
