package algo;

public class PrintSpiralMatrix {
	
	private static int [][] a;
	private static int MAX;
	private static int currentCount = 1;
	private static int leftToRightRowIdx;
	private static int leftToRightStartColIdx;
	private static int leftToRightEndColIdx;
	private static int rightToLeftRowIdx;
	private static int rightToLeftStartColIdx;
	private static int rightToLeftEndColIdx;
	private static int topToBottomColIdx;
	private static int topToBottomStartRowIdx;
	private static int topToBottomEndRowIdx;
	private static int bottomToTopColIdx;
	private static int bottomToTopStartRowIdx;
	private static int bottomToTopEndRowIdx;
	
	
	
	public PrintSpiralMatrix(int n){
		MAX = n*n;
		leftToRightRowIdx = 0;
		leftToRightStartColIdx = 0;
		leftToRightEndColIdx = n-1;
		topToBottomColIdx = n-1;
		topToBottomStartRowIdx = 1;
		topToBottomEndRowIdx = n -1;
		rightToLeftRowIdx = n - 1;
		rightToLeftStartColIdx = n - 1;
		rightToLeftEndColIdx = 0;
		bottomToTopColIdx = 0;
		bottomToTopStartRowIdx = n - 2;
		bottomToTopEndRowIdx = 1;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintSpiralMatrix p = new PrintSpiralMatrix(4);
		
		while( currentCount <= MAX){
			if(currentCount > MAX) break;
			printHorizantalLeftToRight(leftToRightRowIdx, leftToRightStartColIdx, leftToRightEndColIdx, currentCount);
			if(currentCount > MAX) break;
			printVerticalTopToBottom(topToBottomColIdx, topToBottomStartRowIdx,topToBottomEndRowIdx, currentCount);
			if(currentCount > MAX) break;
			printHorizontalLeftToRight(rightToLeftRowIdx, rightToLeftStartColIdx, rightToLeftEndColIdx, currentCount);
			if(currentCount > MAX) break;
			printVerticalBottomToTop(bottomToTopColIdx, bottomToTopStartRowIdx, bottomToTopEndRowIdx, currentCount);
		}
		
		for(int i=0 ; i <= a.length ; i ++) {
			for(int j = 0; j<= a.length ; j++){
				System.out.print(a [i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void printHorizantalLeftToRight(int leftToRightRowIdx, int leftToRightStartColIdx, int leftToRightEndColIdx, int number){
		for(int col=leftToRightStartColIdx; col<= leftToRightStartColIdx; col++){
			a[leftToRightRowIdx][col] = number;
			number++;
		}
		currentCount = number;
		leftToRightRowIdx = 	leftToRightRowIdx + 1;
		leftToRightStartColIdx = leftToRightStartColIdx + 1;
		leftToRightEndColIdx = leftToRightEndColIdx - 1;
		
		
	}
	
	private static void printVerticalTopToBottom(int topToBottomColIdx, int topToBottomStartRowIdx, int topToBottomEndRowIdx, int number){
		for(int row=topToBottomStartRowIdx; row<= topToBottomEndRowIdx; row++){
			a[topToBottomColIdx][row] = number;
			number++;
		}
		currentCount = number;
		topToBottomColIdx = topToBottomColIdx - 1;
		topToBottomStartRowIdx = topToBottomStartRowIdx + 1;
		topToBottomEndRowIdx = topToBottomEndRowIdx - 1;
		
	}
	
	private static void printHorizontalLeftToRight(int rightToLeftRowIdx, int rightToLeftStartColIdx, int rightToLeftEndColIdx, int number){
		for(int col = rightToLeftStartColIdx; col >= rightToLeftEndColIdx; col -- ){
			a[rightToLeftRowIdx][col] = number;
			number++;
		}
		currentCount = number;
		rightToLeftRowIdx = rightToLeftRowIdx - 1;
		rightToLeftStartColIdx = rightToLeftStartColIdx - 1;
		rightToLeftEndColIdx = rightToLeftEndColIdx + 1;
		
		
	}
	
	private static void printVerticalBottomToTop(int bottomToTopColIdx, int bottomToTopStartRowIdx, int bottomToTopEndRowIdx, int number){
		for( int row = bottomToTopStartRowIdx ; row <= bottomToTopEndRowIdx ; row--){
			a[bottomToTopColIdx][row] = number;
			number++;
		}
		currentCount = number;
		bottomToTopColIdx = bottomToTopColIdx + 1;
		bottomToTopStartRowIdx = bottomToTopStartRowIdx - 1;
		bottomToTopEndRowIdx = bottomToTopEndRowIdx + 1;
		
	}
}
