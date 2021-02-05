package edu.ithaca.dragon.games.tictactoe;

import edu.ithaca.dragon.games.tictactoe.player.BrainDeadPlayer;
import edu.ithaca.dragon.games.tictactoe.player.HumanPlayer;
import edu.ithaca.dragon.games.tictactoe.player.KemiPlayer;

public class TicTacToeMain {
    public static void main (String[] args){
        new TicTacToeGame( new KemiPlayer(), new HumanPlayer()).play();
        //new TicTacToeGame( new BrainDeadPlayer(), new RuleBasedPlayer()).play();

    }
    
}
