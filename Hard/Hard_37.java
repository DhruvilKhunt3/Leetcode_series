package Leetcode_series.Hard;
class SudokuSolver {
    void solveSudoku(char[][] board){
        backtrack(board);
    }
    boolean backtrack(char[][] board) {
        for (int row=0;row<9;row++) {
            for (int col=0;col<9;col++){
                if (board[row][col]=='.'){
                    for (char num='1';num<='9';num++){
                        if (isValid(board,row,col,num)){
                            board[row][col]=num;  
                            if (backtrack(board)){  
                                return true;
                            }
                            board[row][col]='.';  
                        }
                    }
                    return false;  
                }
            }
        }
        return true; 
    }
    boolean isValid(char[][]board,int row,int col,char num) {
        for(int c=0;c<9;c++){
            if(board[row][c]==num){
                return false;
            }
        }
        for(int r=0;r<9;r++){
            if (board[r][col]==num){
                return false;
            }
        }
        int startRow=(row / 3)*3;
        int startCol =(col / 3)*3;
        for(int r=startRow;r<startRow+3;r++){
            for(int c=startCol;c<startCol+3;c++){
                if (board[r][c]==num) {
                    return false;
                }
            }
        }
        return true;  
    }
}
class Leetcode{
    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();
        
        char[][] board ={
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };  
        
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        solver.solveSudoku(board);
        System.out.println("<<------------------>>");
        for (int i=0;i<9;i++) {
            for (int j=0; j<9;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("<<------------------>>");
    }
}
