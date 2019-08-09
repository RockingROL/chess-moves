package main.java.chessMove;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Player {
	
    public static void main(String[] args) {
 		
    	String input = null;
    	Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter input");
			input = sc.nextLine();
		} 
		finally {
			sc.close();
		}
 		
 		Board bd = new Board();
 		
		String[] arrOfInput = bd.getPieceAndMove(input.trim());
 		
 		if (arrOfInput == null)
 			System.exit(0);	
 		
 		if(!bd.checkPiece(arrOfInput[0]))
 			System.exit(0);
 	
 		Matcher arrOfMove = bd.getRowAndCol(arrOfInput[1]);
 		
 		if (arrOfMove == null)
 			System.exit(0);	
 		
 		String output = bd.findAllPossibleMoves(arrOfInput[0], arrOfMove);
 		
 		if (output != null)
 			System.out.println(output);
 	
    }
	
}