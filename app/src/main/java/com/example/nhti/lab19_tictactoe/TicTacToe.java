package com.example.nhti.lab19_tictactoe;

/**
 * Created by nhti on 11/2/2017.
 */

class TicTacToe {
    public static final int SIDE = 3;
    private int turn;
    private int [][] game;

    public TicTacToe(){
        game = new int[SIDE][SIDE];
        resetGame();
    } // End of constructor

    public int play(int row, int col){
        int currentTurn = turn;
        if(row >= 0 && col >= 0 && row < SIDE && col < SIDE && game[row][col] == 0)
        {
            if (turn == 1)
            {
                turn = 2;
            }
            else
            {
                turn = 1;
            }
            return currentTurn;
        }
        else return 0;
    } // End of play()

    /*public int whoWon()
    {
        int rows = checkRows();
        if (rows > 0)
            return rows;
        int columns = checkColumns();
        if (columns > 0)
            return columns;
        int diagonals = checkDiagonals();
        if (diagonals > 0)
            return diagonals;
        return 0;
    } // End of whoWon()*/

    private void resetGame() {

    }
}// end of class
