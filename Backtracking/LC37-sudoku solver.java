class Solution {
    public void solveSudoku(char[][] board) {
     solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                //if number not present try 1-9
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        //if that chosen number valid then give the resultant board to solve it
                        if(isValid(board,i,j,ch)){
                            board[i][j]=ch;
                            if(solve(board)){
                                return true;
                            }
                        }
                        //if wrong char then undo
                        board[i][j]='.';
                    }return false;
                }
            }
        }return true;
    }
    public boolean isValid(char[][] board,int row,int col,char ch){
      for(int i=0;i<9;i++){
        //col check
        if(board[row][i]==ch){
          return false;
        }
        //row check
        if(board[i][col]==ch){
          return false;
        }
        //grid check: size=9x9 so here 3 
        int r=3*(row/3)+i/3;
        int c=3*(col/3)+i%3;
        if(board[r][c]==ch){
          return false;
        }
      }
      return true;
    }
}
