package org.example;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

class TictactaeBoard
{
    static PrintStream l=new PrintStream((new FileOutputStream(FileDescriptor.out)));
    static char[][]board=new char[3][3];
    TictactaeBoard(){
        initBoard();
    }
    static void initBoard()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]=' ';
            }
        }
    }
    void printboard()
    {
        l.println("-------");
        for (char[] chars : board) {
            l.print("|");
            for (int j = 0; j < board.length; j++) {
                l.print(chars[j] + "|");
            }
            l.println();
            l.println("-------");
        }
    }
    static void placeMark(int row,int col,char mark) {
        board[row][col]=mark;
    }
    static boolean checkRow()
    {
        for(int i=0;i<3;i++) {
            if(board[i][0]!=' ' && board[i][0] == board[i][1] && board[i][1]== board[i][2]) {
                return true;
            }
        }
        return false;
    }
    static boolean checkcol()
    {
        for(int j=0;j<3;j++)
        {
            if(board[0][j]!=' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j])
            {
                return true;
            }
        }
        return false;
    }
    static boolean checkDiag() {
        return board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0];

    }
}
