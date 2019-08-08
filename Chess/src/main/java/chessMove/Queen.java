package main.java.chessMove;

public class Queen implements Piece {
	
	private Rook rook;
	private Bishop bishop;
	
	@Override
	public String possibleMoves(char xCord, int yCord) {
		
		rook = new Rook();
		bishop = new Bishop();
		return rook.possibleMoves(xCord, yCord) + " " + bishop.possibleMoves(xCord, yCord);
		
	}
	
}