package edu.ithaca.dragon.games.tictactoe.player;

import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;

public class KemiPlayer implements TicTacToePlayer {

    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
        if (curBoard.isSquareOpen(new Pair<>(1,1))== true){
            return new Pair<>(1,1);
        }
        else{
            Integer x = (int) Math.round(Math.random());
            Integer y = (int) Math.round(Math.random());
            if(x == 1){
                x = 2;
            }
            if (y==1){
                y=2;
            }
            while((curBoard.isSquareOpen(new Pair<>(0,0)) || curBoard.isSquareOpen(new Pair<>(0,2)) || curBoard.isSquareOpen(new Pair<>(2,0)) || curBoard.isSquareOpen(new Pair<>(2,2))) != false){
                x = (int) Math.round(Math.random());
                y = (int) Math.round(Math.random());
                if(x == 1){
                    x = 2;
                }
                if (y==1){
                    y=2;
                }    
            if(curBoard.isSquareOpen(new Pair<>(x,y)) == true){
                return new Pair<> (x,y);
            }
        }
        while(curBoard.isSquareOpen(new Pair<>(x,y))==false){
            for (y=0; y<3; y++){
                for(x=0; x<3;x++){
                    if (curBoard.isSquareOpen(new Pair<>(x,y))){
                        return new Pair<>(x,y);
                    }
                }
            }
        }
        throw new IllegalArgumentException("Board with no moves given to player:\n" + curBoard.displayString());
      }
    }
}
