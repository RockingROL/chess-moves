package main.java.chessMove;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Board {
	
	private Set<String> pieces = new HashSet<>(Arrays.asList("King", "Queen","Bishop","Horse","Rook","Pawn"));
	
	public boolean checkPiece(String piece) {
		return pieces.contains(piece);
	}
	
	public String[] getPieceAndMove(String input) {
		return input.split(" ", -1);
	}
	
	public Matcher getRowAndCol(String Move) {
		String pattern = "([A-Ha-h])([1-8])";
 		Pattern r = Pattern.compile(pattern);
 		return r.matcher(Move);
	}
	
}	