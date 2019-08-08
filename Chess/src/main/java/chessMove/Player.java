package main.java.chessMove;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Player {
	

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    	
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter input");
 		String input = sc.nextLine();
 		
 		Board bd = new Board();
 		
 		String[] arrOfInput = bd.getPieceAndMove(input);
 		
 		if (arrOfInput.length < 2)
 			System.exit(0);
 		
 		if (!bd.checkPiece(arrOfInput[0]))
 			System.exit(0);
 		
 		Matcher arrOfMove = bd.getRowAndCol(arrOfInput[1]);
 			
 		if (arrOfMove.find()) {
 			
 			Class cls = Class.forName("main.java.chessMove." + arrOfInput[0]);
 			Piece pi = (Piece) cls.newInstance();
 			
 			String output = pi.possibleMoves(arrOfMove.group(1).charAt(0),Integer.parseInt(arrOfMove.group(2)));
 			System.out.println(output);
 	
 		} else {
 					
 			System.out.println("Incorrect move " + arrOfInput[1]);
 		}
 	
    }
	
}