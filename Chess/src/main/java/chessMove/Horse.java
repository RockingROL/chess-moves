package main.java.chessMove;

public class Horse implements Piece {
	
	private KingAndHorseCommon khC;
	private int[][] pos = {{1, 2},{2, 1},{2, -1},{1, -2},{-1, -2},{-2, -1},{-2, 1},{-1, 2}};
	
	@Override
	public String possibleMoves(char xCord, int yCord) {
		
		khC = new KingAndHorseCommon();
		khC.setPosition(pos);
		return khC.possibleMoves(xCord, yCord);
		
	}
	
}