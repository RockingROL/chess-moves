package main.java.chessMove;

public class King implements Piece {
	
	private KingAndHorseCommon khC;
	private int[][] pos = {{0, 1},{1, 1},{1, 0},{1, -1},{0, -1},{-1, -1},{-1, 0},{-1, 1}};
	
	@Override
	public String possibleMoves(char xCord, int yCord) {
		
		khC = new KingAndHorseCommon();
		khC.setPosition(pos);
		return khC.possibleMoves(xCord, yCord);
		
	}
	
}