package LeetCode;

public class WordSearch {
	public static void main(String[] args) {
		char b[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

		String word = "ABCB";
		System.out.println(searchBoard(b, word));

	}

	private static boolean searchBoard(char[][] b, String word) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				if (b[i][j] == word.charAt(0))
				if (dfs(b, word, i, j, 0))
					return true;
			}
		}

		return false;
	}

	private static boolean dfs(char[][] b, String word, int i, int j, int k) {
	
		if(k==word.length())
		return true;
	
		if(i<0||j<0||i>=b.length || j>=b[0].length||word.charAt(k)!=b[i][j] )
			return false;
		
		char temp=b[i][j];
		b[i][j]=' ';
		boolean f=dfs(b,word,i,j+1,k+1)||dfs(b,word,i-1,j,k+1)||dfs(b,word,i+1,j,k+1)||dfs(b,word,i,j-1,k+1);
		b[i][j]=temp;
		return f;
	}
}
