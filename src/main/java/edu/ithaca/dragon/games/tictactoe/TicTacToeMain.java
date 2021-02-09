package edu.ithaca.dragon.games.tictactoe;

import edu.ithaca.dragon.games.tictactoe.player.BrainDeadPlayer;
import edu.ithaca.dragon.games.tictactoe.player.HumanPlayer;
import edu.ithaca.dragon.games.tictactoe.player.RuleBasedKemiPlayer;
import edu.ithaca.dragon.games.tictactoe.player.SRPlayer;
public class TicTacToeMain {
    public static void main (String[] args){
        // new TicTacToeGame( new RuleBasedKemiPlayer(), new SRPlayer()).play();
        // new TicTacToeGame( new BrainDeadPlayer(), new RuleBasedKemiPlayer()).play();
        new TicTacToeGame(new RuleBasedKemiPlayer(), new HumanPlayer()).play();

    }
    
}
