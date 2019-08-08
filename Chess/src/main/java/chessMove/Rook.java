package main.java.chessMove;

public class Rook implements Piece {
	
	@Override
	public String possibleMoves(char xCord, int yCord) {
		
		String output = "";
		
		for (int i = yCord + 1; i <= 8 ; i++) { 
			output += xCord + "" + i + " ";
	    }
		
		for (char i = (char) (xCord + 1); i <= 'H' ; i++) { 			
			output += i + "" + yCord + " ";	        
	    }
		
		for (int i = yCord - 1;  i >= 1 ; i--) { 			
			output += xCord + "" + i + " ";	        
	    }

		for (char i = (char) (xCord - 1); i >= 'A' ; i--) { 			
			output += i + "" + yCord + " ";        
	    }
		
		return output.trim();
		
	}
	
	
}