package main.java.chessMove;

public class Bishop implements Piece {
	
	@Override
	public String possibleMoves(char xCord, int yCord) {
		
		String output = "";
		char i;
		int j;
		
		for (i = (char) (xCord+1), j = yCord+1; i <= 'H' && j <= 8; i++,j++) { 
			output += i + "" + j + " ";
	    }
		
		for (i = (char) (xCord+1), j = yCord-1; i <= 'H' && j >= 1; i++,j--) { 
			output += i + "" + j + " ";
	    }
		
		for (i = (char) (xCord-1), j = yCord-1; i >= 'A' && j >= 1; i--,j--) { 
			output += i + "" + j + " ";
	    }
		
		for (i = (char) (xCord-1), j = yCord+1; i >= 'A' && j <= 8; i--,j++) { 
			output += i + "" + j + " ";
	    }
		
		return output.trim();
		
	}
	
	
}