package midterm;

import java.util.Scanner;
public class InterfaceBaseball {


	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			BaseballGame baseBall = new BaseballGame();
			System.out.print("Enter name of team number 1 >> ");
			baseBall.setTeam(0, sc.nextLine());
			//sc.next();
			for(int i = 0; i < 9; i++) {
				System.out.println("Please enter scores in game #" + (i+1));
				baseBall.setScores(0, i, sc.nextInt());
			}
			System.out.print("Enter name of the team number 2 >>");
			baseBall.setTeam(1, sc.nextLine());
			sc.next();
			for(int i = 0; i < 9; i++) {
				System.out.println("Please enter scores in game #" + (i+1));
				baseBall.setScores(1, i, sc.nextInt());
			}
		

	}
}
