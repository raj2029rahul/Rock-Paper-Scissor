import java.util.Scanner;
import java.util.Random;
class RPS{
	public static void main(String[] args){
		String user_move;
		String computer_move = "";
		int com_random_num;
		Scanner s=new Scanner(System.in);
		Random ran=new Random();
		System.out.println("lets play rock-paper-scissor game with computer!\n"+"please   enter your move\n"+"Rock=R,Paper=P,Scissor=S");
		System.out.println();
		com_random_num=ran.nextInt(3);
		if(com_random_num == 0)
			computer_move= "R";
		else if(com_random_num == 1)
			computer_move= "P";
		else if(com_random_num == 2)
			computer_move= "S";
		System.out.println("enter your move");
		user_move=s.next();
		user_move=user_move.toUpperCase();
		System.out.println("computer move is:" + computer_move);
		
		if(user_move.equals(computer_move))
			 System.out.println("Its a tie");
		else if(user_move.equals("R") && computer_move.equals("S"))
			System.out.println("you win");
		else if(user_move.equals("R") && computer_move.equals("P"))
			System.out.println("you loose");
		else if(user_move.equals("P") && computer_move.equals("R"))
			System.out.println("you win");
		else if(user_move.equals("P") && computer_move.equals("S"))
			System.out.println("you loose");
		else if(user_move.equals("S") && computer_move.equals("R"))
			System.out.println("you loose");
		else if(user_move.equals("S") && computer_move.equals("P"))
			System.out.println("you win");
		else
			System.out.println("Invalid move");
	}
}
