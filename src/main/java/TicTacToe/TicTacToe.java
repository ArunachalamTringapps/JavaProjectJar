package org.example;

import java.util.Scanner;

public class TicTacToe
{
    public static void tictactoemain()
    {
        TictactaeBoard tic=new TictactaeBoard();
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        char mark;
        char mark1;
        int t=0;
        int count=0;
        tic.printboard();
        TictactaeBoard.l.println("Enter Player1");
        String name=scan.nextLine();
        TictactaeBoard.l.println("Choose X  OR O");
        mark=scan.next().charAt(0);
        HumanPlayer player1=new HumanPlayer(name,mark);

        TictactaeBoard.l.println("Enter Player2");
        String name1=scan1.nextLine();
        if(mark=='X') {
            mark1='O';
        }else {
            mark1='X';
        }
        HumanPlayer player2=new HumanPlayer(name1,mark1);

        HumanPlayer cp;
        cp = player1;

        while(t<9) {
            TictactaeBoard.l.println(cp.name + "Turn");
            cp.makeMove();
            tic.printboard();
            if(TictactaeBoard.checkRow() || TictactaeBoard.checkcol() || TictactaeBoard.checkDiag() )
            {
                TictactaeBoard.l.println(cp.name +"Win");
                count++;
                break;
            }
            else
            {
                t++;
                if(cp==player1)
                {
                    cp=player2;
                }
                else
                {
                    cp=player1;
                }
            }
        }
        if(count==0) {
            TictactaeBoard.l.println(cp.name +"Die");
        }
    }


}