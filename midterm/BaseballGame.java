package midterm;

public class BaseballGame{
		
		private String[] teamNames = new String[2];
		protected int[][] scores;
		
		public BaseballGame() {
			scores = new int[2][9];
			for(int i = 0; i <=1 ; i++) {
				for(int j = 0; j < 9; j++) {
					scores[i][j] = 999;
				}
			}		
		}
		public void setTeam(int team, String name) {
			teamNames[team]= name;
		}
			
		public void setScores(int team, int index, int score) {
			if(index == 0 || (index < scores[team].length && scores[team][index - 1] != 999)) {
				scores[team][index] = score;
				if(scores[0][scores[0].length - 1] !=999 && scores[1][scores[1].length - 1] !=999)
					calculateScore(team);
			}
		}
		public void calculateScore(int team) {
			int result1 = 0; 
			int result2 = 0;
			for(int i = 0; i <=1; i++) {
				for(int j = 0; j < 9; j++) {
					switch(i) {
					case 0:
						result1 += scores[0][j];
						break;
					case 1:
						result2 += scores[1][j];
						break;
					}
				}
			}
			if(result1 > result2)
				System.out.println("Team " + teamNames[0] + " win!");
			else if(result1 < result2)
				System.out.println("Team " + teamNames[1] + " win!");
			else
				System.out.println("It's a tie!");
		}
		
		
	}

