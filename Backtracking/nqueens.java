// package Backtracking;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.*;

// public class nqueens {
//     public boolean issafe(int row,int col,char[][] Board){
//         for(int j=0;j<Board.length;j++){
//             if(Board[row][j]=="Q"){
//                 return false;
//             }

//         }
//         for(int i=0;i<Board[0].length;i++){
//             if(Board[i][col]=="Q"){
//                 return false;
//             }
//         }
//         int r=row;
//         for(int c=col;c>=0 && r>=0;c--,r--){
//             if(Board[r][c]=="Q"){
//                 return false;
//             }
//         }
//         r=row;
//         for(int c=col;c<Board.length && r>=0;r--,c++){
//             if(Board[r][c]=="Q"){
//                 return false;
//             }
//         }

//         r=row;
//         for(int c=col;c>=0 && r<Board.length;r++,c--){
//             if(Board[r][c]=="Q"){
//                 return false;
//             }
//         }
//         r=row;
//         for(int c=col;c<Board.length && r<Board.length;r++,c++){
//             if(Board[r][c]=="Q"){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public void saveBoard(char[][] Board,List<List<String>>allBoards){
//         String row=" ";
//         List<String>newBoard =new ArrayList<>();
//         for(int i=0;i<Board.length;i++){
// row=" ";
// for(int j=0;j<Board[0].length;j++){
// if(Board[i][j]=="Q"){
//     row+="Q";
// }
// else{
//     row+=".";
// }
// newBoard.add(row);
// }
// allBoards.add(newBoard);
//         }
//     }
//     public void helper(char[][] board,List<List<String>>allBoards,int col){
//         if(col==Board.length){
//             saveBoard(Board,allBoards);
//             return;
//         }
// for(int row=0;row<board.length;row++){
//     if(issafe(row,col,Board)){
//         Board[row][col]="Q";
//         helper(Board,allBoards,col+1);
//         Board[row][col]=".";
//     }
// }
//     }
//     public List<List<String>> solveNQueens(int n){
//         List<List<String>>allBoards=new ArrayList<>();
//         char[][]Board=new Board[n][n];
//         helper(Board,allBoards,0);
//         return allBoards
//     }
// }
