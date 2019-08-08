package main.java.chessMove;

public class KingAndHorseCommon implements Piece {
	
	private int pos[][] = null;
	
	public void setPosition(int pos_[][]) {
		pos = pos_;
	}
	
	@Override
	public String possibleMoves(char xCord, int yCord) {
		
		String output = "";
		for (int i = 0; i < pos.length; i++) { 
			  
	        int newXCord = xCord + pos[i][0]; 
	        int newYCord = yCord + pos[i][1]; 
	       
	        if (newXCord >= 'A' && newYCord >= 1 && newXCord <= 'H' && newYCord <= 8 ) 
	            output += (char)newXCord + "" + newYCord + " ";
	        
	    }
		return output.trim();
		
	}
	
	
}