/*
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[] board = new char[9];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<9; i++) {
            board[i] = scan.nextChar();
        }
        boolean hasCompleted = True;
        if(checkRow(board) || checkCol(board) || checkDiagonal(board)) {
            System.out.println("Game over");
        }
        else {
            for (char c : board) {
                if(c.equals('-')) {
                    System.out.println("Game Incomplete");
                    hasCompleted = False;
                    break;
                }
            }
            if(hasCompleted == True) {
                System.out.println("Game draw!!!!");
            }
        }

    }

    static public boolean checkRow(board) {
        for (i = 0; i<8; i = i+3) {
            if ((board[i].equals(board[i+1])) && (board[i+1].equals(board[i+2]))) {
                System.out.println("Player " + board[i] + " has won");
                return true;
            }
        }
        return false;
    }

    static public boolean checkCol(board) {
        for (i = 0; i<3; i++) {
            if ((board[i].equals(board[i+3])) && (board[i+3].equals(board[i+3]))) {
                System.out.println("Player " + board[i] + " has won");
                return true;
            }
        }
        return false;
    }

    static public boolean checkDiagonal (borad) {
            if (((board[0].equals(board[4])) && (board[4].equals(board[8]))) || (board[2].equals(board[4])) && (board[4].equals(board[6]))) {
                System.out.println("Player " + board[4] + " has won");
                return true;
            }
        return false;

    }

}*/
