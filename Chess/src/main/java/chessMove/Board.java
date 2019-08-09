package main.java.chessMove;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Board {
	
	private Set<String> pieces = new HashSet<>(Arrays.asList("King", "Queen","Bishop","Horse","Rook","Pawn"));
	
	public String[] getPieceAndMove(String input) {
		String[] arrOfInput;
		try {
			arrOfInput = input.split(" ", 2);
			if (arrOfInput.length < 2) {
				System.out.println("Invalid input");
				return null;
			}
			return arrOfInput;
		}
		catch (NullPointerException e) {
			System.out.println("Input cannot be null");
			return null;
		}
	}
	
	public boolean checkPiece(String piece) {
		if(!pieces.contains(piece)) {
			System.out.println("Incorrect piece " + piece);
			return false;
		}
		return true;
	}
	
	public Matcher getRowAndCol(String move) {
		String regex = "([A-H])([1-8])";
 		Pattern pattern = Pattern.compile(regex);
 		try {
 			Matcher matcher = pattern.matcher(move);
 			if(matcher.find()) {
 				return matcher;
 			}
 			else {
 				System.out.println("Incorrect move " + move);
 				return null;
 			}
 		} catch (NullPointerException e) {
			System.out.println("Move cannot be null");
			return null;
		}
	}
	
	public String findAllPossibleMoves(String pieceName, Matcher arrOfMove) {
		Class cls;	Piece pi;
		try {
			cls = Class.forName("main.java.chessMove." + pieceName);
			pi = (Piece) cls.newInstance();
			return pi.possibleMoves(arrOfMove.group(1).charAt(0),Integer.parseInt(arrOfMove.group(2)));
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			System.out.println("Incorrect piece");
			return null;
		}
	}
}	