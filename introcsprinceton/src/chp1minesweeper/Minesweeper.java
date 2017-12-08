package chp1minesweeper;

public class Minesweeper {
	public static void main(String[] args){
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		Double p = Double.parseDouble(args[2]);
		
	//  Prints Game Grid without Numbers 
	//  * is location of bomb, . is safe cells
		String[][] b = new String[m+2][n+2];
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				b[i][j] = Math.random()>p ? ".": "*";
			}
		}
	// Prints the uncounted array
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n ; j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		} 
	System.out.println();
	// Calculate number of bombs in vicinity
		String[][] g = new String[m+2][n+2];
		for (int i = 1; i <= m; i++){
			for (int j = 1; j <= n; j++){
				if (b[i][j] == "*"){ g[i][j] = b[i][j];
				}else{
					int cnt = 0;
					for (int x = i - 1; x <= i + 1; x++){
						for (int y = j - 1; y <= j + 1; y++){
							if (b[x][y] == "*"){
								cnt += 1;
							}
						}
					}
					g[i][j] = new Integer(cnt).toString();
				}
			}
		}
	// Prints the game array
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n ; j++){
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		} 
		
		
	}
}
