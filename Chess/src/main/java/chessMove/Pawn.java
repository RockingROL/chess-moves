package main.java.chessMove;

public class Pawn implements Piece {
	
	@Override
	public String possibleMoves(char xCord, int yCord) {
		
		if (yCord <= 7)
			return (char)xCord + "" + (yCord+1);
		
		return "";
		
	}
	
}