package GameOfLife;

	import java.awt.Point;
	import java.util.ArrayList;

	public class RulesOfLife {
		public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
        	// Iterate through the array, follow game of life rules
       		for (int i=1; i<gameBoard.length-1; i++) {
            	for (int j=1; j<gameBoard[0].length-1; j++) {
	                int surrounding = 0;
	                if (gameBoard[i-1][j-1]) { surrounding++; }
	                if (gameBoard[i-1][j])   { surrounding++; }
	                if (gameBoard[i-1][j+1]) { surrounding++; }
	                if (gameBoard[i][j-1])   { surrounding++; }
	                if (gameBoard[i][j+1])   { surrounding++; }
	                if (gameBoard[i+1][j-1]) { surrounding++; }
	                if (gameBoard[i+1][j])   { surrounding++; }
	                if (gameBoard[i+1][j+1]) { surrounding++; }
	                
//					if((gameBoard[i][j]) && (surrounding > 3 &&surrounding > 2)){
//						survivingCells.add(new Point(i-1,j-1));
//					}	
//					if((gameBoard[i][j]) && (surrounding == 2)){
//						survivingCells.remove(new Point(i-1,j-1));
//					}	
//					if(!(gameBoard[i][j]) && (surrounding < 8)){
//						survivingCells.add(new Point(i-1,j-1));
//					}	
			
				}
			}
	
	
		}
		public static void addPointsToGrid(ArrayList<Point> cellsToAdd) {
//			cellsToAdd.add(new Point(0,0));
//			cellsToAdd.add(new Point(2,4));
//			for(int row = 2; row <= 3; row++) {
//				for(int col = 3; col <= 5; col++) {
//					cellsToAdd.add(new Point(row,col));
//				}
//			}
	  	}
	}

